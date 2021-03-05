
public class Student extends Person {
    private String id;
    private double cpa;
    private String email;

    public Student() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getCpa() {
        return cpa;
    }

    public void setCpa(double cpa) {
        this.cpa = cpa;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public void input() {

        System.out.print("Nhap ma sinh vien :");
        id = scan.nextLine();
        super.input();

        System.out.print("Nhap diem trung binh :");
        cpa = Double.valueOf(scan.nextLine());
        System.out.print("Nhap email :");
        email = scan.nextLine();
    }

    // @Override
    // public void display() {

    // System.out.println("ID: "+id);
    // super.display();
    // System.out.println("CPA: "+cpa);
    // System.out.println("Email: "+email);

    // }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }

    public Student(String name, String gender, String address, String dateOfBirth, String id, double cpa,
            String email) {
        super(name, gender, address, dateOfBirth);
        this.id = id;
        this.cpa = cpa;
        this.email = email;
    }

    
}
