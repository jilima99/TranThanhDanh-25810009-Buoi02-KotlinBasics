// TranThanhDanh - 25810009

fun main() {
    var a = 0
    var b = 1

    for (i in 0..10) {
        if (a >= 100) {
            break
        }

        println("Vị trí $i: $a")

        val c = a + b
        a = b
        b = c
    }
}