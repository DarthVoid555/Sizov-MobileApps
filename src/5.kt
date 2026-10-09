fun main() {
    val arr = intArrayOf(1, 5, 2, 8, 3, 9, 4, 7, 0, 6)
    for (i in 1 until arr.size - 1) {
        if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
            println(arr[i])
        }
    }
}