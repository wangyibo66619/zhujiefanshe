package fanshe;


import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author 王艺博
 * @date 2021/7/14 10:29
 */
// 动态的创建对象，通过反射
public class test08 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {
        // 获得Class对象
        Class c1 = Class.forName("fanshe.User");
        // 构造一个对象
        //User user = (User)c1.newInstance();// 本质上调用了类的无参构造器
        //System.out.println(user);

        // 通过构造器创建对象
        //Constructor constructor = c1.getDeclaredConstructor(String.class, int.class, int.class);
        //User user2 = (User)constructor.newInstance("wyb", 18, 001);
        //System.out.println(user2);

        // 通过反射调用普通方法
        User user3 = (User) c1.newInstance();
        // 通过反射获取一个方法
        Method setName = c1.getDeclaredMethod("setName", String.class);
        setName.invoke(user3,"王艺博");//invoke（对象，方法的值） 激活的意思
        System.out.println(user3.getName());

        System.out.println("**********************************************************");
        // 通过反射操作属性
        User user4 = (User) c1.newInstance();
        // 通过反射获取属性
        Field age = c1.getDeclaredField("age");
        // 不能直接操作私有属性，需要关闭程序的安全监测。属性或方法的setAccessible(true)
        age.setAccessible(true);
        age.set(user4,17);
        System.out.println(user4.getAge());


    }
}
