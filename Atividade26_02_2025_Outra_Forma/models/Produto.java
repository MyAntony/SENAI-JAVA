package Atividade26_02_2025_Outra_Forma.models;

public abstract class Produto
{
    protected String marca;
    protected String modelo;
    protected double frequencia;
    protected double capacidadeDeArmazenamento;
    
    public Produto(String marca, String modelo)
    {
        this.marca = marca;
        this.modelo = modelo;
    }

    public Produto(String marca, String modelo, double frequencia)
    {
        this.marca = marca;
        this.modelo = modelo;
        this.frequencia = frequencia;
    }

    public Produto(String marca, double capacidadeDeArmazenamento, String modelo)
    {
        this.marca = marca;
        this.modelo = modelo;
        this.capacidadeDeArmazenamento = capacidadeDeArmazenamento;
    }

    public String getMarca()
    {
        return marca;
    }

    public void setMarca(String marca)
    {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo)
    {
        this.modelo = modelo;
    }

    public double getFrequencia()
    {
        return frequencia;
    }

    public void setFrequencia(double frequencia)
    {
        this.frequencia = frequencia;
    }

    public double getCapacidadeDeArmazenamento()
    {
        return capacidadeDeArmazenamento;
    }

    public void setCapacidadeDeArmazenamento(double capacidadeDeArmazenamento)
    {
        this.capacidadeDeArmazenamento = capacidadeDeArmazenamento;
    }

    public String toStringMarcaModelo() {
        return "Produto [marca=" + marca + ", modelo=" + modelo + "]";
    }

    public String toStringMarcaModeloFrequencia()
    {
        return "Produto [marca=" + marca + ", modelo=" + modelo + ", frequencia=" + frequencia + "]";
    }

    public String toStringMarcaModeloCapacidadeDeArmazenamento()
    {
        return "Produto [marca=" + marca + ", modelo=" + modelo + ", capacidadeDeArmazenamento="
                + capacidadeDeArmazenamento + "]";
    }
    
}
