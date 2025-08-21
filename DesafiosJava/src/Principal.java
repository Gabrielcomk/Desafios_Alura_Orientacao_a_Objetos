import Desafios_Modulo1_Alura_Orientacao_a_Objetos.Desafio1.Modulo1Pessoa;
import Desafios_Modulo1_Alura_Orientacao_a_Objetos.Desafio2.Modulo1Calculadora;
import Desafios_Modulo1_Alura_Orientacao_a_Objetos.Desafio3.Modulo1Musica;
import Desafios_Modulo1_Alura_Orientacao_a_Objetos.Desafio4.Modulo1Carro;
import Desafios_Modulo1_Alura_Orientacao_a_Objetos.Desafio5.Modulo1Aluno;

import Desafios_Modulo2_Alura_Orientacao_a_Objetos.Desafio1.Modulo2ContaBancaria;
import Desafios_Modulo2_Alura_Orientacao_a_Objetos.Desafio2.Modulo2IdadePessoa;
import Desafios_Modulo2_Alura_Orientacao_a_Objetos.Desafio3.Modulo2Produto;
import Desafios_Modulo2_Alura_Orientacao_a_Objetos.Desafio4.Modulo2Aluno;
import Desafios_Modulo2_Alura_Orientacao_a_Objetos.Desafio5.Modulo2Livro;

import Desafios_Modulo3_Alura_Orientacao_a_Objetos.Desafio1.Modulo3Carro;
import Desafios_Modulo3_Alura_Orientacao_a_Objetos.Desafio2.Modulo3Cachorro;
import Desafios_Modulo3_Alura_Orientacao_a_Objetos.Desafio2.Modulo3Gato;
import Desafios_Modulo3_Alura_Orientacao_a_Objetos.Desafio3.Modulo3ContaBancaria;
import Desafios_Modulo3_Alura_Orientacao_a_Objetos.Desafio4.Modulo3VerificadorPrimo;
import Desafios_Modulo4_Alura_Orientacao_a_Objetos.Desafio1.Modulo4ConversorMoeda;
import Desafios_Modulo4_Alura_Orientacao_a_Objetos.Desafio2.Modulo4CalculadoraSalaRetangular;
import Desafios_Modulo4_Alura_Orientacao_a_Objetos.Desafio3.Modulo4TabuadaMultiplicacao;
import Desafios_Modulo4_Alura_Orientacao_a_Objetos.Desafio4.Modulo4ConversorTemperatura;
import Desafios_Modulo4_Alura_Orientacao_a_Objetos.Desafio4.Modulo4ConversorTemperaturaPadrao;
import Desafios_Modulo4_Alura_Orientacao_a_Objetos.Desafio5.M4Calculavel;
import Desafios_Modulo4_Alura_Orientacao_a_Objetos.Desafio5.M4Livro;
import Desafios_Modulo4_Alura_Orientacao_a_Objetos.Desafio5.M4ProdutoFisico;
import Desafios_Modulo4_Alura_Orientacao_a_Objetos.Desafio6.M4Produto;
import Desafios_Modulo4_Alura_Orientacao_a_Objetos.Desafio6.M4Servico;
import Desafios_Modulo4_Alura_Orientacao_a_Objetos.Desafio6.M4Vendavel;

import javax.swing.*;
import java.util.Scanner;

import static Desafios_Modulo3_Alura_Orientacao_a_Objetos.Desafio3.Modulo3ContaBancaria.*;
import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;

public class Principal {
    public static void main(String[] args) {

        Scanner scanOpcao = new Scanner(System.in);

        // Objetos Módulo 1
        Modulo1Musica minhaModulo1Musica = new Modulo1Musica();
        Modulo1Carro meuModulo1Carro1 = new Modulo1Carro();
        Modulo1Aluno modulo1Aluno1 = new Modulo1Aluno();

        // Objetos Módulo 2
        Modulo2ContaBancaria conta1 = new Modulo2ContaBancaria();
        Modulo2IdadePessoa pessoa1 = new Modulo2IdadePessoa();
        Modulo2Produto modulo2Produto1 = new Modulo2Produto();
        Modulo2Aluno modulo2Aluno2 = new Modulo2Aluno();
        Modulo2Livro livro1 = new Modulo2Livro();

        // Objetos Módulo 3
        Modulo3Carro meuCarro2 = new Modulo3Carro();
        Modulo3Cachorro cachorro = new Modulo3Cachorro();
        Modulo3Gato modulo3Gato = new Modulo3Gato();
        Modulo3ContaBancaria conta2 = new Modulo3ContaBancaria();
        Modulo3VerificadorPrimo verificador = new Modulo3VerificadorPrimo();

        // Objetos Módulo 4
        Modulo4ConversorMoeda conversor = new Modulo4ConversorMoeda();
        Modulo4CalculadoraSalaRetangular calculadora = new Modulo4CalculadoraSalaRetangular();
        Modulo4TabuadaMultiplicacao tabuada = new Modulo4TabuadaMultiplicacao();
        Modulo4ConversorTemperatura modulo4ConversorTemperatura = new Modulo4ConversorTemperaturaPadrao();
        M4Calculavel m4Livro = new M4Livro();
        M4Calculavel m4ProdutoFisico = new M4ProdutoFisico();
        M4Vendavel m4Produto = new M4Produto();
        M4Vendavel m4Servico = new M4Servico();

        int opcao;
        int valorInt;
        double valorDouble;

        do {
            // Menu principal
            do {
                System.out.println("""
                        Qual módulo?
                        0 - Encerrar
                        1 - Modelando o screenmatch
                        2 - Controlando o acesso e a escrita nos dados da aplicação
                        3 - Reaproveitando características e comportamentos
                        4 - Aplicando comportamentos em comum
                        """);

                while (!scanOpcao.hasNextInt()) {
                    System.out.println("Valor inválido. Digite um número inteiro de 0 a 5.");
                    scanOpcao.next();
                }
                opcao = scanOpcao.nextInt();

                if (opcao < 0 || opcao > 5) {
                    System.out.println("Valor inválido. Digite um número inteiro de 0 a 5.");
                }

            } while (opcao < 0 || opcao > 5);

            switch (opcao) {
                case 0 -> {
                    System.out.println("Encerrando...");
                    scanOpcao.close();
                    return;
                }

                case 1 -> {
                    int subOpcao;
                    do {
                        System.out.println("""
                                MÓDULO 1
                                Qual desafio realizar?
                                0 - Retornar
                                1 - Desafio 1
                                2 - Desafio 2
                                3 - Desafio 3
                                4 - Desafio 4
                                5 - Desafio 5
                                """);

                        while (!scanOpcao.hasNextInt()) {
                            System.out.println("Digite um número de 0 a 5.");
                            scanOpcao.next();
                        }
                        subOpcao = scanOpcao.nextInt();

                        switch (subOpcao) {
                            case 1 -> Modulo1Pessoa.OlaMundo();

                            case 2 -> {
                                System.out.print("Digite um número: ");
                                valorInt = scanOpcao.nextInt();
                                valorInt = Modulo1Calculadora.retorna(valorInt);
                                System.out.println(valorInt);
                            }

                            case 3 -> {
                                scanOpcao.nextLine();
                                System.out.print("Digite o nome da música: ");
                                minhaModulo1Musica.titulo = scanOpcao.nextLine();
                                System.out.print("Digite o nome do artista: ");
                                minhaModulo1Musica.artista = scanOpcao.nextLine();
                                System.out.print("Digite o ano de lançamento: ");
                                minhaModulo1Musica.anoLancamento = scanOpcao.nextInt();

                                minhaModulo1Musica.exibirFicha();

                                for (int i = 1; i <= 3; i++) {
                                    System.out.printf("Digite a nota %d: ", i);
                                    minhaModulo1Musica.avaliar(scanOpcao.nextDouble());
                                }

                                minhaModulo1Musica.exibirFicha();
                                valorDouble = minhaModulo1Musica.pegaMedia();
                                System.out.println("Média das avaliações: " + valorDouble);
                            }

                            case 4 -> {
                                scanOpcao.nextLine();
                                System.out.print("Digite o modelo do carro: ");
                                meuModulo1Carro1.modelo = scanOpcao.nextLine();

                                System.out.print("Digite o ano do carro: ");
                                while (!scanOpcao.hasNextInt()) {
                                    System.out.println("Valor inválido. Digite um número inteiro para o ano.");
                                    scanOpcao.next();
                                }
                                meuModulo1Carro1.ano = scanOpcao.nextInt();

                                scanOpcao.nextLine();
                                System.out.print("Digite a cor do carro: ");
                                meuModulo1Carro1.cor = scanOpcao.nextLine();

                                meuModulo1Carro1.exibirFicha();
                            }

                            case 5 -> {
                                scanOpcao.nextLine();
                                System.out.print("Digite o nome: ");
                                modulo1Aluno1.nome = scanOpcao.nextLine();
                                System.out.print("Digite a idade: ");
                                modulo1Aluno1.idade = scanOpcao.nextInt();
                                modulo1Aluno1.exibirInfo();
                            }

                            case 0 -> System.out.println("Retornando...");

                            default -> System.out.println("Opção inválida.");
                        }
                    } while (subOpcao != 0);
                }

                case 2 -> {
                    int subOpcao;
                    do {
                        System.out.println("""
                                MÓDULO 2
                                Qual desafio realizar?
                                0 - Retornar
                                1 - Desafio 1
                                2 - Desafio 2
                                3 - Desafio 3
                                4 - Desafio 4
                                5 - Desafio 5
                                """);

                        while (!scanOpcao.hasNextInt()) {
                            System.out.println("Digite um número de 0 a 5.");
                            scanOpcao.next();
                        }
                        subOpcao = scanOpcao.nextInt();

                        switch (subOpcao) {
                            case 1 -> {
                                conta1.setNumeroConta(parseInt(JOptionPane.showInputDialog("Digite o número da conta: ")));
                                conta1.setSaldo(parseDouble(JOptionPane.showInputDialog("Digite o saldo da conta: ")));
                                conta1.setTitular(JOptionPane.showInputDialog("Digite o titular da conta: "));
                                Modulo2ContaBancaria.exibirFicha();
                            }
                            case 2 -> {
                                pessoa1.setNome(JOptionPane.showInputDialog("Digite o nome: "));
                                pessoa1.setIdade(parseInt(JOptionPane.showInputDialog("Digite a idade: ")));
                                Modulo2IdadePessoa.verificarIdade(pessoa1.getIdade());
                            }
                            case 3 -> {
                                modulo2Produto1.setNome(JOptionPane.showInputDialog("Digite o nome do produto: "));
                                modulo2Produto1.setPreco(parseDouble(JOptionPane.showInputDialog("Digite o preço do produto: ")));
                                modulo2Produto1.aplicarDesconto(parseDouble(JOptionPane.showInputDialog("Desconto: ")));
                            }
                            case 4 -> {
                                modulo2Aluno2.setNome(JOptionPane.showInputDialog("Digite o nome: "));
                                modulo2Aluno2.setNota1(parseDouble(JOptionPane.showInputDialog("Digite a primeira nota: ")));
                                modulo2Aluno2.setNota2(parseDouble(JOptionPane.showInputDialog("Digite a segunda nota: ")));
                                modulo2Aluno2.setNota3(parseDouble(JOptionPane.showInputDialog("Digite a terceira nota: ")));
                                valorDouble = modulo2Aluno2.calcularMedia(modulo2Aluno2.getNota1(), modulo2Aluno2.getNota2(), modulo2Aluno2.getNota3());
                                JOptionPane.showMessageDialog(null,
                                        "Nome: " + modulo2Aluno2.getNome() +
                                                "\nNotas: " + modulo2Aluno2.getNota1() + ", " + modulo2Aluno2.getNota2() + ", " + modulo2Aluno2.getNota3() +
                                                "\nMédia: " + valorDouble);
                            }
                            case 5 -> {
                                livro1.setTitulo(JOptionPane.showInputDialog("Título: "));
                                livro1.setAutor(JOptionPane.showInputDialog("Autor: "));
                                livro1.exibirDetalhes();
                            }
                            case 0 -> System.out.println("Retornando...");
                            default -> System.out.println("Opção inválida.");
                        }
                    } while (subOpcao != 0);
                }

                case 3 -> {
                    int subOpcao;
                    do {
                        System.out.println("""
                                MÓDULO 3
                                Qual desafio realizar?
                                0 - Retornar
                                1 - Desafio 1
                                2 - Desafio 2
                                3 - Desafio 3
                                4 - Desafio 4
                                """);

                        while (!scanOpcao.hasNextInt()) {
                            System.out.println("Digite um número de 0 a 4.");
                            scanOpcao.next();
                        }
                        subOpcao = scanOpcao.nextInt();

                        switch (subOpcao) {
                            case 1 -> {
                                meuCarro2.setModelo(JOptionPane.showInputDialog("Digite o Modelo: "));
                                meuCarro2.definirPrecos(
                                        parseDouble(JOptionPane.showInputDialog("Digite o preço 1: ")),
                                        parseDouble(JOptionPane.showInputDialog("Digite o preço 2: ")),
                                        parseDouble(JOptionPane.showInputDialog("Digite o preço 3: "))
                                );
                                meuCarro2.exibir();
                            }
                            case 2 -> {
                                cachorro.emitirSom();
                                cachorro.abanar();
                                modulo3Gato.emitirSom();
                                modulo3Gato.arranhar();
                            }
                            case 3 -> {
                                do {
                                    valorInt = parseInt(JOptionPane.showInputDialog("""
                                            0 - Finalizar
                                            1 - Depositar
                                            2 - Sacar
                                            3 - Exibir saldo
                                            """));
                                    switch (valorInt) {
                                        case 0 -> System.out.println("Finalizando e retornando...");
                                        case 1 -> depositar(parseDouble(JOptionPane.showInputDialog("Quanto?")));
                                        case 2 -> sacar(parseDouble(JOptionPane.showInputDialog("Quanto?")));
                                        case 3 -> consultarSaldo();
                                        default -> JOptionPane.showMessageDialog(null, "Erro. Digite um número de 0 a 3.");
                                    }
                                } while (valorInt != 0);
                            }
                            case 4 -> {
                                do {
                                    valorInt = parseInt(JOptionPane.showInputDialog("""
                                            0 - Finalizar
                                            1 - Gerar número primo
                                            2 - Lista de números primos
                                            """));
                                    switch (valorInt) {
                                        case 0 -> System.out.println("Finalizando e retornando...");
                                        case 1 -> verificador.verificarPrimo(parseInt(JOptionPane.showInputDialog("Qual número?")));
                                        case 2 -> verificador.listarPrimos(parseInt(JOptionPane.showInputDialog("Até quanto?")));
                                        default -> JOptionPane.showMessageDialog(null, "Erro. Digite um número de 0 a 2.");
                                    }
                                } while (valorInt != 0);
                            }
                            case 0 -> System.out.println("Retornando...");
                            default -> System.out.println("Opção inválida.");
                        }
                    } while (subOpcao != 0);
                }
                case 4 -> {
                    int subOpcao;
                    do {
                        System.out.println("""
                                MÓDULO 4
                                Qual desafio realizar?
                                0 - Retornar
                                1 - Desafio 1
                                2 - Desafio 2
                                3 - Desafio 3
                                4 - Desafio 4
                                5 - Desafio 5
                                6 - Desafio 6
                                """);

                        while (!scanOpcao.hasNextInt()) {
                            System.out.println("Digite um número de 0 a 4.");
                            scanOpcao.next();
                        }
                        subOpcao = scanOpcao.nextInt();

                        switch (subOpcao) {
                            case 1 -> {
                                conversor.converterDolarParaReal(parseDouble(JOptionPane.showInputDialog(null, "Digite o valor: ")));
                            }
                            case 2 -> {
                                calculadora.calcularArea(parseDouble(JOptionPane.showInputDialog(null, "Digite a altura: ")), parseDouble(JOptionPane.showInputDialog(null, "Digite a largura: ")));
                                calculadora.calcularPerimetro(parseDouble(JOptionPane.showInputDialog(null, "Digite a altura: ")), parseDouble(JOptionPane.showInputDialog(null, "Digite a largura: ")));
                            }
                            case 3 -> {
                                tabuada.mostrarTabuada(parseInt(JOptionPane.showInputDialog(null, "Digite um número (Tabuada até 10 vai ser digitada no terminal)")));
                            }
                            case 4 -> {
                                double temperaturaCelsius = parseDouble(JOptionPane.showInputDialog(null, "Digite o valor Celsius: "));
                                double temperaturaFahrenheit = modulo4ConversorTemperatura.celsiusParaFahrenheit(temperaturaCelsius);
                                System.out.println(temperaturaCelsius + " Celsius é igual a " + temperaturaFahrenheit + " Fahrenheit.");

                                temperaturaFahrenheit = parseDouble(JOptionPane.showInputDialog(null, "Digite o valor Fahnheireit: "));
                                temperaturaCelsius = modulo4ConversorTemperatura.fahrenheitParaCelsius(temperaturaFahrenheit);
                                System.out.println(temperaturaFahrenheit + " Fahrenheit é igual a " + temperaturaCelsius + " Celsius.");
                            }
                            case 5 -> {
                                valorDouble = m4Livro.calcularPrecoFinal(100);
                                System.out.println(" calculo preço final do livro: " + valorDouble);

                                valorDouble = m4ProdutoFisico.calcularPrecoFinal(100);
                                
                                System.out.println(" calculo preço final do produto físico: " + valorDouble);
                            }
                            case 6 -> {
                                valorDouble = m4Produto.calcularPrecoTotal(5, 10);
                                System.out.println("Você comprou 5 panelas de 10 reais por " + (valorDouble * 0.95) + " pelo desconto de 5% de seu cupom.");

                                valorDouble = m4Servico.calcularPrecoTotal(5, 100);
                                System.out.println("Você contratou um serviço de streaming de 10R$ por hora por 5 horas, resultando em " + (valorDouble * 0.95) + " pelo desconto de 5% seu cupom.");
                            }
                            case 0 -> System.out.println("Retornando...");
                            default -> System.out.println("Opção inválida.");
                        }
                    } while (subOpcao != 0);
                }
            }
        } while (true);
    }
}