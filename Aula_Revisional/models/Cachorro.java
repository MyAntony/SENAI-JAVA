package Aula_Revisional.models;

public class Cachorro implements Animal
{
    @Override
    public String emitirSom()
    {
        return "Auau";
    }

    @Override
    public String comer()
    {
        return "Ração de cachorro";
    }   
}