import java.util.*

fun readList () : MutableList <Int>{
    val list : MutableList <Int> = mutableListOf<Int>()
    val reader = Scanner(System.`in`)

    val n = reader.nextInt()

    for (i in 1..n){
       list.add (reader.nextInt())
    }

 

sdfgasgds 
}

fun produsCartezian (list1 : MutableList <Int>, list2 : MutableList <Int>) : MutableList <Pair <Int, Int>>{
    val list : MutableList <Pair <Int, Int> > = mutableListOf()
    for (i in list1)
        for (j in list2)
        {
            list.add (Pair(i, j))
        }
    return list
}

fun intersection (list1 : MutableList <Pair <Int, Int> >, list2 : MutableList <Pair <Int, Int> >) : MutableList <Pair <Int, Int> >{
    val list : MutableList <Pair <Int, Int> > = mutableListOf()
    for (i in list1)
        for (j in list2)
        {
            if (i.first == j.first && i.second == j.second){
                list.add (i)
            }
        }

    val listFinal : MutableList <Pair <Int, Int> > = mutableListOf()
    for (i in 1..list.size) {
        var control = 0
        for (j in (i + 1)..list.size) {
            if (list[i].first == list[j].first && list[i].second == list[j].second) {
                control = 1
            }
        }
        if (control == 0){
            listFinal.add (list[i])
        }
    }
    return listFinal
}

fun main (Args : Array <String>){

}
