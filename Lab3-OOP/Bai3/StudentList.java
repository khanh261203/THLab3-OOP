/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai3;

/**
 *
 * @author ADMIN
 */
import java.util.ArrayList;
import java.util.Comparator;

public class StudentList {
    private ArrayList<Student> studentList;
    
    public StudentList() {
        studentList = new ArrayList<Student>();
    }
    
    public ArrayList<Student> getStudentList() {
        return studentList;
    }
    
    public void addStudent(Student student) {
        for (Student s : studentList) {
            if (s.getId().equals(student.getId())) {
                System.out.println("Sinh viên đã tồn tại trong danh sách");
                return;
            }
        }
        studentList.add(student);
    }
    
    public void removeStudent(String id) {
        for (Student s : studentList) {
            if (s.getId().equals(id)) {
                studentList.remove(s);
                System.out.println("Đã xóa sinh viên với mã " + id);
                return;
            }
        }
        System.out.println("Không tìm thấy sinh viên với mã " + id);
    }
    
    public void updateStudent(String id, String name, int yearOfBirth) {
        for (Student s : studentList) {
            if (s.getId().equals(id)) {
                s.setName(name);
                s.setYearOfBirth(yearOfBirth);
                System.out.println("Đã cập nhật thông tin sinh viên với mã " + id);
                return;
            }
        }
        System.out.println("Không tìm thấy sinh viên với mã " + id);
    }
    
    public Student findStudentById(String id) {
        for (Student s : studentList) {
            if (s.getId().equals(id)) {
                return s;
            }
        }
        return null;
    }
    
    public ArrayList<Student> findStudentByName(String name) {
        ArrayList<Student> result = new ArrayList<Student>();
        for (Student s : studentList) {
            if (s.getName().equals(name)) {
                result.add(s);
            }
        }
        return result;
    }
    
    public void sortById() {
        studentList.sort(new Comparator<Student>() {
            public int compare(Student s1, Student s2) {
                return s1.getId().compareTo(s2.getId());
            }
        });
    }
    
    public static void main(String[] args) {
        StudentList sl = new StudentList();
        sl.addStudent(new Student("SV001", "Nguyễn Văn A", 2000));
        sl.addStudent(new Student("SV002", "Trần Thị B", 2001));
        sl.addStudent(new Student("SV003", "Lê Văn C", 2002));
        sl.addStudent(new Student("SV004", "Trần Thị X", 2002));
        sl.addStudent(new Student("SV005", "Lê Văn Y", 2001));
       
                }}
