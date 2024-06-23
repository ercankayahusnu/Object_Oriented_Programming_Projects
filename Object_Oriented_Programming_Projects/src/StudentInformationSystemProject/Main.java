package StudentInformationSystemProject;

public class Main {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Mahmut", "9054451213", "TRH");
        Course Tarih = new Course("Tarih", "101", "TRH");
        Tarih.addTeacher(teacher1);

        Teacher teacher2 = new Teacher("Fatih", "904456739", "BDN");
        Course Beden = new Course("Beden", "102", "BDN");
        Beden.addTeacher(teacher2);

        Teacher teacher3 = new Teacher("Adnan", "901111222", "KMY");
        Course Kimya = new Course("Kimya", "103", "KMY");
        Kimya.addTeacher(teacher3);

        Student student1 = new Student("Hüsnü", "6048", "4", Tarih, Beden, Kimya);
        student1.addBullExamNote(50, 90, 70);
        student1.isPass();

        Student student2 = new Student("Ayşe", "5901", "3", Tarih, Beden, Kimya);
        student2.addBullExamNote(20, 90, 35);
        student2.isPass();

        Student student3 = new Student("Ali", "5871", "2", Tarih, Beden, Kimya);
        student3.addBullExamNote(50, 65, 28);
        student3.isPass();

    }
}
