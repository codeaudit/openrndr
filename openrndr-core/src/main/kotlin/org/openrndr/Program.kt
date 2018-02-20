package org.openrndr

import org.openrndr.draw.Drawer
import org.openrndr.events.Event
import org.openrndr.internal.Driver
import org.openrndr.math.IntVector2
import org.openrndr.math.Vector2

import java.io.File

enum class UnfocusBehaviour {
    NORMAL,
    THROTTLE
}

class Configuration {

    /**
     * The preferred window width
     */
    var width: Int = 640

    /**
     * The preferred window height
     */
    var height: Int = 480

    /**
     * The window title
     */
    var title: String = "OpenRNDR"

    /**
     * Should debug mode be used?
     */
    var debug: Boolean = false
    var trace: Boolean = false

    /**
     * Should window decorations be hidden?
     */
    var hideWindowDecorations = false

    /**
     * Should the window be made fullscreen?
     */
    var fullscreen = false

    /**
     * Should the window be made visible before calling setup?
     */
    var showBeforeSetup = true

    /**
     * Should the cursor be hidden?
     */
    var hideCursor = false

    /**
     * The window position. The window will be placed in the center of the primary screen when set to null
     */
    var position: IntVector2? = null

    var unfocusBehaviour = UnfocusBehaviour.NORMAL

}

fun configuration(builder:Configuration.()->Unit):Configuration {
    return Configuration().apply(builder)
}

enum class KeyboardModifier(val mask: Int) {
    SHIFT(1),
    CTRL(2),
    ALT(4),
    SUPER(8)
}

enum class MouseButton {
    LEFT,
    RIGHT,
    CENTER,
    NONE
}

enum class MouseEventType {
    MOVED,
    DRAGGED,
    CLICKED,
    BUTTON_UP,
    BUTTON_DOWN,
    SCROLLED,
}

enum class KeyEventType {
    KEY_DOWN,
    KEY_UP,
    KEY_REPEAT,
}

class KeyEvent(val type: KeyEventType, val key: Int, val scanCode: Int, val name: String, val modifiers: Set<KeyboardModifier>, var propagationCancelled: Boolean = false) {
    fun cancelPropagation() {
        propagationCancelled = true
    }
}

enum class WindowEventType {
    MOVED,
    RESIZED,
    FOCUSED,
    UNFOCUSED,
}

class WindowEvent(val type: WindowEventType, val position: Vector2, val size: Vector2, val focused: Boolean)

class DropEvent(val position:Vector2, val files:List<File>)

val KEY_ARROW_LEFT = 263
val KEY_ARROW_RIGHT = 262

open class Program {

    var width = 0
    var height = 0


    lateinit var drawer: Drawer
    lateinit var driver: Driver

    lateinit var application: Application

    val seconds: Double
        get() = application.seconds

    inner class Clipboard {
        var contents: String?
            get() {
                return application.clipboardContents
            }
            set(value) {
                application.clipboardContents = contents
            }
    }

    val clipboard = Clipboard()
    private val extensions = mutableListOf<Extension>()

    fun extend(extension: Extension) {
        extensions+=extension
        extension.setup(this)
    }

    inner class Window {

        var title: String
            get() = application.windowTitle
            set(value) {
                application.windowTitle = value
            }

        var size = Vector2(0.0, 0.0)
        var scale = Vector2(1.0, 1.0)

        val focused = Event<WindowEvent>().postpone(true)
        val unfocused = Event<WindowEvent>().postpone(true)
        val moved = Event<WindowEvent>().postpone(true)
        val sized = Event<WindowEvent>().postpone(true)

        val drop = Event<DropEvent>().postpone(true)

        var position:Vector2
            get() = application.windowPosition
        set(value) {
            application.windowPosition = value
        }
    }

    val window = Window()

    class Keyboard {
        val keyDown = Event<KeyEvent>().postpone(true)
        val keyUp = Event<KeyEvent>().postpone(true)
        val keyRepeat = Event<KeyEvent>().postpone(true)
    }

    val keyboard = Keyboard()


    class Mouse {
        class MouseEvent(val position: Vector2, val rotation: Vector2, val type: MouseEventType, val button: MouseButton, val modifiers: Set<KeyboardModifier>, var propagationCancelled:Boolean = false) {
            fun cancelPropagation() {
                propagationCancelled = true
            }
        }

        var position = Vector2(0.0, 0.0)

        val buttonDown = Event<MouseEvent>().postpone(true)
        val buttonUp = Event<MouseEvent>().postpone(true)
        val dragged = Event<MouseEvent>().postpone(true)
        val moved = Event<MouseEvent>().postpone(true)
        val scrolled = Event<MouseEvent>().postpone(true)
        val clicked =  Event<MouseEvent>().postpone(true)
    }

    val mouse = Mouse()

    open fun setup() {}

    /**
    * This is the draw call that is called by Application. It takes care of handling extensions.
    */
    fun drawImpl() {
        extensions.forEach { it.beforeDraw(drawer, this) }
        draw()
        extensions.reversed().forEach { it.afterDraw(drawer, this) }
    }
    /**
    * This is the user facing draw call. It should be overridden by the user.
    */
    open fun draw() {}

}