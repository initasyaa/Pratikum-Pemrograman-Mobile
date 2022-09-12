package percabangan
//Percabangan when sebenarnya adalah percabangan switch/case yang memiliki banyak blok dan kondisi.
//Bentuknya seperti ini:
//
//when(variabel){
//    "nilai" -> {
//        // blok kode yang akan dieksekusi
//        // jika variabel sama dengan "nilai"
//    }
//    222 -> {
//        // blok kode yang akan dieksekusi
//        // jika variabel sama dengan 222
//    }
//    else {
//        // blok kode yang akan dieksekusi
//        // apabila variabel tidak sama dengan
//        // semua nilai di atas
//    }
//}

fun main(args: Array<String>){
    var x: Int = 4

    when (x) {
        1 -> print("Senin")
        2 -> print("Selasa")
        3 -> print("Rabu")
        4 -> print("Kamis")
        5 -> print("Jum'at")
        6 -> print("Sabtu")
        7 -> print("Minggu")
        else -> {
            print("nomer hari salah!")
        }
    }
}