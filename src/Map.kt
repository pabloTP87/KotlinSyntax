class Map(var sizeY: Int ,var sizeX: Int) {


    fun createMap(long: Int): Array<Array<String>>{

        var map = Array(this.sizeY){Array(this.sizeX){""}}

        for(y in 0 until long){
            for (x in 0 until long){

                map[y][x]="[ ]"
            }
        }

        return map
    }

}