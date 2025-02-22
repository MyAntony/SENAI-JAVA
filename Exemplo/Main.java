public class Main
{
    public static void main(String[] args)
    {
        Cliente cliente = new Cliente("João", 25, "10/10/2010", "Dinheiro");
        Funcionario funcionario = new Funcionario("Maria", 30, "1234", "Gerente", 5000);

        System.out.println(cliente.toString());
        System.out.println(funcionario.toString());
    }
}
