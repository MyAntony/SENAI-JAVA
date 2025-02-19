package AtividadeClientePet;

import AtividadeClientePet.models.Cliente;
import AtividadeClientePet.models.Pet;

public class Main
{
    public static void main(String[] args)
    {
        Cliente cliente = new Cliente("Camila", "20", new Pet("Pipita", "1", "Pinscher"));
        System.out.println(cliente.toString());
    }
}
