fun main() {
    val sequenceNumber = readLine()!!.toInt()
    println(getRoomNumber(sequenceNumber))
}

fun getRoomNumber(sequenceNumber: Int): Int {
    var roomNumber = 1
    for (i in 1 until sequenceNumber) {
        do {
            roomNumber++
        } while (!roomNumberIsValid(roomNumber))
    }
    return roomNumber
}

fun roomNumberIsValid(r: Int): Boolean {
    val s = r.toString()
    return (!(s.contains("2") || s.contains("14")))
}
