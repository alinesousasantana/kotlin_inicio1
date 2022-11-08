//formatação de strings\\

fun main () {
//primeira maneira de "concatenação"\\
    var nome = "Aline"
    var sobrenome = "Santana"
    println("Meu nome é " + nome + " " + sobrenome)

    //segunda maneira de "concatenação/interpulação"\\

    var nome1 = "Harry"
    var sobrenome2 = "Potter"
    println("Meu nome é $nome1 $sobrenome2")

    //como acessar uma propriedade de uma variável?\\

    println("Double ${Double.MAX_VALUE}")
}