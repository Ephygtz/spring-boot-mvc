package com.example.springlearn.studentsdemo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {
    public List<Student> getStudents() {
        return List.of(
                new Student(
                        1L, "Correy", "correy@bunnyinc.ke", LocalDate.of(2019, Month.JANUARY, 17), 4)
        );
    }
}
