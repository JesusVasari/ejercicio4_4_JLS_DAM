class Pila<T>() {

    private var listaPila = mutableListOf<T>()

    fun tope(element: T): Int = listaPila.lastIndex

    fun push(element: T) = listaPila.add(element)

    fun pop() =listaPila.removeAt(listaPila.lastIndex)

    fun vacia():Boolean =  listaPila.lastIndex == -1

    fun reverse(mutableIterator: List<T>) {
        var iterator = mutableIterator.iterator()
        var pila: Pila<T> = Pila()
        var alreves = mutableListOf<T>()
        while( iterator.hasNext()
        ){
            pila.push(iterator.next())
        }
        while (!pila.vacia()){
            alreves.add(pila.pop())
        }
    }
}

    fun main() {


        val pilaEnteros: Pila<Int> = Pila()
        pilaEnteros.push(1)
        pilaEnteros.push(3)
        pilaEnteros.push(2)

        println(pilaEnteros)
    }