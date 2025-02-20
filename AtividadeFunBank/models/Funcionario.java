package AtividadeFunBank.models;

public class Funcionario
{
    private String codigoFuncionario;
    private String nome;
    private String endereco;
    private String telefone;
    private String email;
    private ContaBancaria contaBancaria;


    // Constrctor vazio
    public Funcionario()
    {

    }

    // Constructor com todos os atributos
    public Funcionario(String codigoFuncionario, String nome, String endereco, String telefone, String email, ContaBancaria contaBancaria)
    {
        this.codigoFuncionario = codigoFuncionario;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.contaBancaria = contaBancaria;
    }

    // Getters e Setters
    public String getCodigoFuncionario()
    {
        return codigoFuncionario;
    }

    public void setCodigoFuncionario(String codigoFuncionario)
    {
        this.codigoFuncionario = codigoFuncionario;
    }

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public String getEndereco()
    {
        return endereco;
    }

    public void setEndereco(String endereco)
    {
        this.endereco = endereco;
    }

    public String getTelefone()
    {
        return telefone;
    }

    public void setTelefone(String telefone)
    {
        this.telefone = telefone;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public ContaBancaria getContaBancaria()
    {
        return contaBancaria;
    }

    public void setContaBancaria(ContaBancaria contaBancaria)
    {
        this.contaBancaria = contaBancaria;
    }

    @Override
    public String toString()
    {
        return "Funcionario [codigoFuncionario=" + codigoFuncionario + ", nome=" + nome + ", endereco=" + endereco + ", telefone=" + telefone + ", email=" + email + ", contaBancaria=" + contaBancaria + "]";
    }
    
}
