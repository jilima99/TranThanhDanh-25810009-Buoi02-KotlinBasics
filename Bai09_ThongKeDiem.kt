// TranThanhDanh - 25810009

fun main() {
    val diem = arrayOf(7.5, 8.0, 6.5, 9.0, 5.5, 7.0, 8.5, 6.0, 9.5, 7.5)

    var tong = 0.0
    var caoNhat = diem[0]
    var thapNhat = diem[0]

    for (i in diem) {
        tong = tong + i

        if (i > caoNhat) {
            caoNhat = i
        }

        if (i < thapNhat) {
            thapNhat = i
        }
    }

    val trungBinh = tong / diem.size

    println("Điểm trung bình: $trungBinh")
    println("Điểm cao nhất: $caoNhat")
    println("Điểm thấp nhất: $thapNhat")
}