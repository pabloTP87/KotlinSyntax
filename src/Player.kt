class Player (var vidas: Int, var puntaje: Int){

    var posX = 0
    var posY = 0

    fun moveUp(map: Array<Array<String>>): Array<Array<String>>{

        if(posY<1){
            map[0][this.posX] = "[x]"
        }else{
            map[--posY][posX] = "[x]"
        }

        return map
    }

    fun moveDown(long: Int, map: Array<Array<String>>): Array<Array<String>>{

        if(posY>long-2){
            map[long-1][this.posX] = "[x]"
        }else{
            map[++posY][posX] = "[x]"
        }

        return map
    }

    fun moveLeft(map: Array<Array<String>>): Array<Array<String>>{

        if(posX<1){
            map[posY][0] = "[x]"
        }else{
            map[posY][--posX] = "[x]"
        }

        return map
    }

    fun moveRight(long: Int, map: Array<Array<String>>): Array<Array<String>>{

        if(posX>long-2){
            map[posY][long-1] = "[x]"
        }else{
            map[posY][++posX] = "[x]"
        }

        return map
    }
}