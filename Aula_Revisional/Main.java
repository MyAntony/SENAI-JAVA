package Aula_Revisional;

import Aula_Revisional.models.Galo;
import Aula_Revisional.models.Gato;
import Aula_Revisional.models.Pato;

public class Main
{
    public static void main(String[] args)
    {
        Galo galo = new Galo();
        Gato gato = new Gato();
        Pato pato = new Pato();

        System.out.println("Gato: " + gato.emitirSom() + " - " + gato.comer());
        System.out.println("Pato: " + pato.emitirSom() + " - " + pato.comer());
        System.out.println("Galo: " + galo.emitirSom() + " - " + galo.comer());
    }
}
