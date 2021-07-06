package fanshe;

/**
 * @author 王艺博
 * @date 2021/7/6 14:05
 */
public class test02 {
    public static void main(String[] args) throws ClassNotFoundException {
        Person person = new Student();

        // 方式一：通过对象获得
        Class c1 = person.getClass();
        System.out.println(c1.hashCode());
        // 方式二：forname获得
        Class c2 = Class.forName("fanshe.Student");
        System.out.println(c2.hashCode());
        // 方式三：通过类名.class获得
        Class c3 = Student.class;
        System.out.println(c2.hashCode());
        // 方式四：基本内置类型的包装类都有一个TYPE类型
        Class c4 = Integer.TYPE;
        System.out.println(c4);
        // 获得父类类型
        Class c5 = c1.getSuperclass();
        System.out.println(c5);
    }
}

class Person {
    String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
class Student extends Person{
    public Student() {
        this.name = "学生";
    }
}
class Teacher extends Person {
    public Teacher() {
        this.name = "老师";
    }
}

