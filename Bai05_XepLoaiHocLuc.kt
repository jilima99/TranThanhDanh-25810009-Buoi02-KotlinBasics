// TranThanhDanh - 25810009

fun main() {
    val diem: Double = 8.8

    val xepLoai = when (diem) {
        in 8.5..10.0 -> "Xuất sắc"
        in 7.0..8.49 -> "Giỏi"
        in 5.5..6.99 -> "Khá"
        in 4.0..5.49 -> "Trung bình"
        in 0.0..3.99 -> "Yếu"
        else -> "Điểm bậy"
    }

    println("Điểm: $diem")
    println("Xếp loại: $xepLoai")
}