fun main(){

    print("Masukkan bilangan 1 : ")
    val satu = readLine()!!.toDouble()
    print("Masukkan bilangan 2 : ")
    val dua = readLine()!!.toDouble()
    print("Masukkan bilangan 3 : ")
    val tiga = readLine()!!.toDouble()

    print("Masukkan pilihan operasi : Tambah(A), Kurang(D), Perkalian(C), Pembagian (B): ")
    val pilih: String? = readLine()

    when (pilih) {
        "A"-> print(dua + tiga)
        "B"-> print(dua / tiga)
        "C"-> print(satu * tiga)
        "D"-> print(tiga - satu)

        else -> {
            println ("nomer inputan salah!")
        }
    }
}