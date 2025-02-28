package Atividade_27_02_2025.Models;

public class Gato implements Animal
{
    
    @Override
    public String comer()
    {
        return "Ração de Gato";
    }

    @Override
    public String emitirSom()
    {
        return "Miado";
    }
}
