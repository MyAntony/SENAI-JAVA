package AtividadeProcessadorRAM.models;

public class Memoria extends Notebook
{
    private String capacidadeDeArmazenamento;

    public Memoria(String marca, String modelo, String capacidadeDeArmazenamento)
    {
        super(marca, modelo);
        this.capacidadeDeArmazenamento = capacidadeDeArmazenamento;
    }

    public String getCapacidadeDeArmazenamento()
    {
        return capacidadeDeArmazenamento;
    }

    public void setCapacidadeDeArmazenamento(String capacidadeDeArmazenamento)
    {
        this.capacidadeDeArmazenamento = capacidadeDeArmazenamento;
    }

    @Override
    public String toString()
    {
        return "Memoria: \nMarca: " + marca + "\nCapacidade de Armazenamento: " + capacidadeDeArmazenamento + "\nModelo: " + modelo + "\n";
    }

    
}
