package ru.roman.lab4.service;

import org.springframework.stereotype.Service;
import ru.roman.lab4.entity.Student;

import java.util.List;

@Service
public interface StudentService {

    List<Student> getAllStudent();

    Student getStudent(int id);

    Student saveStudent(Student student);

    void deleteStudent(int id);
}
