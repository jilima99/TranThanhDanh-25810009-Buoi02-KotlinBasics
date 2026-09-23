// TranThanhDanh - 25810009

fun main() {
    val canNang: Double = 60.0
    val chieuCao: Double = 1.75

    val bmi = canNang / (chieuCao * chieuCao)

    if (bmi < 18.5) {
        println("BMI: $bmi : Gầy")
    } else if (bmi < 25) {
        println("BMI: $bmi : Bình thường")
    } else if (bmi < 30) {
        println("BMI: $bmi : Thừa cân")
    } else {
        println("BMI: $bmi : Béo phì")
    }
}