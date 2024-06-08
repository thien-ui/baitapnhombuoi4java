package laptrinhungdungjava.bai2.buoi_4.controller;

import laptrinhungdungjava.bai2.buoi_4.model.Course;
import laptrinhungdungjava.bai2.buoi_4.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/course")
public class CourseController {


   @Autowired
    private CourseService courseService;

   @GetMapping("/create")
    public String create(Model model) {
    model.addAttribute("course", new Course());
    return "create";
   }

   @PostMapping("/create")
    public String create(Course newCourse, Model model) {
       courseService.add(newCourse);
       return "redirect:/home";
   }
}
