package Calculadora;

import java.text.DecimalFormat;

public class RaizCubica implements Operacao {
    private DecimalFormat df = new DecimalFormat("#.####");

    public String calcular(double num1, double num2) {
        return "Raiz cúbica de " + df.format(num1) + ": " + df.format(Math.cbrt(num1)) + "\n" +
                "Raiz cúbica de " + df.format(num2) + ": " + df.format(Math.cbrt(num2));
    }
}
