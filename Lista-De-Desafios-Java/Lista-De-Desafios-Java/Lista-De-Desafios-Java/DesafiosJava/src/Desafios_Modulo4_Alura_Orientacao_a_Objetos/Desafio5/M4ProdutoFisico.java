package Desafios_Modulo4_Alura_Orientacao_a_Objetos.Desafio5;

public class M4ProdutoFisico implements M4Calculavel {
    @Override
    public double calcularPrecoFinal(double preco) {
        System.out.println("(Produto Físico) Valor " + preco + " possui 5% de acréscimo");
        return preco * 1.05;
    }
}
