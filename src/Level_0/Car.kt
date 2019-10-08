package Level_0

class Car() {

    var  engine : Engine = Engine()

    fun start(){
        println("Car started")
        engine.turnOn()

    }


    fun stop(){
        println("Car stopped")
        engine.turnOff()

    }

}