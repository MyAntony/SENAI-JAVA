package Aula_Revisional.models;

public class Pato implements Animal
{
    
    @Override
    public String emitirSom()
    {
        return "Quack";
    }

    @Override
    public String comer()
    {
        return "Ração de pato";
    }
}
