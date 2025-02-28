package Atividade26_02_2025.models;

public class Memoria extends Produto
{
    private double frequencia;
    private int capacidadeDeArmazenamento;
    
    public Memoria(String marca, String modelo, double frequencia, int capacidadeDeArmazenamento)
    {
        super(marca, modelo);
        this.frequencia = frequencia;
        this.capacidadeDeArmazenamento = capacidadeDeArmazenamento;
    }

    public double getFrequencia()
    {
        return frequencia;
    }

    public void setFrequencia(double frequencia)
    {
        this.frequencia = frequencia;
    }

    public int getCapacidadeDeArmazenamento()
    {
        return capacidadeDeArmazenamento;
    }

    public void setCapacidadeDeArmazenamento(int capacidadeDeArmazenamento)
    {
        this.capacidadeDeArmazenamento = capacidadeDeArmazenamento;
    }

    @Override
    public String toString()
    {
        return "Memoria [marca=" + marca + ", frequencia=" + frequencia + ", modelo=" + modelo
                + ", capacidadeDeArmazenamento=" + capacidadeDeArmazenamento + "]";
    }
    
    
}
