package restApiDemo1.restApiDemo1.Cotroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import restApiDemo1.restApiDemo1.Model.Subject;
import restApiDemo1.restApiDemo1.Service.SubjectService;

import java.util.List;

@RestController
public class SubjectController {

    @Autowired
    private SubjectService service;

    @GetMapping("/msg")
    public String test(){
        return "WELCOME TO REST-API";
    }

    @GetMapping("/display")
    public List<Subject> displayData(){
        return service.displaySubjects();
    }

    @GetMapping("/display/{id}")
    public Subject getSubjectObject(@PathVariable int id){
        return service.getSubjectObject(id);
    }

    @PostMapping("/display/insertData")
    public void addData(@RequestBody Subject subject){
        service.addData(subject);
    }

    @PutMapping("/display/update/{id}")
    public void update(@RequestBody Subject s,@PathVariable int id){
        service.updateData(s,id);
    }
}
