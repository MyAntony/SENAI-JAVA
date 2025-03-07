package Atividade_06_03_2025.models;

public abstract class Funcionario
{
    protected String nome;
    protected String dataNascimento;
    protected Sexo sexo;
    protected Setor setor;
    protected double salario;
    
    public Funcionario()
    {
        
    }

    public Funcionario(String nome, String dataNascimento, Sexo sexo, Setor setor, double salario)
    {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.setor = setor;
        this.salario = salario;
    }

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public String getDataNascimento()
    {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento)
    {
        this.dataNascimento = dataNascimento;
    }

    public Sexo getSexo()
    {
        return sexo;
    }

    public void setSexo(Sexo sexo)
    {
        this.sexo = sexo;
    }

    public Setor getSetor()
    {
        return setor;
    }

    public void setSetor(Setor setor)
    {
        this.setor = setor;
    }

    public double getSalario()
    {
        return salario;
    }

    public void setSalario(double salario)
    {
        this.salario = salario;
    }

    @Override
    public String toString()
    {
        return "Funcionario [nome=" + nome + ", dataNascimento=" + dataNascimento + ", sexo=" + sexo + ", setor="
                + setor + ", salario=" + salario + "]";
    }

    public abstract double getSalarioFinal();
    
}
