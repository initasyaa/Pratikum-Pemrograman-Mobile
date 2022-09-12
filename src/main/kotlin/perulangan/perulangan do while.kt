package perulangan

fun main(args: Array<String>){

    //Penggunaan while loop :
    //Pernyataan yang terdapat
    // pada while loop akan di eksekusi
    // berulang-ulang selama kondisi pada
    // statement while bernilai true.

    println("versi while")
    var angka = 20

    while(angka >= 0){
        println(angka)
        angka--
    }

   /* println("versi while step 3")
    println("===")
    var y = 3
    while(y >= 0){
        println(y)
        y--
    }*/

    println("versi for hitungan mundur")
    println("===")

    for (i in 20 downTo 0) {
        println("$i")
    }

    println("versi for step 3")
    println("===")
    for (i in 3 .. 30 step 3){
        println("$i")
    }


    //Penggunaan do-while loop
    /*var angka = 1
    do{
        println("Sukses")
        angka++
    }while (angka < 3)*/

    //Menggunakan while loop :
    /*var angka = 0
    while(angka > 5){ //Menghasilkan Nilai False
        println("Sukses")
    }*/


}