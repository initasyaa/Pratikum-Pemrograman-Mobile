package INPUTAN

fun main () {
    println("Masukkan nama lengkap")
    val nama: String? = readLine()

    println("Nama lengkap kamu adalah : $nama")

    //
    println("Masukkan nilai uts kamu")
    val uts = readLine()!!.toInt()
    println("Masukkan nilai uas kamu")
    val uas = readLine()!!.toDouble()

    val nilai: Double = (uts*0.4) + (uas*0.5)

    if (nilai >= 80) {
        println("ANDA NAIK SEMESTER")
    } else {
        println("AMBIL CUTI MU!")
    }
    println("Nilai Akhir Kamu adalah : $nilai")

}
