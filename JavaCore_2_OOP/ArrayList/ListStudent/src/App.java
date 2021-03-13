import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Student> listStudent = new ArrayList<Student>(); //Khoi tao ArrayList
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so luong hoc sinh: ");
        int n = scanner.nextInt();

        for(int i = 0; i < n; i++){
            Student student = new Student();
            student.input(); //Them 
            listStudent.add(student);//Them phan tu vao danh sach
        }

        System.out.println("Danh sach hoc sinh: ");
        for(Student student : listStudent){
            System.out.println(student); //In danh sach hoc sinh
        }

        //Tao file ListStudent.txt
        File fileStudent = new File("E:\\Test\\File\\ListStudent.txt");
        fileStudent.createNewFile();

        //Ghi thong tin vao file
        FileWriter fileWriter = new FileWriter(fileStudent);
        fileWriter.write(listStudent.toString());
        fileWriter.close();

        //Doc thong tin tu file ListStudent.txt
        Scanner readFile = new Scanner(fileStudent);
        while(readFile.hasNextLine()){
            System.out.println(readFile.nextLine());
        }
        readFile.close();
    }
}
