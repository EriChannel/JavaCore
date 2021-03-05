public class App {
    public static void main(String[] args) throws Exception {
        Student student1 = new Student();
        student1.id = 1;
        student1.name = "Nguyen Van A";
        student1.theoryPoint = 8f;
        student1.practicePoint = 9.5f;

        Student student2 = new Student();
        student2.id = 2;
        student2.name = "Nguyen Thi B";
        student2.theoryPoint = 7.5f;
        student2.practicePoint = 9f;

        Student student3 = new Student();
        student3.id = 3;
        student3.name = "Tran Thi C";
        student3.theoryPoint = 8.5f;
        student3.practicePoint = 9.5f;

        Student student4 = new Student(4, "Le Thi D", 7.5f, 7.5f);

        System.out.printf("%5s %10s %20s %20s %20s \n", "MaSV","Ho ten", "Diem ly thuyet", "Diem thuc hanh", "Diem trung binh");
        student1.display();
        student2.display();
        student3.display();
        student4.display();
    }
}
