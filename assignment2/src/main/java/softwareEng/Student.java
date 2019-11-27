package softwareEng;

import java.util.ArrayList;
import org.joda.time.DateTime;

public class Student {

    private String name;
    private int age;
    private DateTime dob;
    private int id;
    private String userName;
    private ArrayList<Course> courses = new ArrayList<Course>();
    private ArrayList<Module> modules = new ArrayList<Module>();

    public Student(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }
    public Student(String name, int age, DateTime dob, int id, String userName, ArrayList<Course> courses, ArrayList<Module> modules) {
        this.name = name;
        this.age = age;
        this.dob = dob;
        this.id = id;
        this.userName = userName;
        this.courses = new ArrayList<Course>();
        this.modules = new ArrayList<Module>();
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public DateTime dob() {
        return dob;
    }

    public int getId() {
        return id;
    }

    public String getUserName() {
    	return this.userName = name + String.valueOf(age);
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public ArrayList<Module> getModules() {
        return modules;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDob(DateTime dob) {
        this.dob = dob;
    }

    public void getId(int id) {
        this.id = id;
    }

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }

    public void setModules(ArrayList<Module> modules) {
        this.modules = modules;
    }


}