package com.yashon.design.dependence;

/**
 * @ClassName Client
 * @Description
 * <p>
 *     依赖倒置原则：高层不应该依赖低层，两者应该依赖其抽象<br/>
 *     在这个例子中第一个main方法（已经被注释的）很明显是依赖实现编程，如果想增加一门课程的学习，就需要在其实现类中进行修改<br/>
 *     第二个main方法在接口中统一定义一个接口，由各个课程的具体实现类去实现这个接口，然后创建一个manager类去管理这个接口<br/>
 *     在client调用时只需要和manager接触就可以了，如果想学哪门课程只需要将这门课程进行set即可
 * </p>
 * @Author yashon
 * @Date 2018/12/25 下午10:38
 * @Version 1.0
 **/
public class Client {

    /*public static void main(String[] args) {
        StudyCourse studyCourse = new StudyCourse();
        studyCourse.studyJava();
        studyCourse.studyPython();
    }*/


    public static void main(String[] args) {
        StudyCourseManager manager = new StudyCourseManager();
        manager.setiCourse(new JavaStudy());
        manager.studyCourse();
        manager.setiCourse(new PythonStudy());
        manager.studyCourse();
    }
}
