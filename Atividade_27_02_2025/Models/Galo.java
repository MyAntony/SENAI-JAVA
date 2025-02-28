package Atividade_27_02_2025.Models;

public class Galo implements Animal
{
    
    @Override
    public String comer()
    {
        return "Ração de Galo";
    }

    @Override
    public String emitirSom()
    {
        return "Cacarejo";
    }
}
