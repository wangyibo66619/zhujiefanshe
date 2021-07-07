package fanshe;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author 王艺博
 * @date 2021/7/7 21:36
 */
// 获得类的信息
public class test07 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException {
        Class c1 = Class.forName("fanshe.User");
        // 获得类的名字
        System.out.println(c1.getName());
        System.out.println(c1.getSimpleName());

        // 获得类的属性
        System.out.println("++++++++++++++++++++++++++++++++++");
        Field[] fields = c1.getFields();// 只能找到public属性

        Field[] declaredFields = c1.getDeclaredFields();// 找到全部属性
        for (Field f : declaredFields) {
            System.out.println(f);
        }
        // 获得指定属性值
        Field field = c1.getDeclaredField("name");
        System.out.println(field);

        System.out.println("++++++++++++++++++++++++++++++++++");
        // 获得类的方法
        Method[] methods = c1.getMethods();
        for (Method method : methods) {
            System.out.println("正常的：" + method);// 获得本类及其父类的全部public方法
        }
        methods = c1.getDeclaredMethods();// 获得本类的所有方法
        for (Method method : methods) {
            System.out.println("getDeclaredMethods" + method);
        }
        // 获得指定的方法
        // 重载
        Method getName = c1.getMethod("getName",null);
        Method setName = c1.getMethod("setName", String.class);
        System.out.println(getName);
        System.out.println(setName);

        System.out.println("++++++++++++++++++++++++++++++++++");

        // 获得构造器
        Constructor[] constructors = c1.getConstructors();
        for (Constructor constructor : constructors) {
            System.out.println(constructor);
        }
        constructors = c1.getDeclaredConstructors();
        for (Constructor constructor : constructors) {
            System.out.println(constructor);
        }
        // 获得指定的构造器
        Constructor constructor = c1.getConstructor(String.class,int.class,int.class);
        System.out.println("指定" + constructor);
    }
}
