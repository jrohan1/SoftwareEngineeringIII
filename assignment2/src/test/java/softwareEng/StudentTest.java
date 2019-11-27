package softwareEng;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

import softwareEng.Student;

public class StudentTest 
{
    private String name = "Joan";
    private int age = 21;
    private int id = 123456;
    private Student newStudent = new Student(name, age, id);  
       
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
}
