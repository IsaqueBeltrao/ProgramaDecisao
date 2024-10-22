import javax.swing.*;

public class ProgDecisao {
    public static void main(String[] entrada) {

        // declaração das variáveis
        int num;
        char op = 0;
        String msg = "", msgEntr = "Digite 1 para par/impar\nDigite 2 para positivo/negativo";

        // entrada de dados
        num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro: "));
        op = JOptionPane.showInputDialog(msgEntr).charAt(0);

        // processamento
        switch(op) {
            case '1':
                if (num % 2 == 0) {
                    msg = "O número é par";
                } else {
                    msg = "O número é ímpar";
                }
                break;
            case '2':
                if (num > 0) {
                    msg = "O número é positivo";
                } else if (num < 0) {
                    msg = "O número é negativo";
                } else {
                    msg = "O número é zero";
                }
                break;
            default:
                msg = "Opção inválida, calculos não realizados!";
        }

        // saída de dados
        JOptionPane.showMessageDialog(null, msg);
        System.exit(0);
    }
}
