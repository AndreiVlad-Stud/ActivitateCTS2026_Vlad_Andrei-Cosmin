package pregatireTest2.strategy.Main;

import pregatireTest2.strategy.Classes.ProcesorAbonament;
import pregatireTest2.strategy.Classes.Student;

public class Main {
    static void main(String[] args) {
        ProcesorAbonament procesorAbonament = new ProcesorAbonament(new Student());
        procesorAbonament.reducereAbonament(200);
    }
}
