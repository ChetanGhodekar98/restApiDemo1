package restApiDemo1.restApiDemo1.Service;

import org.springframework.stereotype.Service;
import restApiDemo1.restApiDemo1.Model.Subject;

import java.util.ArrayList;
import java.util.List;

@Service
public class SubjectService {
    List<Subject> subjectList=new ArrayList<>();

    {
        subjectList.add(new Subject(1,"JAVA",9999.9));
        subjectList.add(new Subject(2,"SQL",5999.9));
        subjectList.add(new Subject(3,"SPRING",19999.9));
    }

    public List<Subject> displaySubjects(){
        return subjectList;
    }
    public Subject getSubjectObject(int id){
        for(Subject s:subjectList){
            if(s.getSubjectId()==id){
                return s;
            }
        }
        return null;
    }

    public void addData(Subject subject) {
        subjectList.add(subject);
    }
    public void updateData(Subject subject,int id){
        for(Subject s:subjectList){
            if(s.getSubjectId()==id){
                s.setSubjectName(subject.getSubjectName());
                break;
            }
        }
    }
}
