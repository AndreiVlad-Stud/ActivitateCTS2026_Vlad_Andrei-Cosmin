package prototype.exemplul1.main;

import prototype.exemplul1.clase.Invitatie;

public class Main {
   public static void main(String[] args) {
       Invitatie invitatie = new Invitatie("Revelion 2027", "Marcel", 2, false);
       Invitatie copie1 = (Invitatie) invitatie.clone();
       copie1.setAreAccessVip(true);
       copie1.setNumeInvitat("Gigel");

       Invitatie copie2 = (Invitatie) invitatie.clone();
       copie2.setNumeInvitat("Mihai");

       Invitatie copie3 = (Invitatie) invitatie.clone();
       copie3.setNumeInvitat("Ana");
       copie3.setNumarLoc(3);

       System.out.println(invitatie);
       System.out.println(copie1);
       System.out.println(copie2);
       System.out.println(copie3);

    }
}
