// Percabangan ini memiliki lebih dari dua blok kode dan kondisi.
//Bentuknya seperti ini:
//
//if(kondisiPertama){
//    // blok kode yang akan dieksekusi
//    // jika kondisiPertama bernilai true
//} else if(kondisiKedua) {
//    // blok kode yang akan dieksekusi
//    // jika kondisiKedua bernilai true
//} else if(kondisiKetiga){
//    // blok kode yang akan dieksekusi
//    // jika kondisi ketiga bernilai true
//} else {
//    // blok kode yang akan dieksekusi
//    // jika semua kondisi bernilai false
//}

fun main(args: Array<String>){

    val nilai: Int = 89
    var grade: String = ""

    if (nilai >= 90) grade = "A+"
    else if (nilai >= 80) grade = "A"
    else if (nilai >= 70) grade = "B+"
    else if (nilai >= 60) grade = "B"
    else if (nilai >= 50) grade = "C+"
    else if (nilai >= 40) grade = "C"
    else if (nilai >= 30) grade = "D"
    else if (nilai >= 20) grade = "E"
    else grade = "F"

    println("Selamat nilai kamu: $grade")

}
