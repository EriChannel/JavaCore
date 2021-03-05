import java.util.Scanner;

public class StudentManage {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap so luong sinh vien: ");
        int n = scanner.nextInt();

        Person [] student = new Person[n];
        for(int i = 0; i< n; i++){
            System.out.println("Nhap thong tin sinh vien thu "+ (i+1) + ":");
            student[i] = new Student();
            student[i].input();
        }

        for(int i = 0; i < n; i++){
            System.out.println("Thong tin cua sinh vien thu "+ (i+1)+":");
        System.out.println(student[i].toString());
        }

        scanner.close();
    }
}
