fun main(args: Array<String>){
    var conta = ContaCorrente(
        "Anderson",
        10.0
    )

    conta.deposita(20.0)
    println("Cliente: ${conta.cliente} - " +
            "saldo: ${conta.saldo}")

    conta.saca(4.0)
    println("Cliente: ${conta.cliente} - " +
            "saldo: ${conta.saldo}")

}