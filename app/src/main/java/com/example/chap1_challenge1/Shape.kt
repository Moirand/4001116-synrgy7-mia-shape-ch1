package com.example.challenge1

interface Shape{
    fun create()
}

class FilledTriangle(val component: Char, val rows: Byte) : Shape {
    override fun create() {
        for (i in 1..rows) {
            for (j in 1..(rows - i)) print(" ")
            for (j in 1..<2 * i) print(component)
            println()
        }
    }
}

class FilledTriangleUpsideDown(val component: Char, val rows: Byte) : Shape {
    override fun create() {
        for (i in rows downTo 1) {
            for (j in 1..(rows - i)) print(" ")
            for (j in 1..<2 * i) print(component)
            println()
        }
    }
}

class FilledKite(val component: Char, val rows: Byte) : Shape {
    override fun create() {
        for (i in 1..rows) {
            for (j in 1..rows - i) print(" ")
            for (j in 1..<2 * i) print(component)
            println()
        }
        for (i in rows - 1 downTo 1) {
            for (j in 1..rows - i) print(" ")
            for (j in 1..<2 * i) print(component)
            println()
        }
    }
}

class X(val component: Char, val rows: Byte) : Shape {
    override fun create() {
        for (i in 1..rows) {
            for (j in 1..rows) {
                if (i == j || j == rows - i + 1) print(component) else print(" ")
            }
            println()
        }
    }
}

class StrokeTriangle(val component: Char, val rows: Byte) : Shape {
    override fun create() {
        for (i in 1..<rows) {
            for (j in 1..<rows + i) {
                if ((j == rows + (i-2) && i > 1) || j == rows - (i-1)) print(component)
                print(" ")
            }
            println()
        }
        for (x in 1..rows) {
            print(component)
            print(" ")
        }
        println()
    }
}