var x = 2
var y = 2
val z = x + y
val w = "120"
val i = w.toInt
val h = i / 2
println("Half the value =" + h)
if (i > 100) println("that's a big number") else println("that's a small number")
for(n <- 1 to 25) {
println(n, n*n, n*n*n)
}
var g = 13 * 13 * 13

def  isEven(a:Int) = {
  if (a % 2 == 0) true else false
}

isEven(4)