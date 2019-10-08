package Level_0

class Carr(var engine: Engine) {    //  change motor type to use with another motors such as  DieselEngine or PetrolEngine


    fun start(){
        println("Car started")
        engine.turnOn()
    }


    fun stop(){
        println("Car stopped")
        engine.turnOff()
    }

}