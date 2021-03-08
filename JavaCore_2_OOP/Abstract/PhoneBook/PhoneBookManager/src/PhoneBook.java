import java.util.Scanner;

public class PhoneBook extends Phone {
    private int id;

    public PhoneBook(String name, String phoneNumber, Scanner scanner, int id) {
        super(name, phoneNumber, scanner);
        this.id = id;
    }

    public PhoneBook() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public void input() {
        System.out.print("Nhap id: ");
        id = scanner.nextInt();
        scanner.nextLine();
        super.input();
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return id+"\t"+super.toString();
    }
    

    

    
    
}
