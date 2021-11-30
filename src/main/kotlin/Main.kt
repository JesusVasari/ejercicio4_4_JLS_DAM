class Pila<T>() {

    private var listaPila = mutableListOf<T>()

    fun tope(): Int {
        return listaPila.lastIndex
    }

    fun push(element: T)  {
        listaPila.add(element)
    }

    fun pop(element : T) {
        listaPila.remove(element)
    }

    fun vacia() {


    }
    fun reverse(listaPila: MutableList<T>) {
        var alreves = reverse(this.listaPila)
        if (!listaPila.equals(alreves)){
            println("error")
        }else{
            println("correcto")
        }
    }
}




fun main(args: Array<String>) {

    var plato1 = Pila<Any>()
    var plato2 = Pila<Any>()
    var plato3 = Pila<Any>()
    var plato5 = Pila<Any>()
    var plato6 = Pila<Any>()
    var plato7 = Pila<Any>()
    var plato8 = Pila<Any>()
}