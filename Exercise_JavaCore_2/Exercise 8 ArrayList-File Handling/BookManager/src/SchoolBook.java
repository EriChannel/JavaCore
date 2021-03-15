public class SchoolBook extends Book implements IBorrow, ILibrary{
    private int numberOfPages;
    private String status;
    private int amount;
    private int amountBorrowed;
    private String location;
    

    @Override
    public void input() {
        // TODO Auto-generated method stub
        super.input();
        System.out.print("Nhap so trang: ");
        numberOfPages = Integer.valueOf(sc.nextLine());
        System.out.print("Nhap tinh trang: ");
        status = sc.nextLine();
        System.out.print("Nhap tong so luong: ");
        amount = Integer.valueOf(sc.nextLine());
        System.out.print("Nhap so luong muon: ");
        amountBorrowed = Integer.valueOf(sc.nextLine());
        System.out.print("Nhap vi tri: ");
        location = sc.nextLine();
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() +"\t"+numberOfPages+"\t"+status+"\t"+amount+"\t"+amountBorrowed +"\t" +getInventory()+"\t"+getLocation(location);
    }
    public SchoolBook() {
    }
    public SchoolBook(String id, String name, String publisher, int publishingYear, int amount, int numberOfPages,
            String status, int amount2, int amountBorrowed) {
        super(id, name, publisher, publishingYear, amount);
        this.numberOfPages = numberOfPages;
        this.status = status;
        amount = amount2;
        this.amountBorrowed = amountBorrowed;
    }
    @Override
    public int getInventory() {
        // TODO Auto-generated method stub
        return amount - amountBorrowed;
    }
    @Override
    public String getLocation(String location) {
        // TODO Auto-generated method stub
        return location;
    }



    
}
