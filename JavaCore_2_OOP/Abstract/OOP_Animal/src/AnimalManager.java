public class AnimalManager {
    public static void main(String[] args) throws Exception {
        Pets pets = new Pets();

        System.out.println("Nhap thong tin: ");
        pets.input();

        System.out.println("Thong tin vua nhap la: ");
        pets.display();

        pets.eat("fish");
    }
}
