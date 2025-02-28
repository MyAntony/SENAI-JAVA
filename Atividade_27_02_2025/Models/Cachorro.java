package Atividade_27_02_2025.Models;

public class Cachorro implements Animal
{

    @Override
    public String comer()
    {
        return "Ração de Cachorro";
    }

    @Override
    public String emitirSom()
    {
        return "Latido";
    }
}
