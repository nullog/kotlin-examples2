fun main(args: Array<String>){
    val language = if(args.size == 0) "EN" else args[0]
        println(when (language){
            "EN" -> "hello!"
            "CN" -> "你好！"
            else -> "sry, donot know!"
                })
}
