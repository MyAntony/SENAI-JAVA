package AtividadeProcessadorRAM;

import AtividadeProcessadorRAM.models.Memoria;
import AtividadeProcessadorRAM.models.Processador;

public class Main
{
    public static void main(String[] args)
    {
        Memoria memoria = new Memoria("Kingston", "HyperX", "16GB");
        Processador processador = new Processador("Intel", "Core i7", "3.5GHz");

        System.out.println(memoria.toString());
        System.out.println(processador.toString());
    }

}
