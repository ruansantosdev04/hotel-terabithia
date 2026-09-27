package Hotel

fun ReservaQuartos() {
    // Input do usuario
    println("Digite o valor a da diária: ")
    var diaria = readln().toDouble()
    while(diaria<0) {
        println("Erro! Digite um valor válido!")
        var diaria = readln().toDouble()
    }
    println("Digite a quantidade de dias de hospedagem: ")
    var dias = readln().toInt()
    while(dias<0 || dias>30) {
        println("Erro! Digite um valor válido!")
        var dias = readln().toInt()
    }

    println("Informe o nome do hóspede: ")
    var hospede = readln()

    println("Agora escolha um quarto, de 1 a 20: ")

    var quarto = readln().toIntOrNull()

    val quartos = mutableListOf<String>(quarto)
}