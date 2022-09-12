//Percabangan if/else memiliki dua blok kode yang akan dieksekusi.
// Blok pertama untuk kondisi bernilai true dan blok kedua (else) untuk kondisi bernilai false.
//Bentuknya seperti ini:
//
//if (kondisi) {
//    // blok kode yang akan dieksekusi
//    // jika kondisi bernilai true
//} else {
//    // blok kode yang akan dieksekusi
//    // jika kondisi bernilai false
//}

fun main(args: Array<String>){

    val password: String = "ayy ayy kapten"

    if (password == "ayy ayy kapten"){
        println("Selamat datang bos!")
    } else {
        println("Siapa kamu? pergi sana!")
    }

}