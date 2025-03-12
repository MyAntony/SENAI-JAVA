package Atividade_07_03_2025.models;

public class Gerente extends CargoDeConfianca implements Contratacao
{
    public Gerente(String nome, String cpf, String dataNascimento, double salarioBase)
    {
        super(nome, cpf, dataNascimento, salarioBase, Bonificacao.GERENTE);
    }

    @Override
    public double obterSalarioFinal()
    {
        return salarioBase * super.getBonificacao().getValor();
    }

    @Override
    public void admitir(Funcionario funcionario)
    {
        System.out.println("Contratando funcionário: " + funcionario.getNome());
    }

    @Override
    public void demitir(Funcionario funcionario)
    {
        System.out.println("Demitindo funcionário: " + funcionario.getNome());
    }

    @Override
    public String toString() {
        return "Gerente []" + super.getBonificacao();
    }

    
}
