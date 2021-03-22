
import java.util.Scanner;

public class TestaCash {

    public static void main(String[] args) {

        Scanner captura = new Scanner(System.in);

        //variaéveis
        String nome;
        double valor1;
        String cond = "S";
        double Cash = 0;

        CashBack.exibeMenu();

        while (cond.equalsIgnoreCase("S")) {
            System.out.println(" Digite seu Nome:");
            nome = captura.nextLine();
           captura.nextLine();
           
            System.out.println("Digite o valor a ser tranferido em R$:");
            valor1 = captura.nextDouble();
           
            // Vem da classe CashBack invocando o metodo CalculaCash pegando os parametros valor1 e o Cash
           

            System.out.println("Valor depositado:" + valor1 + " R$ ");
            System.out.println("Parabéns," + nome + "!");
            System.out.println("Você receberá de CashBack " + CashBack.CalculaCash(valor1, Cash) + " Reais! ");
            System.out.println(" DESEJA CONTINUAR?");
            System.out.println("S[SIM] N[NÃO] ");
            cond = captura.next();
        }

    }

}
