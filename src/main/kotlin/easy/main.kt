package easy

fun main() {
    println(Solution.maximumWealth(arrayOf(intArrayOf(1, 3, 4, 5), intArrayOf(3, 4, 5, 10))))
    println(Solution.shuffle(intArrayOf(2, 5, 1, 3, 4, 7), 3))
    println(Solution.defangIPaddr("1.1.1.1"))
    val parkingSystem = ParkingSystem(1, 1, 0)
    parkingSystem.addCar(1) // return true because there is 1 available slot for a big car

    parkingSystem.addCar(2) // return true because there is 1 available slot for a medium car

    parkingSystem.addCar(3) // return false because there is no available slot for a small car

    parkingSystem.addCar(1) // return false because there is no available slot for a big car. It is already occupied.

    println(Solution.restoreString("codeleet", intArrayOf(4, 5, 6, 7, 0, 2, 1, 3)))
    println(Solution.subtractProductAndSum(234))
    println(Solution.smallerNumbersThanCurrent(intArrayOf(8, 1, 2, 2, 3)).joinToString())
    println(Solution.countConsistentStrings("cad", arrayOf("cc", "acd", "b", "ba", "bac", "bad", "ac", "d")))
    println(Solution.xorOperation(1, 7))
    println(Solution.numIdenticalPairs(intArrayOf(1, 2, 3)))
    println(Solution.sumOddLengthSubarrays(intArrayOf(1, 4, 2, 5, 3)))
    print(
        Solution.uniqueMorseRepresentations(
            arrayOf(
                "gin", "zen", "gig", "msg"
            )
        )
    )
    print(Solution.removeOuterParentheses("(()())(())"))
    print(Solution.selfDividingNumbers(1, 22))
    println(Solution.busyStudent(intArrayOf(1, 2, 3), intArrayOf(3, 2, 7), 4))
    println(
        Solution.diagonalSum(
            arrayOf(
                intArrayOf(7, 3, 1, 9),
                intArrayOf(3, 4, 6, 9),
                intArrayOf(6, 9, 6, 6),
                intArrayOf(9, 5, 8, 5)
            )
        )
    )
    println(Solution.repeatedNTimes(intArrayOf(1, 2, 3, 3)))
//    println(
//        Solution.destCity(
//            arrayListOf(
//                arrayListOf("qMTSlfgZlC", "ePvzZaqLXj"),
//                arrayListOf("xKhZXfuBeC", "TtnllZpKKg"),
//                arrayListOf("ePvzZaqLXj", "sxrvXFcqgG"),
//                arrayListOf("sxrvXFcqgG", "xKhZXfuBeC"),
//                arrayListOf("TtnllZpKKg", "OAxMijOZgW"),
//            )
//        )
//    )


}