class auto(
    var motor: motor,
    var ruedas: ruedas,
    var puertas: puertas
) {
    fun atributosauto(){
        println("Este auto tiene un motor ${motor.motor} ${motor.cilindros} de ${motor.caballosFuerza}, llega a una velocidad de "+
                "${ruedas.velocidad} kilometros por hora limitados por el body kit"+
                "es de color ${puertas.color}")
    }
}