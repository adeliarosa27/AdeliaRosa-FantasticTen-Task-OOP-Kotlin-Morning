package id.infinitelearning.KotlinSubmission.exercise1

/**
Latihan 1
Lengkapi fungsi myProfile di bawah ini dengan membuat variabel dengan ketentuan dibawah ini:
- Variable bertipe data string yang menyimpan nilai nama depan Anda.
- Variable bertipe data string yang menyimpan nilai nama belakang Anda.
- Variable bertipe data number yang menyimpan nilai umur Anda.
- Variable bertipe data boolean yang menyimpan nilai status Anda (single atau tidak)
Dan Cetak setiap variabel ke layar saat variable myProfile di panggil
 */
fun myProfile() {
    val firstName: String = "Adelia"
    val lastName: String = "Rosa"
    val age: Int = 20
    val status: Boolean = true

    // print perintah
    println("Nama saya adalah : $firstName $lastName")
    println("Umur saya : $age tahun")
    println("Status : ${if (status) "Single" else "Tidak Single"}")

}

/**
 *  Latihan 2
 *  Lengkapi fungsi di bawah ini agar dapat mencetak nilai dari parameter-parameter yang ada dengan fungsi println
 */
fun groupDetail(groupId: String, groupMember: List<Any>, session: String): Any {

    println("Nama Group: $groupId")
    println("Anggota Group:")
    groupMember.forEachIndexed { index, it ->
        println("${index + 1}. $it")
    }
    println("sesi: $session")
    return "Detail Group"
}

/**
 * Latihan 3
 * Buat variable yang berisi daftar anggota group kamu,
 * Kemudian akses item yang berisi nama Anda dari variable tersebut, lalu jadikan nilai kembalian untuk fungsi myTeam ini
 *
 */
fun myTeam(members: List<Any>): Any {
    return members[0]
}

/**
 * Latihan 4
 * Lengkapi dan perbaiki isi fungsi totalMember() ini dengan rumus:
 *
 *      total mentor + jumlah anggota group
 *
 */
fun totalMember(members: List<String>): Int {
    val mentor = arrayOf<String>("Kak Reza", "Kak Ayat", "Kak Widya")

    return mentor.size + members.size
}

fun main() {
    val anggotaTeam = listOf<String>(
        "Adelia Rosa",
        "Nova Safira",
        "Isep Irmansyah",
        "Aziz Zarkasyi Ramadhan",
        "Muhamad Irpan",
        "Berliyan Sri Surani",
        "Akhmad Nuryasin",
        "Ahmad Andre Alfiansyah",
        "Sugiharto",
        "Rizqi Arya Muzaky",

        )

    myProfile()

    val myTeam = myTeam(anggotaTeam)
    println("My team is: $myTeam")

    val totalMember = totalMember(anggotaTeam)
    println("Total Member group : $totalMember")

    /**
     *  Latihan 5
     *  Ubah nilai argumen-argumen dari fungsi groupDetail di bawah ini sesuai dengan data group kamu
     *
     */
    groupDetail("Fantastic Ten", anggotaTeam, "Morning")

}