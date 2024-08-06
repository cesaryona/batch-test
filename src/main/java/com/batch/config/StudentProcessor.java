package com.batch.config;

import com.batch.model.Student;
import lombok.extern.slf4j.Slf4j;
import org.springframework.batch.item.ItemProcessor;

@Slf4j
public class StudentProcessor implements ItemProcessor<Student, Student> {

    @Override
    public Student process(Student item) throws Exception {
        item.setId(null);
        return item;
    }

}
