package zhujie;

import java.util.ArrayList;

/**
 * @author 王艺博
 * @date 2021/6/29 13:41
 */
public class test01 {
    // @Override 重写的注解
    @Override
    public String toString() {
        return super.toString();
    }
    //  @Deprecated 不推荐使用
    @Deprecated
    public static void test() {
        System.out.println("Deprecated");
    }

    @SuppressWarnings("all")   // 抑制警告
    public void test02() {
        ArrayList List = new ArrayList();
    }

    public static void main(String[] args) {
        test();
    }
}
