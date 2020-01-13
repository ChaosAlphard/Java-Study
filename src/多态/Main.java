package 多态;

import 继承.Person;
import 继承.Student;

public class Main {

    public static void main(String[] args) {
        // 子类对象可以代替父类对象的使用
        // 如果一个变量声明为父类类型，但引用子类对象
        // 则该变量不能访问子类中拓展的属性和方法
        // 即只能访问子类和父类中都有的方法
        // 此时访问的是子类对象的属性/方法
        // 如果子类没有重写父类方法，则调用父类方法
        Person p = new Student();
        System.out.println(p.showInfo());;
    }
}
