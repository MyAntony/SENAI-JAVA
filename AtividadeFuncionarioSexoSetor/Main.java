package AtividadeFuncionarioSexoSetor;

import AtividadeFuncionarioSexoSetor.models.Funcionario;
import AtividadeFuncionarioSexoSetor.models.Setor;
import AtividadeFuncionarioSexoSetor.models.Sexo;

public class Main
{
    public static void main(String[] args)
    {
        Funcionario funcionario = new Funcionario(1, "João", 2000, Setor.FINANCEIRO, Sexo.MASCULINO, 25);
        System.out.println(funcionario);
    }
}
