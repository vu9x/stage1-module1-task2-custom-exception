package com.epam.mjc;

class StudentException extends IllegalArgumentException {
  public StudentException(String msg){
    super(msg);
  }
}
public class StudentManager {

  private static final long[] IDs = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

  public Student find(long studentID) {
      try {
          if(Student.getValueOf(studentID) == null){
              throw new StudentException(String.format("Could not find student with ID %s", studentID));
          }
      } catch (StudentException ex){
          System.out.println(ex.getMessage());
      }
      finally {
          return Student.getValueOf(studentID);
      }
  }

  public static void main(String[] args){
    StudentManager manager = new StudentManager();

    for (int i = 0; i < IDs.length; i++) {
        Student student = manager.find(IDs[i]);
        if(student != null) {
            System.out.println("Student name " + student.getName());
        }
      }
    }
}