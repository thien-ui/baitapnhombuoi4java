package laptrinhungdungjava.bai2.buoi_4.services;

import laptrinhungdungjava.bai2.buoi_4.model.Course;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseService {
    private List<Course> listCourse = new ArrayList<>();

    public void add(Course newCourse) {
        listCourse.add(newCourse);
    }

    public List<Course> getAll() {
        return listCourse;
    }
}
