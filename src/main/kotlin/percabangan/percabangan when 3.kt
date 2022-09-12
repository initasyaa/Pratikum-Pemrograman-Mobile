package percabangan
//when {
//    kondisi -> // blok kode yang akan diseksekusi
//    kondisi2 -> {
//        // blok kode yang akan dieksekusi jika
//        // kondisi2 benilai true
//    }
//    else -> // blok else
//}

fun main(args: Array<String>){
    var lampu: Int = 2

    when {
        lampu == 1 -> println("Lampu hijau, jalan!")
        lampu == 2 -> println("Lampu kuning, hati-hati!")
        lampu == 3 -> println("Lampu merah, berhenti!")
        else -> print("lampu konslet!")
    }
}