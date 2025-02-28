package Atividade26_02_2025_Outra_Forma.models;

public class Processador extends Produto
{

    public Processador(String marca, double capacidadeDeArmazenamento, String modelo)
    {
        super(marca, capacidadeDeArmazenamento, modelo);
    }
    
    
        @Override
    public String toString()
    {
        return "Processador []" + super.toStringMarcaModeloFrequencia();
    }
    
}
