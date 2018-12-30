package com.yashon.design.creational.builder.v2;

/**
 * @ClassName Course
 * @Description TODO
 * @Author yashon
 * @Date 2018/12/30 上午11:31
 * @Version 1.0
 **/
public class Course {

    private String courseName;

    private String coursePrice;

    private String courseVideo;

    public Course(CourseBuilder courseBuilder) {

        this.courseName = courseBuilder.courseName;
        this.coursePrice = courseBuilder.coursePrice;
        this.courseVideo = courseBuilder.courseVideo;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", coursePrice='" + coursePrice + '\'' +
                ", courseVideo='" + courseVideo + '\'' +
                '}';
    }

    public static class CourseBuilder{

        private String courseName;

        private String coursePrice;

        private String courseVideo;

        public CourseBuilder buildCourseName(String courseName){
            this.courseName = courseName;
            return this;
        }

        public CourseBuilder buildCoursePrice(String coursePrice){
            this.coursePrice = coursePrice;
            return this;
        }

        public CourseBuilder buildCourseVideo(String courseVideo){
            this.courseVideo = courseVideo;
            return this;
        }

        public Course makeCourse(){

            return new Course(this);
        }
    }
}
