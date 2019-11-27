package softwareEng;

import java.util.ArrayList;

public class Module {

    private String moduleName;
    private String moduleId;
    private ArrayList<Student> students = new ArrayList<Student>();
    private ArrayList<Course> courses = new ArrayList<Course>();

    public Module(String moduleName, String moduleId) {
        this.moduleName = moduleName;
        this.moduleId = moduleId;
    }
    
    public Module(String moduleName, String moduleId, ArrayList<Student> students, ArrayList<Course> courses) {
        this.moduleName = moduleName;
        this.moduleId = moduleId;
        this.students = new ArrayList<Student>();
        this.courses = new ArrayList<Course>();
    }

    public String getModuleName() {
        return moduleName;
    }

    public String getModuleId(){
        return moduleId;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public void setModuleId(String id){
        moduleId = id;
    }

    public void addStudents(Student student) {
        if(!students.contains(student)) {
            students.add(student);
        }
    }

    public void addCourses(Course course) {
        if(!courses.contains(course)) {
            courses.add(course);
        }
    }
}