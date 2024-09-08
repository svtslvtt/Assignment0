class EquilateralTriangle(_name: String) : Triangle(_name) {

    var side: Double = 0.0

    fun setDimensions(_side: Double) {

        side = _side
    }

        override fun getArea(): Double {
            return ((side*side*side)/2)
        }

    override fun printDimensions()
    {
        println("\nShape: equilateral triangle")
        println("Side: $side")
        println("Area: ${getArea()}")
    }

    }


