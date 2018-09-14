package org.openrndr.draw

import org.openrndr.color.ColorRGBa
import org.openrndr.math.Matrix44
import org.openrndr.math.Vector2
import org.openrndr.math.transforms.rotateZ
import org.openrndr.shape.*
import java.util.*

class CompositionDrawer: VectorDrawer {
    override var model: Matrix44 = Matrix44.IDENTITY

    override var fill: ColorRGBa? = ColorRGBa.WHITE
    override var stroke: ColorRGBa? = ColorRGBa.BLACK
    override var strokeWeight: Double = 1.0

    val root = GroupNode()
    val composition = Composition(root)

    private var cursor = root
    private val modelStack = Stack<Matrix44>()

    override fun contour(contour: ShapeContour) {
        val node = ShapeNode(Shape(listOf(contour)))
        node.transform = model
        cursor.children.add(node)
    }

    override fun contours(contours: List<ShapeContour>) {
        val group = GroupNode()
        group.transform = model
        group.children.addAll(contours.map { contour ->
            val node = ShapeNode(Shape(listOf(contour)))
            node.transform = model
            node
        })
        cursor.children.add(group)
    }

    override fun shape(shape: Shape) {
        val node = ShapeNode(shape)
        node.transform = model
        cursor.children.add(node)
    }

    override fun lineSegment(x0: Double, y0: Double, x1: Double, y1: Double) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun lineSegment(lineSegment: LineSegment) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun lineSegment(start: Vector2, end: Vector2) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun lineSegments(segments: List<Vector2>) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun lineSegments(segments: List<Vector2>, weights: List<Double>) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun lineLoop(points: List<Vector2>) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun lineLoops(loops: List<List<Vector2>>) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun lineLoops(loops: List<List<Vector2>>, weights: List<Double>) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun lineStrip(points: List<Vector2>) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun lineStrips(strips: List<List<Vector2>>) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun lineStrips(strips: List<List<Vector2>>, weights: List<Double>) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun composition(composition: Composition) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun scale(x: Double, y: Double) {
        model *= org.openrndr.math.transforms.scale(x, y, 1.0)
    }

    override fun scale(s: Double) {
        model *= org.openrndr.math.transforms.scale(s, s, s)
    }

    override fun translate(t: Vector2) {
        model *= org.openrndr.math.transforms.translate(t.vector3())
    }

    override fun rotate(rotationInDegrees: Double) {
        model *= rotateZ(rotationInDegrees)
    }

    override fun pushModel(): Matrix44 {
        modelStack.push(model)
        return model
    }

    override fun popModel() {
        model = modelStack.pop()
    }
}