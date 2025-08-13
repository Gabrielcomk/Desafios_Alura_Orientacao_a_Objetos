package Desafios_Modulo4_Alura_Orientacao_a_Objetos.Desafio2;

public class Modulo4CalculadoraSalaRetangular implements Modulo4CalculoGeometrico {

    @Override
    public void calcularArea(double altura, double largura) {
        double area = altura * largura;
        System.out.println("A área da sala retangular é: " + area);
    }

    @Override
    public void calcularPerimetro(double altura, double largura) {
        double perimetro = 2 * (altura + largura);
        System.out.println("O perímetro da sala retangular é: " + perimetro);
    }
}
