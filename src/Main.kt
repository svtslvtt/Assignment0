fun main() {

    //Creating an object of type Shape
    val square : Shape = Square("square")
    val circle : Shape = Circle("circle")
    val triangle : Shape = Triangle("triangle")
    val equilateralTriangle : Triangle = EquilateralTriangle("equilateral-triangle")

    println("\nEnter dimensions of a square.")
        print("Length: ")
        val length: Double = readLine()!!.toDouble()
        print("Height: ")
        val height: Double = readLine()!!.toDouble()

    //casting because I do not know how else to make it work.
    //the next line basically says that square is of a type Square
    //it allows to call on functions within class Square

        (square as Square).setDimensions(length, height)


    println("\nEnter dimensions of a circle. ")
        print("Radius: ")
        val radius: Double = readLine()!!.toDouble()

    //the next line basically says that circle is of a type Circle
    //it allows to call on functions within class Circle

        (circle as Circle).setDimensions(radius)

    println("\nEnter dimensions of a triangle. ")

        print("side 1: ")
        val side1: Double = readLine()!!.toDouble()

        print("side2: ")
        val side2: Double = readLine()!!.toDouble()

        print("side3: ")
        val side3: Double = readLine()!!.toDouble()

    //the next line basically says that triangle is of a type Triangle
    //it allows to call on functions within class Triangle

        (triangle as Triangle).setDimensions(side1, side2, side3)

    println("\nEnter dimensions of an equilateral triangle. ")

        print("Side: ")
        val side: Double = readLine()!!.toDouble()

    //the next line specifies that equilateralTriangle is of type EquilateralTriangle
    //it allows to call on functions within class EquilateralTriangle

        (equilateralTriangle as EquilateralTriangle).setDimensions(side)


    //displaying dimensions of each shape
    square.printDimensions()
    circle.printDimensions()
    triangle.printDimensions()
    equilateralTriangle.printDimensions()

    }
