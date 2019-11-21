package ppt;

/**
 * @Description:
 * @Author: ZhaoZhenHua1 Administrator
 * @Date: 2019/11/12 22:01
 */
public class BeanDemo implements Cloneable  {
    public static final String DEMO_CONSTANT_STR = "hail hydra";
    private int num;

    private InnerBeanDemo innerBeanDemo;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public InnerBeanDemo getInnerBeanDemo() {
        return innerBeanDemo;
    }

    public void setInnerBeanDemo(InnerBeanDemo innerBeanDemo) {
        this.innerBeanDemo = innerBeanDemo;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Object obj=super.clone();
        InnerBeanDemo innerBeanDemo=((BeanDemo)obj).getInnerBeanDemo();
        ((BeanDemo)obj).setInnerBeanDemo((InnerBeanDemo) innerBeanDemo.clone());
        return obj;
    }
}
