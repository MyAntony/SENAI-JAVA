package Atividade_06_03_2025.models;

public class Diretor extends Funcionario
{

    private final double PREMIO = 0.2;

    public Diretor()
    {
        
    }



    public Diretor(String nome, String dataNascimento, Sexo sexo, Setor setor, double salario)
    {
        super(nome, dataNascimento, sexo, setor, salario);
    }

    public double getPREMIO()
    {
        return PREMIO;
    }

    @Override
    public double getSalarioFinal()
    {
        double resultado = 0;
        resultado += super.salario * this.PREMIO;
        return resultado;
    }

}
