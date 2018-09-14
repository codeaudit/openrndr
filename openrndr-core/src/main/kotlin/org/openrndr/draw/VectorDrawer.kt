package org.openrndr.draw

import org.openrndr.color.ColorRGBa
import org.openrndr.math.Matrix44
import org.openrndr.math.Vector2
import org.openrndr.shape.Composition
import org.openrndr.shape.LineSegment
import org.openrndr.shape.Shape
import org.openrndr.shape.ShapeContour

interface VectorDrawer {

    var model: Matrix44

    var fill: ColorRGBa?
    var stroke: ColorRGBa?
    var strokeWeight: Double

    fun contour(contour: ShapeContour)
    fun shape(shape: Shape)
    fun contours(contours: List<ShapeContour>)
    fun lineSegment(x0: Double, y0: Double, x1: Double, y1: Double)
    fun lineSegment(lineSegment: LineSegment)
    fun lineSegment(start: Vector2, end: Vector2)

    fun lineSegments(segments: List<Vector2>)
    fun lineSegments(segments: List<Vector2>, weights: List<Double>)
    fun lineLoop(points: List<Vector2>)
    fun lineLoops(loops: List<List<Vector2>>)
    fun lineLoops(loops: List<List<Vector2>>, weights: List<Double>)
    fun lineStrip(points: List<Vector2>)
    fun lineStrips(strips: List<List<Vector2>>)
    fun lineStrips(strips: List<List<Vector2>>, weights: List<Double>)
    fun composition(composition: Composition)
    fun scale(x: Double, y: Double)
    fun scale(s: Double)

    fun translate(t: Vector2)
    fun rotate(rotationInDegrees: Double)
    fun pushModel(): Matrix44
    fun popModel()
}