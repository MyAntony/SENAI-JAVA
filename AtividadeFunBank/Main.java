package AtividadeFunBank;

import AtividadeFunBank.models.ContaBancaria;
import AtividadeFunBank.models.Funcionario;
import AtividadeFunBank.models.TipoDeConta;

public class Main
{
    public static void main(String[] args)
    {
        Funcionario funcionario = new Funcionario ("001", "Antony", "Rua Onze de Maio, 10, Ribeira", "+55 71 98952-0146", "antony05rafael@gmail.com", new ContaBancaria("323 Mercado Pago", "0001", "2755493880-7", TipoDeConta.CORRENTE, 22.20, 1.600,00));
        System.out.println(funcionario.toString());
    }
}
