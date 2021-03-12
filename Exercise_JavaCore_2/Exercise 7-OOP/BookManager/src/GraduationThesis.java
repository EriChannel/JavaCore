import java.util.Scanner;

public class GraduationThesis extends Book implements ILibrary{
    private int numberOfPages;
    private String status;
    private int yearOfProtection;

    @Override
    public void input() {
        // TODO Auto-generated method stub
        super.input();
        System.out.print("Nhap so trang ");
        numberOfPages = Integer.valueOf(sc.nextLine());

        System.out.print("Nhap tinh trang ");
        status = sc.nextLine();

        System.out.print("Nhap nam bao ve ");
        yearOfProtection = Integer.valueOf(sc.nextLine());
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + "\t" + numberOfPages + "\t" + status + "\t" + yearOfProtection;
    }
    @Override
    public String getLocation(String location) {
        // TODO Auto-generated method stub
        return location;
    }
    public GraduationThesis(String id, String name, String publisher, int publishingYear, int amount, Scanner sc,
            int numberOfPages, String status, int yearOfProtection) {
        super(id, name, publisher, publishingYear, amount, sc);
        this.numberOfPages = numberOfPages;
        this.status = status;
        this.yearOfProtection = yearOfProtection;
    }
    public GraduationThesis() {
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
    public int getYearOfProtection() {
        return yearOfProtection;
    }
    public void setYearOfProtection(int yearOfProtection) {
        this.yearOfProtection = yearOfProtection;
    }

}
