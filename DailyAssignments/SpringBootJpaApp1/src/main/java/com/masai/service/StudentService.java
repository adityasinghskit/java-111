package com.masai.service;

import java.util.List;

import com.masai.entities.Student;
import com.masai.exception.StudentException;

public interface StudentService {
public Student saveStudent(Student student);
public Student getStudentByRoll(Integer roll) throws StudentException;
public List<Student> getAllStudentDetails() throws StudentException;
public Student deleteStudentByRoll(Integer roll) throws StudentException;
public Student updateStudent(Student student) throws StudentException;
public Student updateStudentMarks(Integer roll, Integer graceMarks) throws StudentException;
public List<Student> getStudentByMarks(Integer marks) throws StudentException;
public String getStudentNameByRoll(Integer roll) throws StudentException;
public String getStudentNameAndMarksByRoll(Integer roll) throws StudentException;
}
