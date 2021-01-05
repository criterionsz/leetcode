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

    /*
        709. Implement function ToLowerCase() that has a string parameter str, and returns the same string in lowercase.
   */
    fun toLowerCase(str: String): String =
        str.toLowerCase()

    /*
       1389. Create Target Array in the Given Order
  */
    fun createTargetArray(nums: IntArray, index: IntArray): IntArray {
        val target = mutableListOf<Int>()
        for (i in nums.indices) {
            target.add(index[i], nums[i])
        }
        return target.toIntArray()
    }

    /*
      1684. Count the Number of Consistent Strings
    */
    fun countConsistentStrings(allowed: String, words: Array<String>): Int =
        words.count { word ->
            word.all {
                allowed.contains(it)
            }
        }

    /*
      1486. XOR Operation in an Array
 */
    fun xorOperation(n: Int, start: Int): Int {
        var res = start
        for (i in 1 until n) {
            res = res.xor(start + 2 * i)
        }
        return res
    }

    /*
     1512. Number of Good Pairs
    */
    fun numIdenticalPairs(nums: IntArray): Int {
        var countPairs = 0
        for (i in nums.indices) {
            for (j in (i + 1) until nums.size) {
                if (nums[i] == nums[j])
                    countPairs++
            }
        }
        return countPairs
    }

    /*
   1512. Number of Good Pairs
  */
    fun balancedStringSplit(s: String): Int {
        var l = 0
        var r = 0
        var res = 0
        for (i in s) {
            if (i == 'R')
                r++
            else
                l++
            if (l == r) {
                res++
                l = 0
                r = 0
            }
        }
        return res
    }

    /*
        1662. Check If Two String Arrays are Equivalent
  */
    fun arrayStringsAreEqual(word1: Array<String>, word2: Array<String>): Boolean =
        word1.joinToString(separator = "").equals(word2.joinToString(separator = ""))

    /*
      1295. Find Numbers with Even Number of Digits
    */
    fun findNumbers(nums: IntArray): Int =
        nums.count { it.toString().length % 2 == 0 }

    /*
      1534. Count Good Triplets
    */
    fun countGoodTriplets(arr: IntArray, a: Int, b: Int, c: Int): Int {
        var count = 0
        for (i in arr.indices)
            for (j in (i + 1) until arr.size)
                for (k in (j + 1) until arr.size) {
                    if (Math.abs(arr[i] - arr[j]) <= a && Math.abs(arr[j] - arr[k]) <= b && Math.abs(arr[i] - arr[k]) <= c)
                        count++
                }
        return count
    }

    /*
         1588. Sum of All Odd Length Subarrays
    */
    fun sumOddLengthSubarrays(arr: IntArray): Int {
        var sum = arr.sum()
        var sub = 3
        for (i in arr.indices) {
            for (j in 0..(arr.size - sub)) {
                var temp = sub
                while (temp > 0) {
                    sum += arr[j + temp - 1]
                    temp--
                }
            }
            sub += 2

        }
        return sum
    }


}
