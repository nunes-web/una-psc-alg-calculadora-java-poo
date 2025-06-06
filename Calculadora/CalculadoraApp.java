package Calculadora;

import java.text.DecimalFormat;
import javax.swing.*;

public class CalculadoraApp {
  public static void main(String[] args) {
    DecimalFormat df = new DecimalFormat("#.####");
    while (true) {
      String[] equacoes = {
          "Adição", "Subtração", "Multiplicação", "Divisão",
          "Potenciação", "Raiz Quadrada", "Raiz Cúbica", "Todas as operações", "Sair"
      };
      int escolha = JOptionPane.showOptionDialog(
          null,
          "Escolha a operação:",
          "Calculadora",
          JOptionPane.DEFAULT_OPTION,
          JOptionPane.QUESTION_MESSAGE,
          null,
          equacoes,
          equacoes[0]);

      if (escolha == JOptionPane.CLOSED_OPTION || escolha == 8)
        break;

      String entrada1 = JOptionPane.showInputDialog(null, "Digite o primeiro número (ou Q para sair):");
      if (entrada1 == null || entrada1.equalsIgnoreCase("Q"))
        break;
      entrada1 = entrada1.replace(',', '.');

      String entrada2 = null;
      if (escolha != 5) {
        entrada2 = JOptionPane.showInputDialog(null, "Digite o segundo número (ou Q para sair):");
        if (entrada2 == null || entrada2.equalsIgnoreCase("Q"))
          break;
        entrada2 = entrada2.replace(',', '.');
      }

      double num1 = 0, num2 = 0;
      try {
        num1 = Double.parseDouble(entrada1);
        if (escolha != 5)
          num2 = Double.parseDouble(entrada2);
      } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Entrada inválida. Tente novamente.");
        continue;
      }

      Operacao operacao;
      switch (escolha) {
        case 0:
          operacao = new Adicao();
          break;
        case 1:
          operacao = new Subtracao();
          break;
        case 2:
          operacao = new Multiplicacao();
          break;
        case 3:
          operacao = new Divisao();
          break;
        case 4:
          operacao = new Potenciacao();
          break;
        case 5:
          operacao = new RaizQuadrada();
          break;
        case 6:
          operacao = new RaizCubica();
          break;
        case 7:
          operacao = new TodasOperacoes();
          break;
        case 8:
          return;
        default:
          operacao = null;
          break;
      }

      String resultado = (operacao != null) ? operacao.calcular(num1, num2) : "Opção inválida!";
      JOptionPane.showMessageDialog(null, resultado);
    }
  }
}