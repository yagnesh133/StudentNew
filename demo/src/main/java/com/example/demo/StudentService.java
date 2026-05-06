package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class StudentService {
    @Autowired
  private StuRepo stuRepo;
  public StuMAnEntity addstudents(StuMAnEntity stumanentity){
      return stuRepo.save(stumanentity);
  }
  public List<StuMAnEntity> getall(){
      return stuRepo.findAll();
  }
  public StuMAnEntity getbyid(Long id){
      Optional<StuMAnEntity>op=stuRepo.findById(id);
      if(op.isPresent()){
          return op.get();
      }
      else{
          throw new RuntimeException("id not found");
      }
  }
  public StuMAnEntity update(Long id,StuMAnEntity student){
   StuMAnEntity stu=stuRepo.findById(id).orElseThrow(()->new RuntimeException("Student not found")

   );
   stu.setName(student.getName());
   stu.setCourse(student.getCourse());
   stu.setEmail(student.getEmail());
   stu.setDepartment(student.getDepartment());
   return stuRepo.save(stu);
  }
  public String delete(Long id){
      StuMAnEntity stu=stuRepo.findById(id)
              .orElseThrow(()->new RuntimeException("no id is there"));
      stuRepo.delete(stu);
      return "Deleted Sucessfull";
  }
}

