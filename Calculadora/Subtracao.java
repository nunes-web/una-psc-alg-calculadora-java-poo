package Calculadora;

import java.text.DecimalFormat;

public class Subtracao implements Operacao {
    private DecimalFormat df = new DecimalFormat("#.####");

    public String calcular(double num1, double num2) {
        return "Resultado: " + df.format(num1 - num2);
    }
}
