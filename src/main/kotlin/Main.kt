class Pila<T>() {

    private var listaPila = mutableListOf<T>()

    fun tope(element: T): Int = listaPila.lastIndex

    fun push(element: T) = listaPila.add(element)

    fun pop(element: T) =listaPila.remove(element)

    fun vacia():Boolean =  listaPila.lastIndex == -1

    fun reverse(mutableIterator: MutableIterator<T>) {
        var mutableIterator = listaPila.iterator()
        var alreves = reverse(mutableIterator)
        if (!listaPila.equals(alreves)) {
            println("error")
        } else {
            println("correcto")
        }
        println(alreves)
    }
}

    fun main(args: Array<String>) {

        val pilaEnteros = Pila<Int>()
        pilaEnteros.push(1)
        pilaEnteros.push(3)
        pilaEnteros.push(2)

        println(pilaEnteros)


    }