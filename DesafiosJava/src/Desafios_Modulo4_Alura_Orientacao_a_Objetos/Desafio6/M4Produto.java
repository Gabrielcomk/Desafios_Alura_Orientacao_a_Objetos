package Desafios_Modulo4_Alura_Orientacao_a_Objetos.Desafio6;

public class M4Produto implements M4Vendavel {

    @Override
    public double calcularPrecoTotal(int quantidade, double preco) {
        return quantidade * preco;
    }
}
