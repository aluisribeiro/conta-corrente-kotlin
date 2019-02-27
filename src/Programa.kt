fun main(args: Array<String>){
    val contaAnderson = ContaCorrente(
        "Anderson",
        1000.0
    )

    val contaJoao = ContaCorrente(
        "João",
        1500.0
    )

    val contaMaria = ContaCorrente(
        "Maria",
        1300.0
    )

    val itau = Banco("Itaú")
    itau.atende(contaAnderson)
    itau.atende(contaJoao)
    itau.atende(contaMaria)

    println("Saldo: ${itau.saldoTotal()}") //3800

    contaMaria.deposita(400.0)

    println("Saldo: ${itau.saldoTotal()}") //4200


}