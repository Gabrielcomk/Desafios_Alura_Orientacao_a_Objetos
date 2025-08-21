package Desafios_Modulo4_Alura_Orientacao_a_Objetos.Desafio5;

public class M4Livro implements M4Calculavel {

    @Override
    public double calcularPrecoFinal(double preco) {
        System.out.println("(Livro) Valor " + preco + " possui 5% de desconto");
        return preco * 0.95;
    }

}
