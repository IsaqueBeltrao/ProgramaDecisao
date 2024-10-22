public class Programa01 {
    public static void main(String[] entrada) {

        // declaração de variáveis locais
        int NumInt;
        double NumReal, soma;
        char caracter;

        // entrada de dados
        NumInt = Integer.parseInt(entrada[0]);
        NumReal = Double.parseDouble(entrada[1]);
        caracter = entrada[2].charAt(0);

        // processamento
        soma = NumInt + NumReal;

        // saída de resultados
        System.out.println(NumInt + " + " + NumReal + " = " + soma + " sinal " + caracter);

        System.exit(0);
    }
}
