package softwareEng;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;

import org.joda.time.LocalDate;
import org.junit.Test;
import org.junit.Before;
import java.util.ArrayList;
import java.util.List;

import softwareEng.Student;
import softwareEng.Module;
import softwareEng.Course;

public class AppTest 
{
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
    
    // Tests for Student Class
    @Test
    public void shouldGetStudentName() {
        assertThat(name, is(newStudent.getName()));
    }
    @Test
    public void shouldGetStudentAge() {
        assertThat(age, is(newStudent.getAge()));
    }
 
    @Test
    public void shouldGetUserName() {
        assertThat(name + age, is(newStudent.getUserName()));
    }

    @Test
    public void shouldGetId() {
        assertThat(id, is(newStudent.getId()));
    }
    
    // Tests for Module Class
    @Test
    public void shouldGetModuleName() {
    	assertThat(moduleName, is(newModule.getModuleName()));
    }
    
    @Test
    public void shouldGetModuleId() {
    	assertThat(moduleId, is(newModule.getModuleId()));
    }
    
    @Test
    public void shouldAddStudent() {
    	newModule.addStudents(newStudent);
    	assertThat(newModule.getStudents(), is(studentList));        
    }
    
    @Test
    public void shouldNotAddSameStudentTwice() {
    	ArrayList<Student> testList = new ArrayList<Student>();
    	testList.add(newStudent);
    	testList.add(anotherStudent);
    	Module testModule = new Module("Programming", "CT123", testList, courseList);
    	testModule.addStudents(newStudent);
    	testModule.addStudents(newStudent);
    	testModule.addStudents(anotherStudent);
    	assertThat(testModule.getStudents(), is(testList)); 
    }
    
    @Test
    public void shouldAddCourse() {
    	newModule.addCourses(newCourse);
    	assertThat(newModule.getCourses(), is(courseList));
    }
    
    // Tests for Course Class
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
