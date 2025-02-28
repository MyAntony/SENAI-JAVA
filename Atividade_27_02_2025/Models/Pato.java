package Atividade_27_02_2025.Models;

public class Pato implements Animal
{
    
    @Override
    public String comer()
    {
        return "Ração de Pato";
    }

    @Override
    public String emitirSom()
    {
        return "Quack";
    }
}
