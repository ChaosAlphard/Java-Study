package 继承;

public class Student extends Person {
    String school;

    // 子类中`所有`的构造函数会默认访问父类中的无参构造方法
    // 当父类中没有无参构造函数时, 子类的构造函数`必须`通过this(args) 或者 super(args)
    //   来指定调用本类或父类中相应的构造函数, 且必须放在构造函数的第一行
    // 当子类中既没有显式调用构造函数, 且父类中又没有无参构造函数时, 则编译出错
    public Student() {
        // super 意为父类
        // super() 意为调用父类的构造函数
        // super可以向上追溯到父类的父类...(可一直向上)
        // 可以使用super追溯父类的成员变量和方法
        super("Name");
        System.out.println("Student Super: "+super.showInfo());
    }
    // this和super的区别
    // this
    // this`优先`访问本类的属性/方法, 找不到时向上到父类查找
    // this`只能`调用本类中的构造函数
    // super
    // super`直接`访问父类的属性/方法/构造函数,
    //   找不到时`向上`到更高的父类中查找, `不会`向下到子类查找

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

    // 内部类
    class SmallStudent extends Student {
        public SmallStudent() {
            super("School");
            System.out.println("SmallStudent Super: "+super.showInfo());;
        }
    }
}
