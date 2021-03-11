import java.util.Scanner;

/**
 * Phone
 */
public class Phone {
    private String name;
    private String phoneNumber;
    Scanner scanner = new Scanner(System.in);

    public void input(){
        System.out.print("Nhap ten: ");
        name = scanner.nextLine();
        System.out.print("Nhap so dien thoai: ");
        phoneNumber = scanner.nextLine();
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return name +"\t"+ phoneNumber;
    }

    public Phone(String name, String phoneNumber, Scanner scanner) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.scanner = scanner;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    public Phone() {
    }

    

    
}