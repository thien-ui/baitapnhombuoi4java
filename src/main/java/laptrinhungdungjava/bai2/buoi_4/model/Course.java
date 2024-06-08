package laptrinhungdungjava.bai2.buoi_4.model;

import java.time.LocalDate;

public class Course {
    private int id;
    private String lectureName;
    private String place;
    private LocalDate startDate;

    // Constructor mặc định không tham số

    public Course() {

    }
    // Constructor có tham số
    public Course(int id, String lectureName, String place, LocalDate startDate) {
        this.id = id;
        this.lectureName = lectureName;
        this.place = place;
        this.startDate = startDate;
    }

    // Getters và setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLectureName() {
        return lectureName;
    }

    public void setLectureName(String lectureName) {
        this.lectureName = lectureName;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }
}
