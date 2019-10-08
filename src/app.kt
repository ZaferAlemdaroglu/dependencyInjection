import Level_0.Car
import Level_0.Carr
import Level_0.Carrr
import Level_0.Engine
import Level_1.PetrolEngine
import Level_2.DieselEngineExtended
import Level_2.IEngine
import Level_2.PetrolEngineExtended

fun main() {

    //LEVEL 0
    println("\n---------------LEVEL 0 -----------------\n")

    val car = Car()
    car.start()
    car.stop()



    //LEVEL 1

    println("\n---------------LEVEL 1 -----------------\n")


    val engine = Engine()
    val carr = Carr(engine)  //To use with another engine types(DieselEngine,PetrolEngine), you must change Carr class constructor
    carr.start()
    carr.stop()




    //LEVEL 2

    println("\n---------------LEVEL 2 -----------------\n")


    val dieselEngineExt = DieselEngineExtended()
    var carrr = Carrr(dieselEngineExt)
    carrr.start()
    carrr.stop()

    val petrolEngineExt = PetrolEngineExtended()

    carrr = Carrr(petrolEngineExt)
    carrr.start()
    carrr.stop()

}