package com.jayden.queue_system;

import org.springframework.stereotype.Service;

import com.jayden.queue_system.Student;

import java.util.LinkedList;
import java.util.List;

@Service
public class QueueService {
    
    private LinkedList<Student> queue = new LinkedList<>();

    public void addStudent(String name, String id) {
        queue.addLast(new Student(name, id));
    }

    public List<Student> getAllStudents() {
        return queue;
    }

    public Student getNextStudent() {
        return queue.poll();
    }

    
}
