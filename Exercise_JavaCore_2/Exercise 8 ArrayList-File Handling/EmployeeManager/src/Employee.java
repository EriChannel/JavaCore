import java.util.Scanner;

public class Employee {
    private String id;
    private String name;
    private String position;
    private String address;
    private double salary;
    Scanner scanner = new Scanner(System.in);

    public void input(){
        System.out.print("Nhap ma nhan vien: ");
        id = scanner.nextLine();
        System.out.print("Nhap ho ten: ");
        name = scanner.nextLine();
        System.out.print("Nhap chuc vu: ");
        position = scanner.nextLine();
        System.out.print("Nhap dia chi: ");
        address = scanner.nextLine();
        System.out.print("Nhap luong: ");
        salary = scanner.nextDouble();
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return id +"\t"+name+"\t"+position+"\t"+address+"\t"+salary;
    }
    public Employee(String id, String name, String position, String address, double salary) {
        this.id = id;
        this.name = name;
        this.position = position;
        this.address = address;
        this.salary = salary;
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
    public String getPosition() {
        return position;
    }
    public void setPosition(String position) {
        this.position = position;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    
    
}
