import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Employee> listEmployee = new ArrayList<Employee>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so luong nhan vien: ");
        int n = scanner.nextInt();

        for(int i = 0; i < n; i++){
            System.out.println("Nhap thong tin nhan vien thu "+i);
            Employee employee = new Employee();
            employee.input();
            listEmployee.add(employee);
        }

        System.out.println("Thong tin nhan vien: ");
        show(listEmployee);
        
        File myFile = new File("E:\\Test\\File\\Employee.txt");
        myFile.createNewFile();

        FileWriter myWriter = new FileWriter("E:\\Test\\File\\Employee.txt");
        for (Employee employee : listEmployee) {
            myWriter.write(employee + "\n");
        }
        myWriter.close();
        

        System.out.println("Nhap lua chon: ");
        System.out.println("1: Them thong tin nhan vien \n2: Xoa thong tin nhan vien theo id \n3: Xoa thong tin nhan vien theo ten \n4: Sua thong tin nhan vien ");
        int choose = scanner.nextInt();
        switch (choose) {
            case 1:
                System.out.println("Nhap vi tri can them: ");
                int k = scanner.nextInt();
                insertEmployee(k, listEmployee);
                show(listEmployee);
                break;
                
            case 2:
                System.out.println("Nhap ma nhan vien can xoa: ");
                scanner.nextLine();
                String delId = scanner.nextLine();    
                deleteEmployeeById(listEmployee, delId);
                show(listEmployee);
                break;
            case 3:
                System.out.println("Nhap ten nhan vien can xoa: ");
                scanner.nextLine();
                String delName = scanner.nextLine();    
                deleteEmployeeByName(listEmployee, delName);
                show(listEmployee);
                break;

            case 4:
                System.out.println("Nhap ten nhan vien can sua: ");
                scanner.nextLine();
                String editName = scanner.nextLine(); 
                editEmployee(listEmployee, editName);
                show(listEmployee);
                break;
            default:
                break;
        }
    }

    public static void show(ArrayList arrayList){
        for(int i = 0; i < arrayList.size(); i++){
            System.out.println(arrayList.get(i).toString());
        }
    }

    public static void insertEmployee(int k, ArrayList arrayList){
        Employee employee = new Employee();
        employee.input();
        arrayList.add(k, employee);
    }

    public static void deleteEmployeeById(ArrayList<Employee> arrayList, String delId){
        for(int i = 0; i< arrayList.size(); i++){
            if(arrayList.get(i).getId().equals(delId)){
                arrayList.remove(i);
            }
        }
        
    }

    public static void deleteEmployeeByName(ArrayList<Employee> arrayList, String delName){
        for(int i = 0; i< arrayList.size(); i++){
            if(arrayList.get(i).getName().equals(delName)){
                arrayList.remove(i);
            }
        }
        
    }
    public static void editEmployee(ArrayList<Employee> arrayList, String editName){
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i< arrayList.size(); i++){
            if(arrayList.get(i).getName().equals(editName)){
                System.out.print("Nhap id moi: ");
                String newId = scanner.nextLine();
                System.out.print("Nhap ten moi: ");
                String newName = scanner.nextLine();
                System.out.print("Nhap chuc vu moi: ");
                String newPosition = scanner.nextLine();
                System.out.print("Nhap dia chi moi: ");
                String newAddress = scanner.nextLine();
                System.out.print("Nhap luong moi: ");
                double newSalary = scanner.nextDouble();
                arrayList.get(i).setId(newId);
                arrayList.get(i).setName(newName);
                arrayList.get(i).setPosition(newPosition);
                arrayList.get(i).setAddress(newAddress);
                arrayList.get(i).setSalary(newSalary);
            }
        }
    }

}
