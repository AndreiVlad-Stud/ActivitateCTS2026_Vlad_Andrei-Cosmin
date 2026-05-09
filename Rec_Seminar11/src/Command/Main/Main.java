package Command.Main;

import Command.Classes.*;

public class Main {
    public static void main(String[] args) {
        PersonalSpital medic = new Medic("Azorel");
        PersonalSpital asistenta = new Asistenta("Catrina");

        Pacient pacient1 = new Pacient("Alinutza");
        Pacient pacient2 = new Pacient("Catalin");

        Comanda comanda1 = new Internare(medic, pacient1);
        Comanda comanda2 = new Tratare(asistenta, pacient2);

        Operator operator = new Operator();

        operator.inregistreaza(comanda1);
        operator.inregistreaza(comanda2);

        operator.inregistreaza(new Tratare(asistenta,new  Pacient("Adelina")));
        operator.executaFisa();
        operator.executaFisa();
        operator.executaFisa();

    }
}
