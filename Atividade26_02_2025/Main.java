package Atividade26_02_2025;

import Atividade26_02_2025.models.CapacidadeDeArmazenamento;
import Atividade26_02_2025.models.Memoria;
import Atividade26_02_2025.models.PlacaMae;
import Atividade26_02_2025.models.Processador;

public class Main
{
    public static void main(String[] args)
    {
        Processador processador = new Processador("AMD", "Ryzen 7 5700U", 2.4);
        PlacaMae placaMae = new PlacaMae("ASUS", "ROG STRIX B450-F GAMING", "AM4");
        Memoria memoria = new Memoria("Corsair", "Vengeance LPX", 3200, 16);
        CapacidadeDeArmazenamento capacidadeDeArmazenamento = new CapacidadeDeArmazenamento("Seagate", "Barracuda", 2000, "SATA");
        
        System.out.println(processador);
        System.out.println(placaMae);
        System.out.println(memoria);
        System.out.println(capacidadeDeArmazenamento);
    }

}
