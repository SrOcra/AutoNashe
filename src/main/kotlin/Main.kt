fun main() {
    val colorauto = object : color {
        override var color = "negro"
    }
    val motor = motor(
            "V",
            6,
            240)


    val stellaArtois = auto(
            motor,
            ruedas(200),
            puertas(colorauto)
    )

    stellaArtois.atributosauto()

}