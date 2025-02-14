package AtividadeLivro;

import java.util.Scanner;

import AtividadeLivro.models.Livro;

public class Main
{
    public static void main(String[] args)
    {
        Livro[] livro = new Livro[3];

        livro[0] = new Livro("Robô Selvagwem", "Peter Brown", 288, 37.60);
        livro[1] = new Livro("As Crônicas de Gelo e Fogo", "George R R Martin", 592, 77.49);

        Scanner ler = new Scanner(System.in);
        
        for(int i = 0; i <= 1; i++)
        {
            System.out.println("O " + (i+1) + "º livro é: " + livro[i].getTitulo());
            System.out.println("Escrito por: " + livro[i].getAutor());
            System.out.println("Possui " + livro[i].getPaginas() + " páginas");
            System.out.println("Custa R$ " + livro[i].getPreco());
        }

        System.out.println("Digite o nome do livro: ");
        String nomeDoLivro = ler.nextLine();
        System.out.println("Digite o nome do autor:");
        String nomeDoAutor = ler.nextLine();
        System.out.println("Digite o a quantidade de páginas do livro: ");
        int paginasDoLivro = ler.nextInt();
        System.out.println("Digite o preço do livro: ");
        double precoDoLivro = ler.nextDouble();


        livro[2] = new Livro(nomeDoLivro, nomeDoAutor, paginasDoLivro, precoDoLivro);

        for(int i = 0; i <= 2; i++)
        {
            System.out.println("O " + (i+1) + "º livro é: " + livro[i].getTitulo());
            System.out.println("Escrito por: " + livro[i].getAutor());
            System.out.println("Possui " + livro[i].getPaginas() + " páginas");
            System.out.println("Custa R$ " + livro[i].getPreco());
        }

    }
}
