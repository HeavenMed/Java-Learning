public class Conta {








    public static void main(String[] args){

        ContaFoda PrimeiraConta = new ContaFoda();
        PrimeiraConta.titular = "Guilherme";
        PrimeiraConta.numeroDaConta = 272700100;

        PrimeiraConta.deposita(34.2);

        System.out.println(PrimeiraConta.saldo);

    }
}
