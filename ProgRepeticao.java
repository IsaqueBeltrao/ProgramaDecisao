import javax.swing.*;

class ProgRepeticao {
    public static void main(String[] entrada) {

        // Declaração de variáveis locais
        int Tabuada;
        char op = 0;
        String msg = "", msgEntr = "Digite 1 para repetição com for\nDigite 2 para repetição com while\nDigite 3 para repetição com do/while";
        // Entrada de dados
        Tabuada = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro"));
        op = JOptionPane.showInputDialog(msgEntr).charAt(0);
        // Processamento

        switch (op) {
            case '1':
                msg = "Tabuada do " + Tabuada + " usando for: \n\n";
                for (int i = 1; i <= 10; i++) {
                    msg += Tabuada + " x " + i + " = " + Tabuada * i + "\n";
                }
                break;
            case '2':
                msg = "Tabuada do " + Tabuada + " usando while: \n\n";
                int j = 1;
                while (j <= 10) {
                    msg += Tabuada + " x " + j + " = " + Tabuada * j + "\n";
                    j++;
                }
                break;
            case '3':
                msg = "Tabuada do " + Tabuada + " usando do/while: \n\n";
                int k = 1;
                do {
                    msg += Tabuada + " x " + k + " = " + Tabuada * k + "\n";
                    k++;
                } while (k <= 10);
                break;
		//saída de dados
            default:
                JOptionPane.showMessageDialog(null, "Opção inválida, cálculos não realizados");
        }
        JOptionPane.showMessageDialog(null, msg);
    }
}
