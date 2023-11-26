import java.util.Scanner
fun main(args: Array<String>) {
    var sc = Scanner(System.`in`)

    var a:Int = sc.nextInt()
    var b:Int = sc.nextInt()
    var c:Int = sc.nextInt()


    if(a>b && a>c)
   println("A is greater")

    else if(b>a && b> c)
    println("B is greater")

    else if(c>a && c>b)
    println("C is greater")

    else if(a==b && a>c) {
    println("A and B are greater")
    }
    else if(a==c && a>b) {
        println("A and B are greater")
    }
    else if(b==c && b>a) {
        println("B and C are greater")
    }
    else {
        println("All are Equal")
    }

}