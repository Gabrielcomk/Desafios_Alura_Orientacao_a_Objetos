package Desafios_Modulo4_Alura_Orientacao_a_Objetos.Desafio1;

public class Modulo4ConversorMoeda implements Modulo4ConversaoFinanceira {
    @Override
    public void converterDolarParaReal(double valorDolar) {
        double cotacaoDolar = 4.80;
        double valorReal = valorDolar * cotacaoDolar;
        System.out.println("O valor em reais é: R$" + valorReal);
    }
}
