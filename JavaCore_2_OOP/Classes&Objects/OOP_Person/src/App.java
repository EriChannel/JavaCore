public class App {
    public static void main(String[] args) throws Exception {
        Person person = new Person(); //Tao doi tuong person
        //Cung cap thong tin cho doi tuong
        person.name = "Ngoc";
        person.age = 25;
        person.address = "HG";

        //In thong tin
        person.display();
        person.move();  //goi toi phuong thuc move
        System.out.println("Xin chao toi ten la "+person.name+ ", toi "+person.age+ " tuoi, toi den tu "+person.address);

        Person person2 = new Person("Linh", 30, "HN"); //Tao doi tuong person2
   
        // In thong tin
        person2.display();
        
        person2.study("English");   //goi toi phuong thuc study
    }
}
