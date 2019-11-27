package softwareEng;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.ArrayList;

import org.joda.time.LocalDate;
import org.junit.Before;
import org.junit.Test;

public class CourseTest {
	private String name = "Joan";
    private int age = 21;
    private int id = 123456;
    private String moduleName = "Software Engineering";
    private String moduleId = "CT417";
    private String courseName = "CS and IT";
    private LocalDate startDate = new LocalDate(2019, 9, 1);
    private LocalDate endDate = new LocalDate(2020, 5, 1);
    private Student newStudent = new Student(name, age, id);    
    private Student anotherStudent = new Student("Mary", 20, 54321);
    private Module newModule = new Module(moduleName, moduleId);
    private ArrayList<Student> studentList;
    private ArrayList<Module> moduleList;
    private ArrayList<Course> courseList;
    private Course newCourse = new Course(courseName, moduleList, studentList, startDate, endDate);
  
    @Before
    public void init() {
    	studentList = new ArrayList<Student>();
        studentList.add(newStudent);
        moduleList = new ArrayList<Module>();
        moduleList.add(newModule);
        courseList = new ArrayList<Course>();
        courseList.add(newCourse);     
    }
    
    @Test
    public void shouldGetCourseName() {
    	assertThat(courseName, is(newCourse.getCourseName()));
    }
    
    @Test
    public void shouldGetStartDate() {
    	assertThat(startDate, is(newCourse.getStartDate()));
    }
    
    @Test
    public void shouldGetEndDate() {
    	assertThat(endDate, is(newCourse.getEndDate()));
    }
       
    @Test
    public void shoulAddModule() {
    	newCourse.addModules(newModule);
    	assertThat(newCourse.getModules(), is(moduleList));
    }
    
    @Test
    public void shouldNotAddSameStudent() {
    	ArrayList<Student> testList = new ArrayList<Student>();
    	testList.add(newStudent);
    	testList.add(anotherStudent);
    	Course testCourse = new Course(courseName, moduleList, studentList, startDate, endDate);
    	testCourse.addStudents(newStudent);
    	testCourse.addStudents(newStudent);
    	testCourse.addStudents(anotherStudent);
    	assertThat(testCourse.getStudents(), is(testList)); 
    }    

}
