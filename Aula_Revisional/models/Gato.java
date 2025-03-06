package Aula_Revisional.models;

public class Gato implements Animal
{
    
    @Override
    public String emitirSom()
    {
        return "Miau";
    }

    @Override
    public String comer()
    {
        return "Ração de gato";
    }
}
