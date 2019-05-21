class Map(var sizeY: Int ,var sizeX: Int) {

    // funcion para crear el mapa de juego con el caracter "[ ]"
    fun createMap(long: Int): Array<Array<String>>{
        // declaración de Array Bidimensional
        var map = Array(this.sizeY){Array(this.sizeX){""}}

        for(y in 0 until long){
            for (x in 0 until long){

                map[y][x]="[ ]"
            }
        }

        return map
    }

}