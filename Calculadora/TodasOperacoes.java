package Calculadora;

import java.text.DecimalFormat;

public class TodasOperacoes implements Operacao {
    private DecimalFormat df = new DecimalFormat("#.####");

    public String calcular(double num1, double num2) {
        String resultado = "Adição: " + df.format(num1 + num2) + "\n" +
                "Subtração: " + df.format(num1 - num2) + "\n" +
                "Multiplicação: " + df.format(num1 * num2) + "\n";
        if (num2 == 0) {
            resultado += "Divisão: Impossível realizar uma divisão por zero.\n";
        } else {
            resultado += "Divisão: " + df.format(num1 / num2) + "\n";
        }
        if (num2 == 0) {
            resultado += "Potenciação: 1\n";
        } else {
            resultado += "Potenciação: " + df.format(Math.pow(num1, num2)) + "\n";
        }
        if (num1 < 0) {
            resultado += "Raiz quadrada de " + df.format(num1) + ": Não existe raiz de número negativo.\n";
        } else {
            resultado += "Raiz quadrada de " + df.format(num1) + ": " + df.format(Math.sqrt(num1)) + "\n";
        }
        if (num2 < 0) {
            resultado += "Raiz quadrada de " + df.format(num2) + ": Não existe raiz de número negativo.\n";
        } else {
            resultado += "Raiz quadrada de " + df.format(num2) + ": " + df.format(Math.sqrt(num2)) + "\n";
        }
        resultado += "Raiz cúbica de " + df.format(num1) + ": " + df.format(Math.cbrt(num1)) + "\n" +
                "Raiz cúbica de " + df.format(num2) + ": " + df.format(Math.cbrt(num2));
        return resultado;
    }
}
