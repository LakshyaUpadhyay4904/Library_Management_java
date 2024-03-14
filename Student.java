import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Student {
    public int Id;
    public String Name;
    public String Course;
    public char Section;
    public String EnrollNo;
    public int IssuedBook;
    public String IFSCCode;
    public LocalDate IssuedDate;
    public static ArrayList<Student> StudentList = new ArrayList<Student>();
    
    Global global = new Global();

    public Student(){
    }

    public void addStudent(int id, String name, String course, char section, String enrollNo, int issuedBook,String iFSCCode, LocalDate issuedDate) {
        this.Id = id;
        this.Name = name;
        this.Course = course;
        this.Section = section;
        this.EnrollNo = enrollNo;
        this.IssuedBook = issuedBook;
        this.IFSCCode = iFSCCode;
        this.IssuedDate = issuedDate;

        StudentList.add(this); // Add student to the list upon creation
    }

    public int getId(){
        return Id;
    }

    // Method to edit an existing student
    public static void editStudent(int id, String newName) {
        for (Student student : StudentList) {
            if (student.getId() == id) {
                student.Name = newName;
                return; // Exit the loop after finding and editing the student
            }
        }
        System.out.println("Student with ID " + id + " not found.");
    }

    // Method to delete a student
    public static void deleteStudent(int id) {
        Student studentToRemove = null;
        for (Student student : StudentList) {
            if (student.getId() == id) {
                studentToRemove = student;
                break;
            }
        }
        if (studentToRemove != null) {
            StudentList.remove(studentToRemove);
            System.out.println("Student with ID " + id + " deleted.");
        } else {
            System.out.println("Student with ID " + id + " not found.");
        }
    }

    // Method to get a specific student by ID
    public static Student getStudent(int id) {
        for (Student student : StudentList) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }

    // Method to get the list of all students
    public static List<Student> getList() {
        return StudentList;
    }
}
