import java.io.*;

// Serializable Student class
class Student implements Serializable {
    private static final long serialVersionUID = 1L;
    int id;
    String name;
    double gpa;

    public Student(int id, String name, double gpa) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
    }

    public void display() {
        System.out.println("Student ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("GPA: " + gpa);
    }
}

public class medium5 {
    public static void main(String[] args) {
        String filename = "student.ser";

        Student student = new Student(101, "Alice", 8.5);

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(student);
            System.out.println("Serialization successful.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialize the student object
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            Student deserializedStudent = (Student) ois.readObject();
            System.out.println("\nDeserialized Student Details:");
            deserializedStudent.display();
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
