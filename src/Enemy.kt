import kotlin.random.Random

class Enemy {

    var numEnemys = 0


    fun randomEnemy(cantidad: Int, map: Array<Array<String>>): Int{

        /* Variables que guardan un numero aleatorio entre 1 y n
        (n=cantidad que representa n= nivel = 5) */
        var enemyPosY = Random.nextInt(cantidad)
        var enemyPosX = Random.nextInt(cantidad)

        /* si enemyPos en los ejes X e Y saca 0, movemos
        al enemigo abajo en el eje Y (Y=+1) */
        if (enemyPosX == 0 && enemyPosY == 0){
            map[enemyPosY+1][0] = "[0]"

        // si enemyPos en los ejes X e Y saca la ultima posición del mapa, movemos a la izquierda en el eje X (X=-1)
        }else if (enemyPosY == cantidad-1 && enemyPosX == cantidad-1){

            map[cantidad-1][enemyPosX-1] = "[0]"

        }else{

            map[enemyPosY][enemyPosX] = "[0]"
        }

        this.numEnemys = numEnemys+1

        return this.numEnemys
    }
}