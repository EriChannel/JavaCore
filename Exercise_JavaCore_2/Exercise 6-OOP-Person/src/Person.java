
import java.util.Scanner;

/**
 * Person
 */
public class Person {

    private String name;
    private String gender;
    private String address;
    private String dateOfBirth;
    Scanner scan = new Scanner(System.in);

    public Person() {
    }

    public Person(String name, String gender, String address, String dateOfBirth) {
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Scanner getScan() {
        return scan;
    }

    public void setScan(Scanner scan) {
        this.scan = scan;
    }

    public void input(){
        System.out.print("Nhap ho ten: ");
        name= scan.nextLine();
        System.out.print("Nhap gioi tinh: ");
        gender= scan.nextLine();
        System.out.print("Nhap dia chi : ");
        address= scan.nextLine();
        System.out.print("Nhap ngay sinh : ");
        dateOfBirth = scan.nextLine();
    }

    // public void display (){
    //     System.out.println("Ho ten: "+name);
    //     System.out.println("Gioi tinh: "+gender);
    //     System.out.println("Dia chi: "+address);
    //     System.out.println("Ngay sinh: "+dateOfBirth);
    // }

    @Override
    public String toString() {
        return "\tHo ten: "+ name + "\tGioi tinh: "+ gender + "\tDia chi: "+ address + "\tNgay sinh: "+dateOfBirth;
    }

    
}