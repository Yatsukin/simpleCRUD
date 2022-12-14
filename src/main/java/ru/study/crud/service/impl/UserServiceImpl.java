package ru.study.crud.service.impl;

import ru.study.crud.dto.StudentDto;
import ru.study.crud.service.UserService;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class UserServiceImpl implements UserService {

    Map<Integer, StudentDto> studentDtoMap;

    public UserServiceImpl(Map<Integer, StudentDto> studentMap) {
        this.studentDtoMap = studentMap;
    }

    @Override
    public List<StudentDto> findAllStudent() {
        List<StudentDto> students = new ArrayList<>(studentDtoMap.values());
        return students;
    }

    @Override
    public StudentDto findStudentById(int id) {
        return studentDtoMap.get(id);
    }

    @Override
    public void save(StudentDto studentDto) {
        studentDtoMap.put(studentDto.getId(), studentDto);
    }

    @Override
    public void delete(int id) {
        studentDtoMap.remove(id);
    }
}
