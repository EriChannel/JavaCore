import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //Tao file moi
        File myFile = new File("E:\\Test\\File\\File.txt");
        myFile.createNewFile();


        //Ghi file
        FileWriter fileWriter = new FileWriter(myFile);
        fileWriter.write("Ơ mây zing, Gút chóp");
        fileWriter.close();

        //Doc file
        Scanner myReader = new Scanner(myFile);
        while(myReader.hasNextLine()){
            System.out.println(myReader.nextLine());    
        }
        myReader.close();

    }
}
