fun main(args: Array<String>){
    if(args.size == 0){
        println("plz provider a name as a command-line argument");
        return
    }
    println("hello, ${args[0]}!")
}
