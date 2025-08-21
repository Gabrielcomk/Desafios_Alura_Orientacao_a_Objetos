package Desafios_Modulo4_Alura_Orientacao_a_Objetos.Desafio3;

public class Modulo4TabuadaMultiplicacao implements Modulo4Tabuada {
    @Override
    public void mostrarTabuada(int numero) {
        for (int i = 1; i <= 10; i++){
            System.out.println(numero + " X " + i + " = " + (numero * i));
        }
    }
}
