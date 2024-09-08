class Circle(_name: String) : Shape(_name), Dimensionable
{
    private var radius: Double = 0.0

    fun setDimensions(_radius:Double) {
        radius = _radius
    }

   override fun getArea(): Double {
        return radius * radius * Math.PI
    }

   override fun printDimensions() {
        println("\nShape: circle")
        println("Radius: $radius")
        println("Area: ${getArea()}")
    }
}