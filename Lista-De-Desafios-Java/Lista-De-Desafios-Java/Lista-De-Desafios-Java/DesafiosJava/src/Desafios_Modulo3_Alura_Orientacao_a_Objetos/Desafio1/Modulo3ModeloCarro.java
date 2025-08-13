package Desafios_Modulo3_Alura_Orientacao_a_Objetos.Desafio1;

public class Modulo3ModeloCarro extends Modulo3Carro {
    public static void main(String[] args) {
        Modulo3Carro meuCarro = new Modulo3Carro();
        meuCarro.setModelo("Sedan");
        meuCarro.definirPrecos(30000, 32000, 35000);
        meuCarro.exibir();
    }
}
