package at.htl.simpletextcomposeapplication

class Person(public val age: Int) {

    fun talk() {
        val message : String
        message = "I am a plain person aged $age"
        println(message)
    }

}


fun main(args: Array<String>) {
    val p = Person(19)
    p.talk()
}


