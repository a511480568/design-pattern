package com.yashon.design.creational.builder;

/**
 * @ClassName Course
 * @Description TODO
 * @Author yashon
 * @Date 2018/12/30 上午11:05
 * @Version 1.0
 **/
public class Course {

    private String courseName;

    private String coursePrice;

    private String courseVideo;

    public String getCourseName() {
        return courseName;
    }

    public String getCoursePrice() {
        return coursePrice;
    }

    public String getCourseVideo() {
        return courseVideo;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setCoursePrice(String coursePrice) {
        this.coursePrice = coursePrice;
    }

    public void setCourseVideo(String courseVideo) {
        this.courseVideo = courseVideo;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", coursePrice='" + coursePrice + '\'' +
                ", courseVideo='" + courseVideo + '\'' +
                '}';
    }
}
