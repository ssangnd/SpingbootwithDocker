package com.spingboot.docker.spingbootwithdocker.controllers;
import com.spingboot.docker.spingbootwithdocker.models.Student;
import com.spingboot.docker.spingbootwithdocker.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "students")
public class StudentController {
    @Autowired
    private StudentRepository studentRepository;
    //http://localhost:8083/students/hello
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello(ModelMap modelMap) {
        return "Hello World. How are you ?";
    }
    @RequestMapping(value = "/insertStudent", method = RequestMethod.POST)
    public String insertStudent(@RequestParam String name,
                                @RequestParam Integer birthYear) {
        try {
            Student student = new Student(name, birthYear);
            studentRepository.save(student);
            return "Insert student successfully";
        }catch (Exception e) {
            return "Insert student failed.Error: "+e.toString();
        }
    }
    @RequestMapping(value = "/showAllStudents", method = RequestMethod.GET)
    //http://localhost:8085/students/showAllStudents
    public Iterable<Student> showAllStudents() {
        return studentRepository.findAll();
    }
}