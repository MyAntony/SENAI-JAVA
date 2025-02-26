package AtividadeVeiculoLivro.models;

public class Veiculo
{
    private String placa;
    private String cor;
    private int quantidadePassageiros;
    private double capacidadeTanque;
    private double velocidadeMaxima;
    private double consumoMedioPorKm;
    
    
    
    public Veiculo(String placa, String cor, int quantidadePassageiros, double capacidadeTanque, double velocidadeMaxima, double consumoMedioPorKm)
    {
        this.placa = placa;
        this.cor = cor;
        this.quantidadePassageiros = quantidadePassageiros;
        this.capacidadeTanque = capacidadeTanque;
        this.velocidadeMaxima = velocidadeMaxima;
        this.consumoMedioPorKm = consumoMedioPorKm;
    }



    public String getPlaca(){
        return placa;
    }
    public void setPlaca(String placa)
    {
        this.placa = placa;
    }
    public String getCor()
    {
        return cor;
    }
    public void setCor(String cor)
    {
        this.cor = cor;
    }
    public int getQuantidadePassageiros()
    {
        return quantidadePassageiros;
    }
    public void setQuantidadePassageiros(int quantidadePassageiros)
    {
        this.quantidadePassageiros = quantidadePassageiros;
    }
    public double getCapacidadeTanque()
    {
        return capacidadeTanque;
    }
    public void setCapacidadeTanque(double capacidadeTanque)
    {
        this.capacidadeTanque = capacidadeTanque;
    }
    public double getVelocidadeMaxima()
    {
        return velocidadeMaxima;
    }
    public void setVelocidadeMaxima(double velocidadeMaxima)
    {
        this.velocidadeMaxima = velocidadeMaxima;
    }
    public double getConsumoMedioPorKm()
    {
        return consumoMedioPorKm;
    }
    public void setConsumoMedioPorKm(double consumoMedioPorKm)
    {
        this.consumoMedioPorKm = consumoMedioPorKm;
    }

    
    
}
