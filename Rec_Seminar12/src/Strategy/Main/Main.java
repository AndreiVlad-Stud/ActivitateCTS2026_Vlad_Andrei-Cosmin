package Strategy.Main;

import Strategy.Classes.ProbaScrisa;
import Strategy.Classes.Student;

public class Main {
    public static void main(String[] args) {
        Student student  = new Student("Andrei");
        student.examinare();

        student.setModSustinere(new ProbaScrisa());
        student.examinare();
    }
}
