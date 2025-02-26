package AtividadeClienteEndereco;

public class Main
{
    public static void main(String[] args)
    {
        //Forma mais ineficiente
        
        Endereco endereco = new Endereco("Rua A", "23", "Salvador");
        Cliente cliente = new Cliente("Marta", "33", endereco);

        System.out.println(cliente.toString());

        //Forma mais eficiente
        
        Cliente cliente2 = new Cliente("José", "55", new Endereco("Rua B", "50", "Rio de Janeiro"));
        System.out.println(cliente2.toString());
    }
}
