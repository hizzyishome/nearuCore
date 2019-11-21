package ppt;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * @Description:
 * @Author: ZhaoZhenHua1 Administrator
 * @Date: 2019/11/12 21:41
 */
public class PackageDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        BeanDemo beanDemo = null;
        String str = "asdf";
        System.out.println(beanDemo == null);
        System.out.println(str.equals(null));

        System.out.println(Objects.equals(null, null));
    }

    /*        BeanDemo beanDemo = new BeanDemo();
        beanDemo.setNum(1);
        beanDemo.setInnerBeanDemo(new InnerBeanDemo());
        beanDemo.getInnerBeanDemo().setInnerNum(1);
        System.out.println(beanDemo.getNum());
        BeanDemo beanDemoClone = (BeanDemo) beanDemo.clone();
        beanDemoClone.setNum(2);
        beanDemoClone.getInnerBeanDemo().setInnerNum(2);
        System.out.println(beanDemo.getInnerBeanDemo().getInnerNum());
        System.out.println(beanDemoClone.getInnerBeanDemo() == beanDemo.getInnerBeanDemo());*/

    /*float a = 1.0f - 0.9f;
        float b = 0.9f - 0.8f;
        if (a == b) {
            System.out.println("邓舟不是小船，是TM的泰坦尼克！");
        } else {
            System.out.println("邓舟是条漏水的小船！");
        }
        System.out.println(a);
        System.out.println(b);

        Float x = Float.valueOf(a);
        Float y = Float.valueOf(b);
        if (x.equals(y)) {
            System.out.println("邓舟这次该是泰坦尼克了吧！");
        } else {
            System.out.println("很遗憾，水越漏越多。。。");
        }
        System.out.println(x);
        System.out.println(y);*/

 /*       BigDecimal a = new BigDecimal("1.0");
        BigDecimal d = new BigDecimal(0.1f);
        BigDecimal b = new BigDecimal("0.9");
        BigDecimal c = new BigDecimal("0.8");

        BigDecimal x = a.subtract(b);
        BigDecimal y = b.subtract(c);

        // 因为老不相等，为了把邓舟变成泰坦尼克，这次咱们反过来
        if (!x.equals(y)) {
            System.out.println("邓舟最终也是泰坦尼克号！");
        } else {
            System.out.println("邓舟，你没那命，死心吧。");
        }
        System.out.println(x);
        System.out.println(y);*/
}
