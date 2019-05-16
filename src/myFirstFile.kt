fun main(args: Array<String>){
    val program = Program()
    var result = 0

    val myLambda: (Int,Int) -> Unit = {x:Int,y:Int -> result = x+y}
    program.addTwoNumbers(2,3){x,y-> result = x+y}

    print("result  = $result")
}

class Program{
    fun addTwoNumbers(a:Int,b:Int, action: (Int,Int) -> Unit){
        action(a,b)
    }
}

interface MyInterface{
    fun execute(_sum:Int)
}