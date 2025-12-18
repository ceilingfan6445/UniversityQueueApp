package com.jayden.queue_system;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController 
@RequestMapping("/queue")
@CrossOrigin(origins = "http://localhost:4200")
public class QueueController {

    private final QueueService queueService;

    public QueueController(QueueService queueService) {
        this.queueService = queueService;
    }

    @GetMapping("/show") 
    public List<Student> showQueue(){
        return queueService.getAllStudents();
    }

    @PostMapping("/join")
    public String joinQueue(@RequestParam String name, @RequestParam String id) {
        queueService.addStudent(name, id);
        return "Student " + name + " added to the queue!";
    }

    @GetMapping("/next")
    public String getNextStudent() {
        Student s = queueService.getNextStudent();
        if (s == null) {
            return "The queue is empty!";
        }
        return "Now helping: " + s.getName();
    }
}
