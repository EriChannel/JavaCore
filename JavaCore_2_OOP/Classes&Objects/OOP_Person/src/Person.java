public class Person {

    //Khai bao thuoc tinh
    public String name;
    public int age;
    public String address;

    //Phuong thuc khong co tham so
    public void move(){
        System.out.println("Goi toi phuong thuc move!!!");
        System.out.println(name + " listen to music");
    }

    //Phuong thuc co tham so
    public void study(String subject){
        System.out.println("Goi toi phuong thuc study");
        System.out.println(name + " study "+subject);
    }
    
}
