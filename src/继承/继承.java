package 继承;

public class 继承 {
    public static void main(String[] args) {
        // 子类不能调用父类的私有方法
        var person = Person.of();
        var s1 = new Student();
        s1.setAge(18);
        var s2 = new Student("Ilirus");
        System.out.println(person.showInfo());
        System.out.println(s1.toString());
        System.out.println(s2.showInfo());
        System.out.println(s2.school);
    }
}
