class ContaCorrente(val cliente: String, saldo: Double) {

    var saldo: Double = saldo
        private set

    fun deposita(valor: Double){
        saldo += valor
    }

    fun saca(valor: Double){
        saldo -= valor
    }
}