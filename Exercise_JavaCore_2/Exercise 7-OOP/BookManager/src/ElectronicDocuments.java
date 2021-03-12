import java.util.Scanner;

public class ElectronicDocuments extends Book implements IDownLoad {
    private double capacity;
    private int downloads;
    private double price;

    @Override
    public void input() {
        // TODO Auto-generated method stub
        super.input();
        System.out.print("Nhap dung luong ");
        capacity = Double.valueOf(sc.nextLine());

        System.out.print("Nhap so luot tai: ");
        downloads = Integer.valueOf(sc.nextLine());

        System.out.print("Nhap gia thanh: ");
        price = Double.valueOf(sc.nextLine());
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + "\t" + capacity + "\t" + downloads + "\t" + price;
    }

    @Override
    public double getTotalPrice() {
        // TODO Auto-generated method stub
        return downloads*price;
    }

    public ElectronicDocuments() {
    }

    public ElectronicDocuments(String id, String name, String publisher, int publishingYear, int amount, Scanner sc,
            double capacity, int downloads, double price) {
        super(id, name, publisher, publishingYear, amount, sc);
        this.capacity = capacity;
        this.downloads = downloads;
        this.price = price;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public int getDownloads() {
        return downloads;
    }

    public void setDownloads(int downloads) {
        this.downloads = downloads;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
