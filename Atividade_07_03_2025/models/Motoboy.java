package Atividade_07_03_2025.models;

public class Motoboy extends Funcionario
{
    private String placaMoto;

    public Motoboy(String nome, String cpf, String dataNascimento, double SalarioBase, String placaMoto)
    {
        super(nome, cpf, dataNascimento, SalarioBase);
        this.placaMoto = placaMoto;
    }

    public String getPlacaMoto()
    {
        return placaMoto;
    }

    public void setPlacaMoto(String placaMoto)
    {
        this.placaMoto = placaMoto;
    }
    
    public double obterSalarioFinal()
    {
        return salarioBase;
    }

    @Override
    public String toString()
    {
        return "Motoboy [placaMoto=" + placaMoto + ", nome=" + nome + ", cpf=" + cpf + ", dataNascimento=" + dataNascimento + ", SalarioBase=" + salarioBase + "]";
    }

    
}
