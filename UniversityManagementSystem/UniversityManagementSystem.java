import java.util.ArrayList;

public class UniversityManagementSystem {
  public static class Student {
    private String name;
    private int studentID;
    private String department;

    //setters & getters
    public void setName(String name){
      this.name = name;
    }
    public String getName(){
      return name;
    }
    public void setStudentID(int studentID){
      this.studentID = studentID;
    }
    public int getStudentID(){
      return studentID;
    }
    public String getDepartment() {
      return department;
    }
    public void setDepartment(String department) {
      this.department = department;
    }

    //Constructor
    public Student (String name, int studentID, String department){
      this.name = name;
      this.studentID = studentID;
      this.department = department;
    }

    //Show student details 
    @Override
    public String toString() {
      return "Student's Name: " + name + ", ID: " + studentID + ", Department: " + department;
    }
  }

  public static class Course{
    private String courseName;
    private int courseCode;
    private String department;

    //Getters & Setters
    public String getCourseName(){
      return courseName;
    }
    public void setCourseName(String courseName){
      this.courseName = courseName;
    }
    public int getCourseCode() {
      return courseCode;
    }
    public void setCourseCode(int courseCode) {
      this.courseCode = courseCode;
    }
    public String getDepartment() {
      return department;
    }
    public void setDepartment(String department) {
      this.department = department;
    }

    //Constructor
    public Course (String courseName, int courseCode, String department){
      this.courseName = courseName;
      this.courseCode = courseCode;
      this.department = department;
    }

    // Prints course details
    @Override
    public String toString() {
      return "Course Name: " + courseName + ", Code: " + courseCode + ", Department: " + department;
    }
  }

  public static class Department{
    private String departmentName;
    private String headOfDepartment;
    // private Student student;       //What will happen if I deleted this two lines and they are necessearily?
    // private Course course;
    private ArrayList<Student> storeStudents = new ArrayList<>();
    private ArrayList<Course> storeCourses = new ArrayList<>();

    //Getters and Setters
    public String getDepartmentName() {
      return departmentName;
    }
    public void setDepartmentName(String departmentName) {
      this.departmentName = departmentName;
    }
    public String getHeadOfDepartment() {
      return headOfDepartment;
    }
    public void setHeadOfDepartment(String headOfDepartment) {
      this.headOfDepartment = headOfDepartment;
    }
    public void printStoreStudents(){ 
      for(Student student : storeStudents){
        System.out.println(student);
      }
    }
    public void printStoreCourses(){
      for(Course course : storeCourses){
        System.out.println(course);
      }
    }

    //Constructor 
    public Department(String departmentName, String headOfDepartment){
      this.departmentName = departmentName;
      this.headOfDepartment = headOfDepartment;
    }

    //Add students to department
    public void addStudents(String name, int studentID, String department ){
      Student newStudent = new Student(name, studentID, department); 
      storeStudents.add(newStudent);
      System.out.println("Student added successfully...");
    }

    

    //Add courses to department
    public void addCourses(String courseName, int courseCode, String department){
      Course newCourse = new Course(courseName, courseCode, department);
      storeCourses.add(newCourse);
      System.out.println("Course added successfully...");
    }

    //Print all department details including students and courses
    public void printDepartmentDetails(){
      System.out.println("Department's Name is: " + departmentName + ", Head of department is: " + headOfDepartment);
      System.out.println(" Students are in this department are: ");
      printStoreStudents();
      System.out.println("----------------------------------------");
      System.out.println("Courses are in this department are: ");
      printStoreCourses();
      System.out.println("----------------------------------------");
    }
  }

  public static void main(String[] args) {
    Department department = new Department("CS", "Dr. Mudathir");

    department.addStudents("Munzir", 99, "CS");
    department.addStudents("Mohamed", 100, "CS");
    department.addStudents("Malik", 101, "CS");

    department.addCourses("DS", 1, "CS");
    department.addCourses("English", 2, "CS");
    department.addCourses("Arabic", 3, "CS");

    department.printDepartmentDetails();

  }

}
