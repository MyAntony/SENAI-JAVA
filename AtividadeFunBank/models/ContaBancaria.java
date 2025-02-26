package AtividadeFunBank.models;

public class ContaBancaria
{
    private String banco;
    private String agencia;
    private String numeroConta;
    private TipoDeConta tipoDeConta;
    private double saldo;
    private double limiteCartao;
    
    // Constructor vazio
    public ContaBancaria()
    {

    }
    
    // Constructor com todos os atributos
    public ContaBancaria(String banco, String agencia, String numeroConta, TipoDeConta tipoDeConta, double saldo, double limiteCartao)
    {
        this.banco = banco;
        this.agencia = agencia;
        this.numeroConta = numeroConta;
        this.tipoDeConta = tipoDeConta;
        this.saldo = saldo;
        this.limiteCartao = limiteCartao;
    }

    // Getters e Setters
    public String getBanco()
    {
        return banco;
    }

    public void setBanco(String banco)
    {
        this.banco = banco;
    }

    public String getAgencia()
    {
        return agencia;
    }

    public void setAgencia(String agencia)
    {
        this.agencia = agencia;
    }

    public String getNumeroConta()
    {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta)
    {
        this.numeroConta = numeroConta;
    }

    public TipoDeConta getTipoDeConta()
    {
        return tipoDeConta;
    }

    public void setTipoDeConta(TipoDeConta tipoDeConta)
    {
        this.tipoDeConta = tipoDeConta;
    }

    public double getSaldo()
    {
        return saldo;
    }

    public void setSaldo(double saldo)
    {
        this.saldo = saldo;
    }

    public double getLimiteCartao()
    {
        return limiteCartao;
    }

    public void setLimiteCartao(double limiteCartao)
    {
        this.limiteCartao = limiteCartao;
    }

    @Override
    public String toString()
    {
        return "ContaBancaria [banco=" + banco + ", agencia=" + agencia + ", numeroConta=" + numeroConta
                + ", tipoDeConta=" + tipoDeConta + ", saldo=" + saldo + ", limiteCartao=" + limiteCartao + "]";
    }

    
}
