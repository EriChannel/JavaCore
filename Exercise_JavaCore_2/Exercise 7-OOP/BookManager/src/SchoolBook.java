import java.util.Scanner;

public class SchoolBook extends Book implements IBorrow {
    private int numberOfPages;
    private String status;
    private int amountBorrowed;

    
    @Override
    public void input() {
        // TODO Auto-generated method stub
        super.input();
        System.out.print("Nhap so trang: ");
        numberOfPages = Integer.valueOf(sc.nextLine());

        System.out.print("Nhap tinh trang: ");
        status = sc.nextLine();

        System.out.print("Nhap so luong muon: ");
        amountBorrowed = Integer.valueOf(sc.nextLine());
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + "\t" + numberOfPages + "\t" + status + "\t "+ amountBorrowed;
    }

    @Override
    public int getInventory() {
        // TODO Auto-generated method stub
        return getAmount() - getAmountBorrowed();
    }


    public SchoolBook() {
    }


    public SchoolBook(String id, String name, String publisher, int publishingYear, int amount, Scanner sc,
            int numberOfPages, String status, int amountBorrowed) {
        super(id, name, publisher, publishingYear, amount, sc);
        this.numberOfPages = numberOfPages;
        this.status = status;
        this.amountBorrowed = amountBorrowed;
    }


    public int getNumberOfPages() {
        return numberOfPages;
    }


    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }


    public String isStatus() {
        return status;
    }


    public void setStatus(String status) {
        this.status = status;
    }


    public int getAmountBorrowed() {
        return amountBorrowed;
    }


    public void setAmountBorrowed(int amountBorrowed) {
        this.amountBorrowed = amountBorrowed;
    }
}
