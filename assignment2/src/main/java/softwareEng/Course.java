package softwareEng;

import java.util.ArrayList;

import org.joda.time.*;

public class Course {

  private String courseName;
  private ArrayList<Module> modules;
  private ArrayList<Student> students;
  private LocalDate startDate;
  private LocalDate endDate;

  public Course(String courseName, ArrayList<Module> modules, ArrayList<Student> students, LocalDate startDate, LocalDate endDate) {
	  if (endDate.isBefore(startDate)) {
          throw new IllegalArgumentException("End date is before the start date.");
      }
	  this.courseName = courseName;
      this.students = new ArrayList<Student>();
      this.modules = new ArrayList<Module>();
      this.startDate = startDate;
      this.endDate = endDate;
  }

  public String getCourseName() {
      return courseName;
  }

  public ArrayList<Module> getModules(){
      return modules;
  }

   public ArrayList<Student> getStudents(){
      return students;
  }

  public LocalDate getStartDate() {
      return startDate;
  }

  public LocalDate getEndDate() {
      return endDate;
  }

  public void setCourseName(String courseName) {
      this.courseName = courseName;
  }

  public void addModules(Module module) {
      if(!modules.contains(module)) {
          modules.add(module);
      }
  }

  public void addStudents(Student student) {
      if(!students.contains(student)) {
          students.add(student);
      }
  }

  public void setStartDate(LocalDate startDate) {
      this.startDate = startDate;
  }

  public void setEndDate(LocalDate endDate) {
      this.endDate = endDate;
  }


}
