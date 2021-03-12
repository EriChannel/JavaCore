public class DemoClass implements FirstInterface, SecondInterface {

    @Override
    public void myMethod() {
        System.out.println("Method FirstInterface() called!!");
        
    }

    @Override
    public void myOtherMethod() {
        System.out.println("Method SecondInterface() called!!!");
        
    }
    
    
}
