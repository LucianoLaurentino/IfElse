fun main(args: Array<String>) {
    exercise1()
    exercise2()
    exercise3()
    exercise4()
}

fun exercise1(): Unit {
    println("Digite o primeiro lado da forma:")
    val side1 = readLine()!!.toFloat()
    println("Digite o segundo lado da forma:")
    val side2 = readLine()!!.toFloat()
    println("Digite o terceiro lado da forma:")
    val side3 = readLine()!!.toFloat()
    if (side1 == side2 && side2 == side3 && side1 == side3) {
        println("O triângulo é Equilátero!!!")
    } else if (side1 == side2 || side2 == side3 || side1 == side3) {
        println("O triângulo é Isósceles!!!")
    } else println("Você tem um triângulo Escaleno!!!")
}

fun exercise2(): Unit {
    println("Digite o ano:")
    val year = readLine()!!.toInt()
    if (year % 4 == 0) {
        println("O ano $year é bissexto!!!")
    } else if (year % 100 == 0) {
        println("O ano $year é bissexto!!!")
    } else if (year % 400 == 0) {
        println("O ano $year é bissexto!!!")
    } else {
        println("O ano não é bissexto!!!")
    }
}

fun exercise3(): Unit {
    var points = 0
    println("Telefonou para a vítima?")
    println("1- Sim: \n2- Não:")
    val question1 = readLine()!!.toInt()
    if (question1 == 1) points = points + 1
    println("Esteve no local do crime?")
    println("1- Sim: \n2- Não:")
    val question2 = readLine()!!.toInt()
    if (question2 == 1) points = points + 1
    println("Mora perto da vítima?")
    println("1- Sim: \n2- Não:")
    val question3 = readLine()!!.toInt()
    if (question3 == 1) points = points + 1
    println("Devia para a vítima?")
    println("1- Sim: \n2- Não:")
    val question4 = readLine()!!.toInt()
    if (question4 == 1) points = points + 1
    println("Já trabalhou com a vítima?")
    println("1- Sim: \n2- Não:")
    val pergunta5 = readLine()!!.toInt()
    if (pergunta5 == 1) points = points + 1

    if (points == 2) {
        println("Você é suspeito!!!")
    } else if (points == 3 || points == 4) {
        println("Você é cúmplice!!!")
    } else if (points == 5) {
        println("Você é o assassino!!!")
    } else {
        println("Você é inocente")
    }
}

fun exercise4(): Unit {
    println("Qual o tipo de combustivel?")
    println("A- Álcool: G- Gasolina:")
    var lyric = readLine()


    if (lyric.equals("a", true)) {
        val priceA = 5
        val discountA1 = priceA - (priceA * 0.03)
        val discountA2 = priceA - (priceA * 0.05)

        //Alcohol
        println("Litros de Alcool: ")
        var litersA = readLine()!!.toInt()
        if (litersA <= 20) {
            var totalA1 = discountA1 * litersA
            println("Total a pagar é de R$$totalA1")
        } else if (litersA > 20) {
            var totalA2 = discountA2 * litersA
            println("Total a pagar é de R$$totalA2")
        }

        //Gasoline
    } else if (lyric.equals("g", true)) {
        val priceG = 7
        val discountG1 = priceG - (priceG * 0.04)
        val discountG2 = priceG - (priceG * 0.06)

        println("Litros de Gasolina:")
        var litersG = readLine()!!.toInt()

        if (litersG <= 20) {
            var totalG1 = discountG1 * litersG
            println("Total a pagar é de R$$totalG1")
        } else if (litersG > 20 ) {
            var totalG2 = discountG2 * litersG
            println("Total a pagar é de R$$totalG2")
        }
    } else {
        println("Opção invalida!")
    }
}
