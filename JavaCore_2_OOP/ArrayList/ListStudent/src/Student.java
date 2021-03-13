import java.util.Scanner;

/**
 * Student
 */
public class Student {

    private String name;
    private int age;
    Scanner sc = new Scanner(System.in);

    public void input(){
        System.out.print("Nhap ten: ");
        name = sc.nextLine();
        System.out.print("Nhap tuoi: ");
        age = sc.nextInt();
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return name + "\t"+ age;
    }

    public Student(String name, int age, Scanner sc) {
        this.name = name;
        this.age = age;
        this.sc = sc;
    }
    public Student() {
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
    public Scanner getSc() {
        return sc;
    }
    public void setSc(Scanner sc) {
        this.sc = sc;
    }
    
    
}