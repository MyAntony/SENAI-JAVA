package Atividade_06_03_2025.models;

public class Diretor extends Funcionario implements Contratacao
{

    private final double PREMIO = 1.2;
    // private final double DESCONTO = 0.2;

    public Diretor()
    {
    }

    public Diretor(String nome, String dataNascimento, Sexo sexo, Setor setor, double salario)
    {
        super(nome, dataNascimento, sexo, setor, salario);
    }

    @Override
    public double getSalarioFinal()
    {
        return super.getSalario() * PREMIO;
    }

    @Override
    public void contratar(Funcionario funcionario)
    {
        System.out.println("Contratando: " + funcionario.toString());
    }

    @Override
    public void demitir(Funcionario funcionario)
    {
        System.out.println("Demitindo: " + funcionario.toString());
    }

    @Override
    public String toString()
    {
        return "Diretor [nome=" + nome + ", dataNascimento=" + dataNascimento + ", PREMIO=" + PREMIO + ", sexo=" + sexo
                + ", setor=" + setor + ", salario=" + salario + "]";
    }

    
}
