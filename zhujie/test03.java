package zhujie;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author 王艺博
 * @date 2021/6/29 14:12
 */
// 自定义注解
public class test03 {
    // 注解可以显示赋值，如果没有默认值，我们就必须给注释赋值
    @MyAnnotation02(name = "wyb")
    public void test (){

    }
    @MyAnnotation03("hh")  // 如果只有一个值的话，这个值用value命名的话在这个写的时候可以省去value =
    public void test01() {

    }
}

@Target(value = {ElementType.TYPE,ElementType.METHOD})
@Retention(value = RetentionPolicy.RUNTIME)
@interface MyAnnotation02 {
    // 注解的参数：参数类型 + 参数名();
    String name() default ""; // 也可以加默认值
    int age() default 18;
    int id() default -1;//如果默认值为-1，代表不存在。    例：indexOf，如果找不到就返回-1
    String[] school() default {"清华","北大"};
}

@Target(value = {ElementType.TYPE,ElementType.METHOD})
@Retention(value = RetentionPolicy.RUNTIME)
@interface MyAnnotation03{
    String value();
}
