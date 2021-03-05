public class Student {
    private int id;
    private String name;
    private float theoryPoint;
    private float practicePoint;

    public Student() {
    }

   
    public Student(int id, String name, float theoryPoint, float practicePoint) {
        this.id = id;
        this.name = name;
        this.theoryPoint = theoryPoint;
        this.practicePoint = practicePoint;
    }

    public float generalPointAverage() {
        return (theoryPoint + practicePoint) / 2;
    }

    public void display() {
        System.out.printf("%3d\t %-15s %8.2f %18.2f %19.2f\n", id, name, theoryPoint, practicePoint,
                generalPointAverage());
    }

    //Cac phuong thuc setter và getter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getTheoryPoint() {
        return theoryPoint;
    }

    public void setTheoryPoint(float theoryPoint) {
        this.theoryPoint = theoryPoint;
    }

    public float getPracticePoint() {
        return practicePoint;
    }

    public void setPracticePoint(float practicePoint) {
        this.practicePoint = practicePoint;
    }

    
}
