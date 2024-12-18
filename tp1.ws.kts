fun afficherNombresPairsOuImpairs(x: Int, pairs: Boolean) {
    for (i in 1..x) {
        val result = if (pairs) i % 2 == 0 else i % 2 != 0
        if (result) println(i)
    }
}
fun Fibonacci(x: Int) {
    var a = 0
    var b = 1
    for (i in 1..x) {
        println(a)
        val temp = a
        a = b
        b = temp + b
    }
}
fun calculerFactoriel(x: Int = 10) {
    var factoriel = 1
    for (i in 1..x) {
        factoriel *= i
    }
    println(factoriel)
}
fun afficherNombresPremiers(x: Int) {
    var count = 0
    var num = 2
    while (count < x) {
        if (isPremier(num)) {
            println(num)
            count++
        }
        num++
    }
}
fun isPremier(n: Int): Boolean {
    if (n <= 1) return false
    for (i in 2..n / 2) {
        if (n % i == 0) return false
    }
    return true
}

afficherNombresPairsOuImpairs(10, true)
afficherNombresPairsOuImpairs(10, false)
Fibonacci(10)
calculerFactoriel()
calculerFactoriel(5)
afficherNombresPremiers(10)

