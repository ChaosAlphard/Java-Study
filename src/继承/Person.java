package 继承;

public class Person {
    public String name;
    public int age;
    private String sex;

    public Person() {
        System.out.println("Person被实例化了!");
    }

    public Person(String name) {
        // this()用在构造函数中相当于调用另一个构造函数
        this();
        this.name = name;
    }

    public Person(String name, int age) {
        this(name);
        this.age = age;
    }

    public static Person of() {
        return new Person();
    }

    public String showInfo() {
        return "Person{name='"+name+"',age="+age+",sex='"+sex+"'}";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }
}
