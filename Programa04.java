import javax.swing.*;

class Programa04 {
    public static void main(String[] entrada) {
        // Declaração de variáveis
        int n1, n2;
        char op = 0;
        String msg = "";

        // Entrada de dados (recebendo dois números inteiros e uma opção do usuário)
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número inteiro:"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número inteiro:"));
        op = JOptionPane.showInputDialog("Digite a opção (S para soma dos pares, T para a somatória):").charAt(0);

        // Processamento (calculando a soma dos pares)
        if (n1 % 2 == 0 && n2 % 2 == 0) {
            int soma = n1 + n2;
            msg += "A soma dos números pares " + n1 + " e " + n2 + " é: " + soma + "\n";
        }

        // Cálculo da somatória
        if (op == 'T') {
            int somatoria = 0;
            for (int i = 0; i < n2; i++) {
                somatoria += n1;
            }
            msg += "A somatória do primeiro número " + n1 + " " + n2 + " vezes é: " + somatoria + "\n";
        }

        // Exibição das informações
        JOptionPane.showMessageDialog(null, msg);
    }
}
