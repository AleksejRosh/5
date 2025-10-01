fun main() {
    print(calculateTotal(5769, false))
}
fun calculateTotal(amount: Int, isRegular: Boolean): Int {
    var total = when {
        amount > 10000 -> (amount * 0.95).toInt()
        amount > 1000 -> amount - 100
        else -> amount
    }

    if (isRegular) {
        total = (total * 0.99).toInt()
    }

    return total
}