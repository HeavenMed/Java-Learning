public class ContaFoda {
    int numeroDaConta;
    double saldo;
    int agencia;
    String titular;


    void deposita(double valor){
        this.saldo += valor;
    }
}
