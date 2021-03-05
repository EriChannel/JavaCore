

public class EmployeeManager {
    public static void main(String[] args) throws Exception {

        Developer developer = new Developer();
        System.out.println("Nhap thong tin lap trinh vien: ");
        developer.input();
        System.out.println("Thong tin lap trinh vien: ");
        developer.display();

        QA qa = new QA();
        System.out.println("Nhap thong tin kiem thu vien:");
        qa.input();
        System.out.println("Thong tin kiem thu vien: ");
        qa.display();

    }
}
