package Calculadora;

import java.text.DecimalFormat;

public class Divisao implements Operacao {
    private DecimalFormat df = new DecimalFormat("#.####");

    public String calcular(double num1, double num2) {
        if (num2 == 0) {
            return "Impossível realizar uma divisão por zero.";
        }
        return "Resultado: " + df.format(num1 / num2);
    }
}
