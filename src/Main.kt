fun main(){

    var nivel = 5
    var impacto = 0
    var avanza = 0
    var numEnemy: Int
    var enemy = Enemy()
    var player = Player(10,1000)
    var map1 = Map(10,10)
    var map2 = Map(10,10)

    var mapPlayer = map1.createMap(nivel)
    var mapEnemy = map2.createMap(nivel)

    do {
        numEnemy = enemy.randomEnemy(nivel,mapEnemy)
    }while (numEnemy<nivel-2)

    mapPlayer[0][0] = "[x]"

    do {
        mapPlayer[nivel-1][nivel-1] = "[!]"

        println("NIVEL: ${nivel-4}")
        println("VIDAS: ${player.vidas}")
        println("PUNTAJE: ${player.puntaje}")

        for (x in 0..nivel){
            for (y in 0..nivel){
                print(mapPlayer[x][y])
            }
            println()
        }

        println("8 -> Arriba")
        println("2 -> Abajo")
        println("4 -> Izquierda")
        println("6 -> Derecha")

        var opcion = readLine()?.toInt()

        when(opcion){

            8-> {mapPlayer = map1.createMap(nivel)

                player.moveUp(mapPlayer)
            }

            2->{mapPlayer = map1.createMap(nivel)

                player.moveDown(nivel,mapPlayer)
            }

            4-> {mapPlayer = map1.createMap(nivel)

                player.moveLeft(mapPlayer)
            }

            6->{mapPlayer = map1.createMap(nivel)

                player.moveRight(nivel,mapPlayer)
            }

            else -> println("MOVIMIENTO INVALIDO!!")
        }

        for (y in 0..nivel){
            for (x in 0..nivel){
                if (mapPlayer[y][x].equals("[x]") && mapEnemy[y][x].equals("[0]")){
                    println("IMPACTO, pierdes una vida")
                    player.vidas -= 1
                    player.puntaje -= 100
                    impacto += 1
                }
            }
        }

        if (mapPlayer[nivel-1][nivel-1] == "[x]"){
            nivel +=1
            player.puntaje +=100
            avanza +=1
        }

        if (avanza == 1){
            enemy.numEnemys = 0
            mapPlayer = map1.createMap(nivel)
            mapEnemy = map2.createMap(nivel)

            mapPlayer[0][0] = "[x]"
            player.posY = 0
            player.posX = 0

            avanza -=1

            do {
                numEnemy = enemy.randomEnemy(nivel,mapEnemy)
            }while (numEnemy<nivel-2)
        }

        if (impacto == 1){
            enemy.numEnemys = 0

            mapPlayer = map1.createMap(nivel)
            mapEnemy = map2.createMap(nivel)

            do {
                numEnemy = enemy.randomEnemy(nivel,mapEnemy)
            }while (numEnemy<nivel-2)

            mapPlayer[0][0] = "[x]"
            player.posY = 0
            player.posX = 0

            impacto -=1

        }

        if (nivel > 9){
            println("ERES GENIAL, PASASTE TODOS LOS NIVELES!!!")
            System.exit(0)
        }

    }while (player.vidas>0)

    println("Te quedaste sin vidas...FIN DEL JUEGO!!")



}
