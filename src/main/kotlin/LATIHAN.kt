package percabangan

fun main(){

    //PERCABANGAN IF ELSE
    val uts : Int = 50
    val uas : Int = 65
    val nilai: Double = (0.4 * uts ) + (0.5 * uas)
    println(nilai)
        if (nilai >= 80){
            println("ANDA NAIK SEMESTER")
        } else {
            println("AMBIL CUTI MU!")
        }

    //WHEN
    var x: Int = 11

    when (x) {
        3,4,5 -> println("It Is summer season")
        6,7,9-> println("It Is rainy season")
        8,11 -> println("It Is autumn season")
        10,12,1,2 -> println("It Is winter season")
        else -> {
            print("salah input tuu!")
        }
    }

    //
    println("===")
    println("versi for hitungan mundur")

    for (i in 20 downTo 0) {
        print("$i ")
    }
    println()
    println("===")
    println("versi for step 3")
    for (i in 3 .. 30 step 3){
        print("$i ")
    }


}


