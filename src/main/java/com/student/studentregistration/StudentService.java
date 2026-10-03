package com.student.studentregistration;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StudentService {

    private final StudentRepo studentRepo;

    public StudentService(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }

    // Register student
    public Student registerStudent(Student student) {
        return studentRepo.save(student);
    }

    // Get all students
    public List<Student> getAllStudents() {
        return studentRepo.findAll();
    }

    // Get student by ID
    public Student getStudentById(Long id) {
        return studentRepo.findById(id).orElse(null);
    }

    // Delete student
    public void deleteStudent(Long id) {
        studentRepo.deleteById(id);
    }
}