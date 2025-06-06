package Calculadora;

import java.text.DecimalFormat;

public class RaizQuadrada implements Operacao {
    private DecimalFormat df = new DecimalFormat("#.####");

    public String calcular(double num1, double num2) {
        if (num1 < 0) {
            return "Não existe raiz de número negativo para o primeiro número.";
        }
        return "Raiz quadrada de " + df.format(num1) + ": " + df.format(Math.sqrt(num1));
    }
}
