package Atividade_06_03_2025;

import Atividade_06_03_2025.models.Diretor;
import Atividade_06_03_2025.models.Funcionario;
import Atividade_06_03_2025.models.Motoboy;
import Atividade_06_03_2025.models.Setor;
import Atividade_06_03_2025.models.Sexo;
import Atividade_06_03_2025.models.Contratacao;

public class Main
{
    public static void main(String[] args)
    {
        Funcionario diretor = new Diretor("João", "01/01/1990", Sexo.MASCULINO, Setor.RECURSOS_HUMANOS, 10000);
        Funcionario motoboy = new Motoboy("José", "01/01/1990", Sexo.MASCULINO, Setor.OPERACIONAL, 1518, "123456789");

        System.out.println(diretor.toString());
        System.out.println(motoboy.toString());

        // diretor.contratar(motoboy);
    }
}
