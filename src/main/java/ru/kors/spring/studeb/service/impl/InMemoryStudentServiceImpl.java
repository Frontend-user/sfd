package ru.kors.spring.studeb.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.kors.spring.studeb.model.Student;
import ru.kors.spring.studeb.repository.InMemoryStudentDAO;
import ru.kors.spring.studeb.service.StudentService;

import java.util.List;

@Service
@AllArgsConstructor
public class InMemoryStudentServiceImpl implements StudentService {
    private final InMemoryStudentDAO repository;

    @Override
    public List<Student> findAllStudents() {
        return repository.findAllStudents();
//        return List.of(
//                Student.builder().firstName("Олег").email("oleg@mail.com").age(41).build(),
//                Student.builder().firstName("О22лег2").email("oleg2@mail.com").age(4).build(),
//                Student.builder().firstName("Олег3").email("oleg3@mail.com").age(41).build()
//        );
    }

    @Override
    public Student saveStudent(Student student) {
        return repository.saveStudent(student);
    }

    @Override
    public Student findByEmail(String email) {
        return repository.findByEmail(email);
    }

    @Override
    public Student updateStudent(Student student) {
        return repository.updateStudent(student);
    }

    @Override
    public void deleteStudent(String email) {
        repository.deleteStudent(email);
    }


}
