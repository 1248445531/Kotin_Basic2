package for循环

fun main(){
    //使用 .. 表示范围
    for (i in 1..10){
        print("$i ")
    }
    println()

    //使用until不包括最后一个值
    for (i in 1 until 10){
        print("$i ")
    }
    println()
    //使用step改变增量
    for (i in 1..10 step 2){
        print("$i ")
    }
    println()
    for (i in 1..10 step 3){
        print("$i ")
    }

    println()
    //使用downTo递减
    for (i in 10 downTo 1 step 2){
        print("$i ")
    }
    println("-------------------")

    val names = arrayOf("jack","rose","merry")
    for (i in 0 until names.size){
        println(names[i])
    }
    println("-------------------")
    //依次获取每一个item
    for(item in names){
        println(item)
    }
    println("-------------------")
    //获取对应的索引值
    for (i in names.indices){
        println(names[i])
    }
    println("-------------------")
    for ((index,item) in names.withIndex()){
        println("$index-$item")
    }

}