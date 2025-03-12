package Atividade_07_03_2025;

import Atividade_07_03_2025.models.Motoboy;
import Atividade_07_03_2025.models.Gerente;

public class Main
{
    public static void main(String[] args)
    {
        Motoboy motoboy = new Motoboy("João", "123.456.789-00", "01/01/2000", 1500.0, "ABC-1234");
        Gerente gerente = new Gerente("Maria", "987.654.321-00", "01/01/1990", 5000.0);

        System.out.println(motoboy.toString());
        System.out.println(gerente.toString());

        gerente.admitir(motoboy);
    }   
}
