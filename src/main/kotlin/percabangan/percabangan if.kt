//Percabangan if
//Bentuk percabangan ini adalah bentuk yang paling sederhana.
//Ia memiliki satu blok kode yang akan dieksekusi apabila kondisinya terpenuhi.
// Bentuk dasar:
//
//if (kondisi) {
//    // blok kode yang akan dieksekusi di ini
//}
//Perhatikan bagian kondisi, di sana kita bisa isi dengan
//sebuah variabel boolean atau pernyataan yang menghasilkan nilai boolen.

fun main(args: Array<String>){

    val totalBelanja: Int = 292_000

    if (totalBelanja >= 100_000){
        println("Selamat, anda dapat hadiah!")
    }
    println("Terimakasih sudah berbelanja!")

    //jika hanya satu baris kode, boleh tidak di kurung
    if( totalBelanja >= 200_000 ) println("Selamat anda dapat hadiah besar!")
}

