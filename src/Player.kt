class Player (var vidas: Int, var puntaje: Int){

    var posX = 0
    var posY = 0

    // Movimiento del jugador hacia arriba
    fun moveUp(map: Array<Array<String>>): Array<Array<String>>{

        if(posY<1){
            map[0][this.posX] = "[x]"
        }else{
            map[--posY][posX] = "[x]"
        }

        return map
    }

    // Movimiento del jugador hacia abajo
    fun moveDown(long: Int, map: Array<Array<String>>): Array<Array<String>>{

        if(posY>long-2){
            map[long-1][this.posX] = "[x]"
        }else{
            map[++posY][posX] = "[x]"
        }

        return map
    }

    // Movimiento del jugador hacia la izquierda
    fun moveLeft(map: Array<Array<String>>): Array<Array<String>>{

        if(posX<1){
            map[posY][0] = "[x]"
        }else{
            map[posY][--posX] = "[x]"
        }

        return map
    }

    // Movimiento del jugador hacia la derecha
    fun moveRight(long: Int, map: Array<Array<String>>): Array<Array<String>>{

        if(posX>long-2){
            map[posY][long-1] = "[x]"
        }else{
            map[posY][++posX] = "[x]"
        }

        return map
    }
}