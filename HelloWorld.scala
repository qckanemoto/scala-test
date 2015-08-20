object HelloWorld extends App {
    val helloFunction = { string:String => println(string) }
    helloFunction("Hello Function!")
    println("")

    (1 to 10).foreach(println)
    println("")

    (1 to 10).map(_ * 2).foreach(println)
    println("")

    (1 to 10).filter(_ % 2 == 0).foreach(println)
    println("")
}
