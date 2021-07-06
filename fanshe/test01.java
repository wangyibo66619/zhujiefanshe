package fanshe;

/**
 * @author 王艺博
 * @date 2021/6/29 22:07
 */
// 什么是反射
public class test01 {
    public static void main(String[] args) throws ClassNotFoundException {
        //  通过反射获取类的Class对象
        Class c1 = Class.forName("fanshe.User");
        System.out.println(c1);
        Class c2 = Class.forName("fanshe.User");
        Class c3 = Class.forName("fanshe.User");
        Class c4 = Class.forName("fanshe.User");

        // 一个类内存中只有一个Class对象
        // 一个类被加载后，类的整个结构都会被封装在Class对象中
        System.out.println(c2.hashCode());
        System.out.println(c3.hashCode());
        System.out.println(c4.hashCode());



    }
}

// 实体类
class User {
    private String name;
    private int age;
    private int id;

    public User() {
    }

    public User(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                '}';
    }
}


