fun main(args: Array<String>){
    for (data in 1..5) println("sukses om")
    println("========")
    for (dataa in 1..4) println(dataa)

    println("======")

    val teman: List<String> = listOf("nat","nut","net","not")
    for(data in teman){
        data.let { println(it) }
    }
}