package AtividadeFuncionarioSexoSetor.models;

public class Funcionario
{
    private int id;
    private String nome;
    private float salario;
    private Setor setor;
    private Sexo sexo;
    private int idade;
    
    // Constructor vazio
    public Funcionario()
    {
        
    }

    // Constructor preenchido
    public Funcionario(int id, String nome, float salario, Setor setor, Sexo sexo, int idade)
    {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
        this.setor = setor;
        this.sexo = sexo;
        this.idade = idade;
    }

    // Getters e Setters
    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public float getSalario()
    {
        return salario;
    }

    public void setSalario(float salario)
    {
        this.salario = salario;
    }

    public Setor getSetor()
    {
        return setor;
    }

    public void setSetor(Setor setor)
    {
        this.setor = setor;
    }

    public Sexo getSexo()
    {
        return sexo;
    }

    public void setSexo(Sexo sexo)
    {
        this.sexo = sexo;
    }

    public int getIdade()
    {
        return idade;
    }

    public void setIdade(int idade)
    {
        this.idade = idade;
    }

    @Override
    public String toString()
    {
        return "Funcionario [id=" + id + ", nome=" + nome + ", salario=" + salario + ", setor=" + setor + ", sexo="
                + sexo + ", idade=" + idade + "]";
    }

    
}
