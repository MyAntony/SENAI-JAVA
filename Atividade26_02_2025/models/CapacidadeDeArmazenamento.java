package Atividade26_02_2025.models;

public class CapacidadeDeArmazenamento extends Produto
{
    private int capacidadeDeArmazenamento;
    private String tipoDeConexao;
    
    public CapacidadeDeArmazenamento(String marca, String modelo, int capacidadeDeArmazenamento, String tipoDeConexao)
    {
        super(marca, modelo);
        this.capacidadeDeArmazenamento = capacidadeDeArmazenamento;
        this.tipoDeConexao = tipoDeConexao;
    }

    public int getCapacidadeDeArmazenamento()
    {
        return capacidadeDeArmazenamento;
    }

    public void setCapacidadeDeArmazenamento(int capacidadeDeArmazenamento)
    {
        this.capacidadeDeArmazenamento = capacidadeDeArmazenamento;
    }

    public String getTipoDeConexao()
    {
        return tipoDeConexao;
    }

    public void setTipoDeConexao(String tipoDeConexao)
    {
        this.tipoDeConexao = tipoDeConexao;
    }

    @Override
    public String toString()
    {
        return "CapacidadeDeArmazenamento [marca=" + marca + ", capacidadeDeArmazenamento=" + capacidadeDeArmazenamento
                + ", modelo=" + modelo + ", tipoDeConexao=" + tipoDeConexao + "]";
    }

    
}
