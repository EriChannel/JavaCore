import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");
        int n;
        String name;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so luong: ");
        n = scanner.nextInt();
        

        //Nhap thong tin
        PhoneBook [] phones = new PhoneBook[50];
        for(int i = 0; i<n; i++){
            System.out.println("Nhap thong tin: ");
            phones[i] = new PhoneBook();
            phones[i].input();
        }

        //In thong tin
        show(n, phones);

        //Sua sdt theo ten
        System.out.print("Nhap ten co sdt can sua: ");
        scanner.nextLine();
        name = scanner.nextLine();
        changePhoneNumber(n, name, phones);
        System.out.println("Mang sau khi sua la: ");
        show(n, phones);

        //Them lien he

        n = insertContact(n, phones);
        System.out.println("Mang sau khi them la: ");
        show(n, phones);

        //Xoa lien he theo ten
        System.out.print("Nhap ten co sdt can xoa: ");
        scanner.nextLine();
        name = scanner.nextLine();
        n = deleteContact(n, phones, name);
        System.out.println("Mang sau khi xoa la: ");
        show(n, phones);

        
    }

    public static void show(int n, PhoneBook phones[]){
        for(int i = 0; i<n; i++){
            System.out.println(phones[i].toString()); 
        }
    }

    public static void changePhoneNumber(int n, String name, PhoneBook phones[]){
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i<n; i++){
            if(name.equals(phones[i].getName())){
                System.out.print("Nhap so dien thoai moi: ");
                String newPhone = scanner.nextLine();
                phones[i].setPhoneNumber(newPhone);   
                // System.out.println(name);
                // System.out.println(phones[i].getName());
            }
        }
    }

    public static int insertContact(int n, PhoneBook phones[]){    
        Scanner scanner = new Scanner(System.in);  
        System.out.println("Nhap lien he muon them: ");
        System.out.print("Nhap id: ");
        int newId = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nhap ten: ");
        String newName = scanner.nextLine();
        System.out.print("Nhap so dien thoai: ");
        String newPhone = scanner.nextLine();

        phones[n] = new PhoneBook();
        phones[n].setId(newId);
        phones[n].setName(newName);
        phones[n].setPhoneNumber(newPhone);

        return n+1;
        
    }

    public static int deleteContact(int n, PhoneBook phones[], String name){
        for(int i = 0; i<n; i++){
            if(name.equals(phones[i].getName())){
                phones[i] = phones[i+1];             
            }
        }
        return n-1;
    }
}
