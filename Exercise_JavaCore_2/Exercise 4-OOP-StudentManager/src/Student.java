/**
 * Student
 */
public class Student {

    public int id;
    public String name;
    public float theoryPoint;
    public float practicePoint;

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

}