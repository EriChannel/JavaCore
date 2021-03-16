import java.io.File;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        String str = "TechMaster";
        System.out.println(str);
        try {
            int a = 0;
            int b = 10;
            int c = b/a;   //ArithmeticException
            System.out.println(c);
        } catch (Exception e) {
            System.out.println("ArithmeticException");
        }

        System.out.println("-----------------------------------------");

        File file = new File("MoFile.txt");
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
        } catch (Exception e) {
            System.out.println("FileNotFoundException");
        } finally{
            System.out.println("Khoi nay luon duoc thuc hien");
        }
        scanner.close();

        System.out.println("-----------------------------------------");


        try {
            int arr[] = new int[5];
            arr[5] = 4;
            System.out.println("arr[5] = " + arr[5]);
        } catch (NullPointerException e) {
            System.out.println(e);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }finally{
            System.out.println("Khoi nay luon duoc thuc hien!!!");
        }

        System.out.println("-----------------------------------------");
        //CustomException
        try {
            checkAge(18);
        } catch (Exception e) {
            e.printStackTrace();
        }

        

    }

    public static void checkAge(int age) throws CheckedException {
        if(age < 18){
            throw new CheckedException("Not valid!!!");
        }else{
            System.out.println("Da du tuoi di bau cu!!!");
        }
    }
}
