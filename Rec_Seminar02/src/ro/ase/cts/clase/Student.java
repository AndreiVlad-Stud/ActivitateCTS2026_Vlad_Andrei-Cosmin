package ro.ase.cts.clase;

public class Student extends Aplicant {
    protected String facultate;
    protected int an_studii;
    private static int VALOARE_FINANTARE_STUDENT = 20;

    public void setFacultate(String facultate) {
        this.facultate = facultate;
    }

    public void setAn_studii(int an_studii) {
        this.an_studii = an_studii;
    }

    public Student() {
        super();
    }

    @Override
    public void afiseazaFinantare() {
        System.out.println("Studentul "+getNume()+" "+getPrenume()+" primeste"+Student.VALOARE_FINANTARE_STUDENT+" Euro/zi in proiect.");
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Student{");
        sb.append(super.toString());
        sb.append("facultate= '").append(facultate).append('\'');
        sb.append(", an_studii =").append(an_studii);
        sb.append('}');
        return sb.toString();
    }

    public static void setValoareFinantareStudent(int VALOARE_FINANTARE_STUDENT) {
        Student.VALOARE_FINANTARE_STUDENT = VALOARE_FINANTARE_STUDENT;
    }

}
