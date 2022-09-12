package percabangan
//Percabangan bersarang atau nested adalah percabangan di dalam percabangan.

fun main(args: Array<String>){
    var isMember = true
    var password = "petanikode"

    if(isMember){
        if(password == "petanikode"){
            println("Selamat datang")
        } else {
            println("Password salah!")
        }
    } else {
        println("Silahkan daftar telebih dahulu")
    }
}
