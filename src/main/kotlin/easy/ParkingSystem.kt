package easy

class ParkingSystem(big: Int, medium: Int, small: Int) {
    var b = big
    var m = medium
    var s = small
    fun addCar(carType: Int): Boolean {
        return when (carType) {
            1 -> {
                (b-- > 0)
            }
            2 -> {
                (m-- > 0)
            }
            3 -> {
                (s-- > 0)
            }
            else -> throw IllegalArgumentException()
        }

    }

}