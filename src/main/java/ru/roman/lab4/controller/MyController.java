package ru.roman.lab4.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.roman.lab4.entity.Student;
import ru.roman.lab4.service.StudentService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MyController {

    private final StudentService studentService;

    @Autowired
    public MyController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/students")
    public List<Student> showAllStudents(){
        List<Student> allStudent = studentService.getAllStudent();
        return allStudent;
    }

    @PostMapping("/students")
    public Student saveStudent(@RequestBody Student student){
        return studentService.saveStudent(student);
    }

    @PutMapping("/students")
    public Student updateStudent(@RequestBody Student student){
        studentService.saveStudent(student);
        return student;
    }

    @GetMapping("/students/{id}")
    public Student getStudent(@PathVariable("id") int id){
        return studentService.getStudent(id);
    }

    @DeleteMapping("/students/{id}")
    public void updateStudent(@PathVariable("id") int id){
        studentService.deleteStudent(id);
    }
}
