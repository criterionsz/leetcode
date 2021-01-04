package easy

object Solution {
    /*
        1672. Richest Customer Wealth
    */
    fun maximumWealth(accounts: Array<IntArray>): Int =
        accounts.map { it.sum() }.maxOrNull() ?: 0

    /*
        1431. Kids With the Greatest Number of Candies
     */
    fun kidsWithCandies(candies: IntArray, extraCandies: Int): BooleanArray {
        val max = candies.maxOrNull() ?: 0
        return candies.map { (it + extraCandies) >= max }.toBooleanArray()
    }

    /*
       1470. Shuffle the Array
     */

    fun shuffle(nums: IntArray, n: Int): IntArray {
        val sizeArr = 2 * n
        val newNums = IntArray(sizeArr)
        var j = n
        var k = 0
        for (i in 0 until n) {
            newNums[k] = nums[i]
            newNums[k + 1] = nums[j++]
            k += 2

        }
        return newNums
    }

    /*
     1108. Defanging an IP Address
   */
    fun defangIPaddr(address: String): String =
        address.replace(".", "[.]")

    /*
       1678. Goal Parser Interpretation
     */
    fun interpret(command: String): String =
        command.replace("()", "o").replace("(al)", "al")

    /*
      1678. Shuffle String
    */
    fun restoreString(s: String, indices: IntArray): String {
        val t = CharArray(s.length)
        for (i in s.indices) {
            t[indices[i]] = s[i]
        }
        return t.joinToString(separator = "")
    }

    /*
       1342. Number of Steps to Reduce a Number to Zero
   */
    fun numberOfSteps(num: Int): Int {
        var numTemp = num
        var count = 0
        while (numTemp != 0) {
            if (numTemp % 2 == 0) {
                numTemp /= 2
            } else {
                numTemp--
            }
            count++

        }
        return count
    }

    /*
          1281. Subtract the Product and Sum of Digits of an Integer
      */
    fun subtractProductAndSum(n: Int): Int {
        var prod = 1
        var sum = 0
        var num = n
        while (num > 0) {
            prod *= num % 10
            sum += num % 10
            num /= 10
        }
        return prod - sum
    }

    /*
       1313. Decompress Run-Length Encoded List
    */
    fun decompressRLElist(nums: IntArray): IntArray {
        val lst = arrayListOf<Int>()
        for (i in (0 until nums.size - 1) step 2) {
            for (j in 0 until nums[i]) {
                lst.add(nums[i + 1])
            }
        }
        return lst.toIntArray()
    }

    /*
         1365. How Many Numbers Are Smaller Than the Current Number
    */
    fun smallerNumbersThanCurrent(nums: IntArray): IntArray =
        nums.map { num -> nums.count { num > it } }.toIntArray()

}
