public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");
        IEmployee partTimeEmployee = new PartTimeEmployee("Dung", 100000, 4);
        System.out.println("Name: "+partTimeEmployee.getName());
        System.out.println("Salary per day: "+partTimeEmployee.calculatorSalary());

        IEmployee fullTimeEmployee = new FullTimeEmployee("Ngoc", 150000);
        System.out.println("Name: "+fullTimeEmployee.getName());
        System.out.println("Salary per day: "+fullTimeEmployee.calculatorSalary());
    }
}
