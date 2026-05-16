package calculadora;

public class Calculadora {

    public int somar(int a, int b) {
        return a + b;
    }

    public int subtrair(int a, int b) {
        return a - b;
    }

    public int multiplicar(int a, int b) {
        return a * b;
    }

    public int dividir(int a, int b) {
        return a / b;
    }

    public int calcular(int a, int b, String operacao) {
        int resultado = 0;

        if (operacao.equals("+")) {
            resultado = somar(a, b);
        } else if (operacao.equals("-")) {
            resultado = subtrair(a, b);
        } else if (operacao.equals("*")) {
            resultado = multiplicar(a, b);
        } else if (operacao.equals("/")) {
            resultado = dividir(a, b);
        }

        return resultado;
    }
}
