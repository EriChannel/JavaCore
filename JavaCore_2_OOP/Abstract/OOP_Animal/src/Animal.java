import java.util.Scanner;

/**
 * Animal
 */
public abstract class Animal {

    private String name;
    private String gender;
    private int age;
    private float weight;
    private String color;
    Scanner scanner = new Scanner(System.in);

    public Animal(String name, String gender, int age, float weight, String color) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.weight = weight;
        this.color = color;
    }

    public Animal() {
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract void eat(String food);

    public void input(){
        System.out.print("Nhap ten: ");
        name = scanner.nextLine();
        System.out.print("Nhap gioi tinh: ");
        gender = scanner.nextLine();
        System.out.print("Nhap tuoi: ");
        age = Integer.valueOf(scanner.nextLine());
        System.out.print("Nhap can nang: ");
        weight = Float.valueOf(scanner.nextLine());
        System.out.print("Nhap mau: ");
        color = scanner.nextLine();
    }

    public void display(){
        System.out.println("Ten: "+name);
        System.out.println("Gioi tinh: "+gender);
        System.out.println("Tuoi: "+age);
        System.out.println("Can nang: "+weight);
        System.out.println("Mau: "+color);
    }

    
}