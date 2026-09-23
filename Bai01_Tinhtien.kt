 // TranThanhDanh - 25810009
fun main() {
    val soLuong: Int = 9
    val donGia: Double = 100000.0

    val tienHang = soLuong.toDouble() * donGia
    val thue = tienHang * 0.08
    val tongTien = tienHang + thue

    println("Tiền hàng: $tienHang VNĐ")
    println("Thuế 8%: $thue VNĐ")
    println("Tổng tiền phải trả: $tongTien VNĐ")
}