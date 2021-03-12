import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong sach: ");
        int n = sc.nextInt();
        Book[] books = new Book[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Chon loai sach muon nhap: \n1-Sach giao khoa\t2-Do an\t\t3-Tai lieu dien tu: ");
            switch (sc.nextInt()) {
            case 1:
                books[i] = new SchoolBook();
                break;
            case 2:
                books[i] = new GraduationThesis();
                break;
            case 3:
                books[i] = new ElectronicDocuments();
                break;
            default:
                System.out.println("Dữ liệu nhập vào không chính xác: ");
                System.exit(0);
            }
            books[i].input();
        }

        System.out.println("\nDanh Sách tài liệu vừa nhập là: ");
        for (int i = 0; i < n; i++) {
            System.out.println(books[i].toString());
        }
        sc.close();
    }
}
