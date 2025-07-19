package validacao;

public class ValidarTransacao {

    public static void validarDeposito(double valor) {
        if(valor <= 0) {
            System.out.println("Operação Negada: O Valor não pode ser Igual ou Menor que 0!");
        }
    }

    public static void validarSaque(double valor,  double saldo) {
        if (valor <= 0) {
            System.out.println("Operação Negada: O Valor não pode ser Igual ou Menor que 0!");
        } else if (valor > saldo) {
            System.out.println("Operação Negada: Saldo Insulficiente!");
        }
    }

    public static void validarTransferencia(double valor,  double saldo) {
        if (valor <= 0) {
            System.out.println("Operação Negada: O Valor não pode ser Igual ou Menor que 0!");
        } else if (valor > saldo) {
            System.out.println("Operação Negada: Saldo Insulficiente!");
        }
    }
}
