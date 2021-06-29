package zhujie;

import java.lang.annotation.*;

/**
 * @author 王艺博
 * @date 2021/6/29 13:55
 */
// 测试元注解
public class test02 {
    @MyAnnotation
    public void test() {

    }
}

// 定义一个注释
// Target 表示我们的注解可以用在那些地方
@Target(value = {ElementType.METHOD,ElementType.TYPE})
// Retention 表示我们的注解在什么地方还有效
// runtime>class>source
@Retention(value = RetentionPolicy.RUNTIME)
// Documented 表示是否将我们的注解生成在JAVADoc中
@Documented
// Inherited 子类可以继承父类的注解
@Inherited
@interface MyAnnotation {

}
