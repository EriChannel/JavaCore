import java.util.Scanner;

public class Book {
    private String id;
    private String name;
    private String publisher;
    private int publishingYear;
    private int amount;
    Scanner sc = new Scanner(System.in);

    public Book() {

    }

    public Book(String id, String name, String publisher, int publishingYear, int amount) {
        this.id = id;
        this.name = name;
        this.publisher = publisher;
        this.publishingYear = publishingYear;
        this.amount = amount;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void input() {
        System.out.print("Nhap ma sach: ");
        id = sc.nextLine();
        System.out.print("Nhap ten sach: ");
        name = sc.nextLine();
        System.out.print("Nhap nha xuat ban: ");
        publisher = sc.nextLine();
        System.out.print("Nhap nam xuat ban: ");
        publishingYear = Integer.valueOf(sc.nextLine());
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return id +"\t"+ name +"\t"+ publisher +"\t"+ publishingYear;
    }
    
}
