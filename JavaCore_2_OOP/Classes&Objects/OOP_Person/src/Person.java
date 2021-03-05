public class Person {

    //Khai bao thuoc tinh
    public String name;
    public int age;
    public String address;

    //Constructor có tham số
    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
    //Constructor mac dinh
    public Person() {
    }
    

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

    public void display(){
        System.out.println("Ten: "+name);
        System.out.println("Tuoi: "+age);
        System.out.println("Dia chi: "+address);
    }

    

    
    
}
