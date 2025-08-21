package Desafios_Modulo4_Alura_Orientacao_a_Objetos.Desafio4;

public class Modulo4ConversorTemperaturaPadrao implements Modulo4ConversorTemperatura {

    @Override
    public double celsiusParaFahrenheit(double temperaturaCelsius) {
        return (temperaturaCelsius * 9 / 5) + 32;
    }

    @Override
    public double fahrenheitParaCelsius(double temperaturaFahrenheit) {
        return (temperaturaFahrenheit - 32) * 5 / 9;
    }
}
