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

    fun rangeSumBST(root: TreeNode?, low: Int, high: Int): Int {
        if (root == null) return 0
        if (root.`val` > high) return rangeSumBST(root.left, low, high)
        if (root.`val` < low) return rangeSumBST(root.right, low, high)
        return root.`val` + rangeSumBST(root.left, low, high) + rangeSumBST(root.right, low, high)
    }

    /*
      1688. Count of Matches in Tournament
 */
    fun numberOfMatches(n: Int): Int {
        var sum = 0
        var teams = n
        while (teams > 1) {
            when (teams % 2) {
                0 -> {
                    sum += teams / 2
                    teams /= 2

                }
                1 -> {
                    sum += (teams - 1) / 2
                    teams = (teams - 1) / 2 + 1

                }
            }

        }
        return sum

    }

    fun maxDepth(s: String): Int {
        var max = 0
        var counter = 0
        for (i in s) {
            if (i == '(') {
                counter++
            }
            if (i == ')') {
                if (max < counter) {
                    max = counter
                }
                counter--
            }

        }
        return max
    }

    //1266
    fun minTimeToVisitAllPoints(points: Array<IntArray>): Int {
        var sum = 0
        for (i in 0 until points.size - 1) {
            sum += Math.max(
                Math.abs(points[i + 1][0] - points[i][0]),
                Math.abs(points[i + 1][1] - points[i][1])
            )

        }
        return sum
    }

    fun sumZero(n: Int): IntArray {
        val arr = IntArray(n)
        var k = 1
        for (i in 0 until arr.size - 1 step 2) {
            arr[i] = k
            arr[i + 1] = k * -1
            k++
        }
        if (n % 2 == 1) {
            arr[n - 1] = 0
        }
        return arr
    }

    //832
    fun flipAndInvertImage(A: Array<IntArray>): Array<IntArray> =
        A.map {
            it.reverse()
            it.map {
                when (it) {
                    1 -> 0
                    else -> 1
                }
            }.toIntArray()
        }.toTypedArray()

    val morseCode = arrayListOf(
        ".-",
        "-...",
        "-.-.",
        "-..",
        ".",
        "..-.",
        "--.",
        "....",
        "..",
        ".---",
        "-.-",
        ".-..",
        "--",
        "-.",
        "---",
        ".--.",
        "--.-",
        ".-.",
        "...",
        "-",
        "..-",
        "...-",
        ".--",
        "-..-",
        "-.--",
        "--.."
    )

    //804
    fun uniqueMorseRepresentations(words: Array<String>): Int {
        val set = mutableSetOf<String>()
        for (i in words) {
            var code = ""
            for (j in i) {
                code += morseCode[j.toInt() - 97]
            }
            set.add(code)
        }
        return set.size
    }

    fun removeOuterParentheses(S: String): String {
        var counter = 0
        var p = 0
        val res = StringBuilder()
        for (i in S.indices) {
            if (S[i] == '(')
                counter++
            if (S[i] == ')')
                counter--
            if (counter == 0) {
                res.append(S.substring(p + 1, i))
                p = i + 1
            }

        }
        return res.toString()
    }

    fun generateTheString(n: Int): String {
        if (n % 2 == 1) {
            return "q".repeat(n)
        } else {
            return "q".repeat(n - 1) + "z"
        }
    }

    fun maxProduct(nums: IntArray): Int {
        var a = 0
        var b = 0
        for (i in nums) {
            if (a < i) {
                if (b < a) {
                    b = a
                }
                a = i

            } else if (b < i) {
                b = i
            }
        }
        return (a - 1) * (b - 1)
    }

    //728
    fun selfDividingNumbers(left: Int, right: Int): List<Int> {
        fun div(num: Int): Boolean {
            var n = num
            while (n > 0) {
                if (n % 10 == 0) return false
                if (num % (n % 10) != 0) {
                    return false
                }
                n /= 10
            }
            return true
        }

        val res = arrayListOf<Int>()
        for (i in left..right) {
            if (div(i))
                res.add(i)
        }
        return res
    }

    //1351
    fun countNegatives(grid: Array<IntArray>): Int =
        grid.sumBy { arrays -> arrays.count { it < 0 } }

    //1450
    fun busyStudent(startTime: IntArray, endTime: IntArray, queryTime: Int): Int {
        var count = 0
        for (i in startTime.indices) {
            if (startTime[i] <= queryTime && endTime[i] >= queryTime)
                count++

        }
        return count

    }

    //1572
    fun diagonalSum(mat: Array<IntArray>): Int {
        var r = mat.size - 1
        var sum = 0
        for (i in mat.indices) {
            if (i >= r) {
                if (i == r)
                    sum += mat[i][r]
                break
            }
            sum += mat[i][i] + mat[i][r] + mat[r][i] + mat[r][r]
            r -= 1
        }
        return sum

    }

    //1323
    fun maximum69Number(num: Int): Int =
        num.toString().replaceFirst('6', '9').toInt()

    //1704
    val vowels = charArrayOf('a', 'e', 'e', 'i', 'o', 'u')
    fun halvesAreAlike(s: String): Boolean =
        s.toLowerCase().substring(0, s.length / 2).count { it in vowels } ==
                s.toLowerCase().substring(s.length / 2, s.length).count { it in vowels }

    fun repeatedNTimes(A: IntArray): Int =
        A.groupBy { it }.filter { it.value.size == A.size / 2 }.keys.toIntArray()[0]

    fun largestSumAfterKNegations(A: IntArray, K: Int): Int {
        for (i in 1..K) {
            var t = 0
            for (j in A.indices) {
                if (A[j] < A[t]) {
                    t = j
                }
            }
            A[t] *= -1
        }
        return A.sum()

    }
}
