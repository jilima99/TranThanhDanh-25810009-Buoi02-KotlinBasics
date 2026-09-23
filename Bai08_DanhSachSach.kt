// TranThanhDanh - 25810009

fun main() {

    val sach = mutableListOf(
        "Toan",
        "Ngu Van",
        "English",
        "Japanes",
        "Cong Nghe"
    )
    println("Danh sách ban đầu:")
    println(sach)

    sach.add("Lich Su")
    sach.add("Dia Ly")

    sach.remove("Cong Nghe")

    sach.sort()

    println("Danh sách hậu khi xử lý:")
    println(sach)
}