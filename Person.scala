case class Person(name:String, age:Int, gender:String)

val person = Person("Kanemoto", 31, "man")
person match {
    case Person(name, age, "man") => println("Hello, Mr.%s! Are you %d years old?").format(name, age)
    case Person(name, _, "woman") => println("Hello, Ms.%s!").format(name)
    case Person(name, _, _)       => println("Hello, %s!").format(name)
}
