import java.util.Scanner;

public class Employee {
    private String id;
    private String name;
    private int age;
    private long phoneNumber;
    private String email;
    private long basicSalary;

    Scanner scanner = new Scanner(System.in);


    public Employee(String id, String name, int age, long phoneNumber, String email, long basicSalary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.basicSalary = basicSalary;
    }

    public Employee() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getBasicSalary() {
        return basicSalary;
    }
    
    
    public void setBasicSalary(long basicSalary) {
        this.basicSalary = basicSalary;
    }

    //Phuong thuc nhap thong tin
    public void input(){
        System.out.print("Nhap ma nhan vien: ");
        id = scanner.nextLine();
        System.out.print("Nhap ho ten: ");
        name = scanner.nextLine();
        System.out.print("Nhap tuoi: ");
        age = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhap sdt: ");
        phoneNumber = Long.valueOf(scanner.nextLine());
        System.out.print("Nhap email: ");
        email = scanner.nextLine();
        System.out.print("Nhap luong co ban: ");
        basicSalary = scanner.nextLong();
    }

    //Phuong thuc in thong tin
    public void display(){
        System.out.print("\nMa nhan vien: "+ getId()+"\t Ho ten: "+getName() +"\tTuoi: "+getAge()+"\tSDT: "+getPhoneNumber()+
        "\tEmail: "+getEmail()+"\tLuong co ban: "+getBasicSalary());

    }

    
    
}
