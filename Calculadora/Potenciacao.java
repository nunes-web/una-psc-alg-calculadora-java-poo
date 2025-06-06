package Calculadora;

import java.text.DecimalFormat;

public class Potenciacao implements Operacao {
    private DecimalFormat df = new DecimalFormat("#.####");

    public String calcular(double num1, double num2) {
        if (num2 == 0) {
            return "Resultado: 1";
        }
        return "Resultado: " + df.format(Math.pow(num1, num2));
    }
}
