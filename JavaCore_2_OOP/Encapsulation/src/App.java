import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Student student1 = new Student();


        Scanner scanner = new Scanner(System.in);
        int id;
        String name;
        float theoryPoint, practicePoint;
        
        System.out.print("Nhap ma sinh vien: ");
        id = Integer.valueOf(scanner.nextLine()); 
        System.out.print("Nhap ten: ");
        name = scanner.nextLine();
        System.out.print("Nhap diem ly thuyet: ");
        theoryPoint = scanner.nextFloat();
        System.out.print("Nhap diem thuc hanh: ");
        practicePoint = scanner.nextFloat();

        //Su dung set de ghi du lieu
        student1.setId(id);
        student1.setName(name);
        student1.setTheoryPoint(theoryPoint);
        student1.setPracticePoint(practicePoint);

        System.out.printf("%5s %10s %20s %20s %20s \n", "MaSV","Ho ten", "Diem ly thuyet", "Diem thuc hanh", "Diem trung binh");
        student1.display();

        System.out.println(student1.hashCode());
        System.out.println(student1.getClass().getName());
    }
}
