open class Triangle(_name: String) : Shape(_name), Dimensionable
{

    private var a: Double = 0.0
    private var b: Double = 0.0
    private var c: Double = 0.0
    private var s: Double = 0.0

    fun setDimensions(side1: Double, side2: Double, side3: Double)
    {
        a = side1
        b = side2
        c = side3
    }

    override fun getArea(): Double {
        s = a*b*c
        return kotlin.math.sqrt((s*(s-a)*(s-b)*(s-c)))
    }

    override fun printDimensions() {
        println("\nShape: triangle")
        println("Side 1: $a")
        println("Side 2: $b")
        println("Side 3: $c")
        println("Area: ${getArea()}")

    }
}