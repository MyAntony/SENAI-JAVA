package Atividade_06_03_2025.models;

public class Motoboy extends Funcionario
{
    private String carteiraDeHabilitacao;
    
    public Motoboy(String nome, String dataNascimento, Sexo sexo, Setor setor, double salario, String carteiraDeHabilitacao)
    {
        super(nome, dataNascimento, sexo, setor, salario);
        this.carteiraDeHabilitacao = carteiraDeHabilitacao;
    }

    public String getCarteiraDeHabilitacao()
    {
        return carteiraDeHabilitacao;
    }

    public void setCarteiraDeHabilitacao(String carteiraDeHabilitacao)
    {
        this.carteiraDeHabilitacao = carteiraDeHabilitacao;
    }

    @Override
    public String toString()
    {
        return "Motoboy [nome=" + nome + ", carteiraDeHabilitacao=" + carteiraDeHabilitacao + ", dataNascimento="
                + dataNascimento + ", sexo=" + sexo + ", setor=" + setor + ", salario=" + salario + "]";
    }

    @Override
    public double getSalarioFinal()
    {
        return super.salario;
    }
    
}
