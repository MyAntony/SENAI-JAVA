package AtividadeClienteEndereco;

public class Cliente
{
    private String nome;
    private String idade;
    private Endereco endereco;
    
    public Cliente() //Construtor
    {
    }

    public Cliente(String nome, String idade, Endereco endereco) //Construtor
    {
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
    }

    
    
    public String getNome() //Getters e Setters
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public String getIdade()
    {
        return idade;
    }

    public void setIdade(String idade)
    {
        this.idade = idade;
    }

    public Endereco getEndereco()
    {
        return endereco;
    }

    public void setEndereco(Endereco endereco)
    {
        this.endereco = endereco;
    }

    @Override
    public String toString()
    {
        return "Cliente [nome=" + nome + ", idade=" + idade + ", endereco=" + endereco + "]";
    }

}
