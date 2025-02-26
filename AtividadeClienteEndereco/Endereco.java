package AtividadeClienteEndereco;

public class Endereco
{
    private String logradouro;
    private String numero;
    private String cidade;
    

    
    public Endereco(String logradouro, String numero, String cidade) //Construtor
    {
        this.logradouro = logradouro;
        this.numero = numero;
        this.cidade = cidade;
    }

    public Endereco() //Construtor
    {
    }
    
    

    public String getLogradouro() //Getters e Setters
    {
        return logradouro;
    }
    public void setLogradouro(String logradouro)
    {
        this.logradouro = logradouro;
    }
    public String getNumero()
    {
        return numero;
    }
    public void setNumero(String numero)
    {
        this.numero = numero;
    }
    public String getCidade()
    {
        return cidade;
    }
    public void setCidade(String cidade)
    {
        this.cidade = cidade;
    }

    @Override
    public String toString()
    {
        return "Endereco [logradouro=" + logradouro + ", numero=" + numero + ", cidade=" + cidade + "]";
    }
    
}
