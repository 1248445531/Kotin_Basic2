package if条件语句

fun main(){
    var num = 20
    if (num > 10) {

    }else {

    }

    //kotlin里面if-else是一个表达式 -> 结果
    var result = if (num > 10)"下载成功" else "下载失败"

    //if和else语句的最后内容就是这个表达式的返回值
    var res = if (num > 10){
        println("$num > 10")
        20
    }else{
        println("$num < 10")
        "失败"
    }
}