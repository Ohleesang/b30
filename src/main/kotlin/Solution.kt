class Solution {
    fun solution(array: IntArray): Int {
        var answer: Int = 0
        val groupedArr = array.groupBy { it }
        val sortedByGroup = groupedArr.values.sortedByDescending { it.size }
        val max = sortedByGroup.maxOf { it.size }
        val res = sortedByGroup.filter { it.size == max }
        answer = if (res.size > 1) -1
        else res[0][0]


        return answer
    }
}

fun main() {
    var s = Solution()
    s.solution(intArrayOf(1, 2, 3, 3, 3, 4))//3
    s.solution(intArrayOf(1, 1, 2, 2))//-1
    s.solution(intArrayOf(1))//1
}