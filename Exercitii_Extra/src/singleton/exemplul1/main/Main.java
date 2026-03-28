package singleton.exemplul1.main;

import singleton.exemplul1.clase.Agentie;

public class Main {
    public static void main(String[] args) {
        Agentie agentie1 = Agentie.getInstance("Agentia 23", 100, 55);
        agentie1.vindePachet();
        agentie1.afiseazaSituatie();

        Agentie agentie2 = Agentie.getInstance("Agentia 69", 10, 30);
        agentie2.afiseazaSituatie();

        if (agentie1 == agentie2) {
            System.out.println("agentie1 si agentie2 sunt aceeasi instanta.");
        }
    }
}