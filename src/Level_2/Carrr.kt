package Level_0

import Level_2.IEngine

class Carrr(var engine: IEngine) {

    fun start(){
        println("Car started")
        engine.turnOn()
    }


    fun stop(){
        println("Car stopped")
        engine.turnOff()
    }

}