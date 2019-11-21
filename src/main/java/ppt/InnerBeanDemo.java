package ppt;

/**
 * @Description:
 * @Author: ZhaoZhenHua1 Administrator
 * @Date: 2019/11/13 14:33
 */
public class InnerBeanDemo implements Cloneable{
    private int innerNum;

    public int getInnerNum() {
        return innerNum;
    }

    public void setInnerNum(int innerNum) {
        this.innerNum = innerNum;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
