public class App {
    public static void main(String[] args) throws Exception {
        Person person = new Person(); //Tao doi tuong person
        //Cung cap thong tin cho doi tuong
        person.name = "Ngoc";
        person.age = 25;
        person.address = "HG";

        //In thong tin
        System.out.println("Xin chao toi ten la "+person.name+ ", toi "+person.age+ " tuoi, toi den tu "+person.address);

        Person person2 = new Person(); //Tao doi tuong person2
        //Cung cap thong tin cho doi tuong
        person2.name = "Linh";
        person2.age = 30;
        person2.address = "HN";

        // In thong tin
        System.out.println("Ten: "+person2.name);
        System.out.println("Tuoi: "+person2.age);
        System.out.println("Dia chi: "+person2.address);
    }
}
