package percabangan
// Pada percabangan when, kita juga bisa mengecek nilai variabel dengan range (..).

fun main(args: Array<String>){
    var nilai: Int = 94
    var grade: String = ""

    when (nilai) {
        in 90..100 -> grade = "A+"
        in 80..89 -> grade = "A"
        in 70..79 -> grade = "B+"
        in 60..69 -> grade = "B"
        in 50..59 -> grade = "C+"
        in 40..49 -> grade = "C"
        in 30..39 -> grade = "D"
        in 20..29 -> grade = "E"
        else -> grade = "F"
    }

    println("Selamat anda mendapatkan nilai: $grade")
}

//Arti tanda titik-titik (..) pada contoh program di atas adalah range.