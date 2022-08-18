import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class StudentView {
    int n;
    final int SENTINEL = 4;
    Scanner scanner = new Scanner(System.in);
    StudentController sc = new StudentController();
    ArrayList<Student> studentlist = new ArrayList<>();
    public static void main(String[] args) {
        StudentView views = new StudentView();
        views.studentview();
    }
    public void menu(){
        System.out.println("1.Add student records");
        System.out.println("2.Display sutdent records");
        System.out.println("3.Save");
        System.out.println("4.Exit");
    }
    public void studentview(){
        StudentView views = new StudentView();
        views.menu();
        n = scanner.nextInt();
        while (n != SENTINEL) {
            switch (n) {
                case 1:
                    views.addStudent();
                    break;
                case 2:
                    views.displayStudent();
                    break;
                case 3:
                    views.saveStudent();
            }
            views.menu();
            n = scanner.nextInt();
        }
        System.out.println("Stop...");
    }
    public void addStudent(){
        System.out.println("Enter id: ");
        String StudentID = scanner.next();
        System.out.println("Enter name: ");
        String StudentName = scanner.nextLine();
        StudentName = scanner.nextLine();
        System.out.println("Enter Address: ");
        String Address = scanner.nextLine();
        System.out.println("Enter Phone: ");
        String Phone = scanner.next();
        Student st = new Student(StudentID,StudentName,Address,Phone);
        studentlist.add(new Student(st.getStudentID(),st.getName(),st.getAddress(),st.getPhone()));
        System.out.println("Add Success");
    }
    public void displayStudent(){
        System.out.println("List Students ");
        Iterator<Student> StudentIterator = studentlist.iterator();
        while (StudentIterator.hasNext()){
            Student st1 = StudentIterator.next();
            System.out.println(st1);
        }
    }
    public void saveStudent(){
        Iterator<Student> StudentIterator = studentlist.iterator();
        while (StudentIterator.hasNext()){
            Student st1 = StudentIterator.next();
            sc.InsertStudent(st1);
        }
        sc.SelectStudent();
    }
}

