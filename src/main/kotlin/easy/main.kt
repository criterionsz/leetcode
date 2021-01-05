package easy

fun main() {
    val t = 'a'.toInt() + 1
    println(t)
    println(Solution.minTimeToVisitAllPoints(arrayOf(intArrayOf(1, 1), intArrayOf(3, 4), intArrayOf(-1, 0))))
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
}