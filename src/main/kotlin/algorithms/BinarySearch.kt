package algorithms

fun binarySearch(numbers: IntArray, target: Int): Int {
    var index = 0
    var r = numbers.size
    while (index < r) {
        val middle = (index + r) / 2
        if (numbers[middle] < target) index = middle + 1 else r = middle
    }
    return index
}

binarySearch()