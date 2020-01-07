package 继承;

public class Student extends Person {
    String school;

    public Student() {
        // super() 意为调用父类的构造函数
        super();
    }

    public Student(String school) {
        this.school = school;
    }

    @Override
    public String showInfo() {
        return "Student{" +
                "school='" + school + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
