package id.infinitelearning.KotlinSubmission.exercise4

fun main() {
    TryCatchSuccess()
    TryCatchFail()
}
/**
 * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
 *
 */
// Buat di bawah sini
fun TryCatchSuccess() {

    try {
        val nilaiA = 50
        val nilaiB = 5
        val nilaiC = nilaiA / nilaiB
        println(nilaiC)
    } catch (e: Exception) {
        println("Terjadi kesalahan: ${e.message}")
    }
}

fun TryCatchFail() {

    try {
        val nilaiA = 27
        val nilaiB = 0
        val nilaiC = nilaiA / nilaiB
        println(nilaiC)
    } catch (e: Exception) {
        println("Terjadi kesalahan: ${e.message}")
    }
}