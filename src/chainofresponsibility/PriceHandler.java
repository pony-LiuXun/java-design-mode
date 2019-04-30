package chainofresponsibility;

/**
 * 价格责任链模式
 */
public abstract class PriceHandler {
    /**
     * 后继对象
     */
    protected PriceHandler successor;



    public void setSuccessor(PriceHandler successor) {
        this.successor = successor;
    }

    /**
     * 处理折扣申请
     *
     * @param discount
     */
    public abstract void processDiscount(float discount);
}
