package ProjectOne;

public class Teacher {
    String name;
    String mpno;
    String branch;

    public Teacher(String name, String mpno, String branch) {
        this.name = name;
        this.mpno = mpno;
        this.branch = branch;
    }

    public void Print() {
        System.out.println("İsim: " + name);
        System.out.println("Telefon Numarası:" + mpno);
        System.out.println("Verdiği Ders:" + branch);
    }

}
