package AtividadeVeiculoLivro;

import AtividadeVeiculoLivro.models.Veiculo;

import java.util.Scanner;

import AtividadeVeiculoLivro.models.Livro2;

public class Main
{
    public static void main(String[] args)
    {
        int pergunta;
        int pergunta2;
        int i;

        Scanner ler = new Scanner(System.in);

        System.out.println("Quantos carros você deseja cadastrar? ");
        pergunta = ler.nextInt();
        System.out.println("Quantos livros você deseja cadastrar? ");
        pergunta2 = ler.nextInt();

        Veiculo[] veiculos = new Veiculo[pergunta];
        Livro2[] livros = new Livro2[pergunta2];

        for(i = 0; i < pergunta; i++)
        {
            System.out.println("Digite a placa do veículo: ");
            String placa = ler.next();
            System.out.println("Digite a cor do veículo: ");
            String cor = ler.next();
            System.out.println("Digite a quantidade de passageiros do veículo: ");
            int quantidadePassageiros = ler.nextInt();
            System.out.println("Digite a capacidade do tanque do veículo: ");
            double capacidadeTanque = ler.nextDouble();
            System.out.println("Digite a velocidade máxima do veículo: ");
            double velocidadeMaxima = ler.nextDouble();
            System.out.println("Digite o consumo médio por km do veículo: ");
            double consumoMedioPorKm = ler.nextDouble();

            veiculos[i] = new Veiculo(placa, cor, quantidadePassageiros, capacidadeTanque, velocidadeMaxima, consumoMedioPorKm);

            for(i = 0; i < pergunta2; i++)
            {
                System.out.println("Digite o título do livro: ");
                String titulo = ler.next();
                System.out.println("Digite o autor do livro: ");
                String autor = ler.next();
                System.out.println("Digite o ISBN do livro: ");
                int isbn = ler.nextInt();
                System.out.println("Digite o número de páginas do livro: ");
                int numeroPaginas = ler.nextInt();
                System.out.println("Digite o valor de compra do livro: ");
                double valorCompra = ler.nextDouble();

                livros[i] = new Livro2(titulo, autor, isbn, numeroPaginas, valorCompra);

                ler.close();

                for(i = 0; i < pergunta; i++)
                {
                    System.out.println("O " + (i+1) + "º veículo é: " + veiculos[i].getPlaca());
                    System.out.println("De cor: " + veiculos[i].getCor());
                    System.out.println("Possui capacidade para " + veiculos[i].getQuantidadePassageiros() + " passageiros");
                    System.out.println("Possui um tanque de " + veiculos[i].getCapacidadeTanque() + " litros");
                    System.out.println("Alcança a velocidade máxima de " + veiculos[i].getVelocidadeMaxima() + " km/h");
                    System.out.println("Possui um consumo médio de " + veiculos[i].getConsumoMedioPorKm() + " km/l");
                }

                for(i = 0; i < pergunta2; i++)
                {
                    System.out.println("O " + (i+1) + "º livro é: " + livros[i].getTitulo());
                    System.out.println("Escrito por: " + livros[i].getAutor());
                    System.out.println("Possui " + livros[i].getNumeroPaginas() + " páginas");
                    System.out.println("Custa R$ " + livros[i].getValorCompra());
                }
            }
        }
    }
}
