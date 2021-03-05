public class App {
    enum Season {   //Enum type
        SPRING, SUMMER, AUTUMN, WINTER;
    }
    
    public static void main(String[] args) throws Exception {
        //Primitive Data Types
        Boolean boolVar = false;
        char charVar = 'a';
        byte byteVar  = 100;
        short shortVar = 10000;
        int intVar = 20000000;
        long longVar = 1001000l;
        float floatVar = 2.51f;
        double doubleVar = 2.52d;
        double doubleVar2 = 2.52;

        //Reference Data Types
        int[] arr;
        String str = "Ngoc Ban Quyen"; 

        
        Season season = Season.AUTUMN;
        System.out.println(season);
        
    }

}
