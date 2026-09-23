// TranThanhDanh - 25810009

fun main() {
    // val: số dư ban đầu không thay đổi
    val soDuBanDau: Int = 5000000

    // var: số dư hiện tại thay đổi sau giao dịch
    var soDuHienTai: Int = soDuBanDau

    // Gửi thêm 2 triệu
    soDuHienTai = soDuHienTai + 2000000
    println("Sau khi gửi: $soDuHienTai VNĐ")

    // Rút 1 triệu rưỡi
    soDuHienTai = soDuHienTai - 1500000
    println("Sau khi rút: $soDuHienTai VNĐ")
}