data class TestCase(
    val giftsToBuy: Int,
    val giftsAvailable: Int,
    val giftPrices: List<Long>
)

fun main(args: Array<String>) {
    val noOfTests = readLine()!!.toInt()
    val testCases = List(noOfTests) {
        val giftsToBuy = readLine()!!.toInt()
        val giftsAvailable = readLine()!!.toInt()
        val giftPrices =
            readLine()!!.split(" ").map { it.toLong() }.toMutableList()
        giftPrices.sort()
        TestCase(
            giftsToBuy,
            giftsAvailable,
            giftPrices = giftPrices,
        )
    }
    for (t in testCases) {
        val minimumMoneyRequired = t.giftPrices.subList(0, t.giftsToBuy).sum()
        println("$minimumMoneyRequired")
    }
}
