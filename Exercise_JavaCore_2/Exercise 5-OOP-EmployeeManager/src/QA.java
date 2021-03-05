public class QA extends Employee {
    public int errorNumber;

    public QA(String id, String name, int age, long phoneNumber, String email, long basicSalary, int errorNumber) {
        super(id, name, age, phoneNumber, email, basicSalary);
        this.errorNumber = errorNumber;
    }

    public QA() {
    }
    
    //Phuong thuc tinh luong
    public long totalSalary(){
        return this.getBasicSalary() + errorNumber*50000; 
    }

    //Phuong thuc nhap thong tin
    @Override
    public void input() {
        // TODO Auto-generated method stub
        super.input();
        System.out.print("Nhap so loi tim duoc: ");
        errorNumber = scanner.nextInt();
    }


    //Phuong thuc in thong tin
    @Override
    public void display() {
        // TODO Auto-generated method stub
        super.display();
        System.out.print("\tSo loi : "+ errorNumber);
        System.out.print("\tTong luong: " + totalSalary()+"\n");

    }
}
