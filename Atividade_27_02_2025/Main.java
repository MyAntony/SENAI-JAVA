package Atividade_27_02_2025;

import Atividade_27_02_2025.Models.*;

public class Main
{
    public static void main(String[] args)
    {
        Gato gato = new Gato();
        Pato pato = new Pato();
        Galo galo = new Galo();
        // Animal gato = new Gato(); <- Outra forma de instanciar
        // Animal[] animais = {gato, pato, galo}; <- Outra forma de instanciar
        
        System.out.println("Gato: " + gato.emitirSom() + " - " + gato.comer());
        System.out.println("Pato: " + pato.emitirSom() + " - " + pato.comer());
        System.out.println("Galo: " + galo.emitirSom() + " - " + galo.comer());
    }
}
