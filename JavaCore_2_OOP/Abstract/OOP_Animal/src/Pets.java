public class Pets extends Animal {


    public Pets(String name, String gender, int age, float weight, String color) {
        super(name, gender, age, weight, color);
     
    }

    public Pets() {
    }

    @Override
    public void input() {
        // TODO Auto-generated method stub
        super.input();
    }

    @Override
    public void display() {
        // TODO Auto-generated method stub
        super.display();
    }
    @Override
    public void eat(String food) {
        // TODO Auto-generated method stub

        System.out.println(getName() + " eat " +food);

    }

    

    
}
