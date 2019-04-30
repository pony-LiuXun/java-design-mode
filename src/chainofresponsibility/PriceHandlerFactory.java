package chainofresponsibility;

public class PriceHandlerFactory {

    /**
     * 构建后继处理关系工厂方法
     * @return
     */
    public static PriceHandler createPricHandler() {
        PriceHandler sales = new Sales();
        PriceHandler director = new Director();
        PriceHandler manager = new Manager();
        PriceHandler vp = new VicePresident();
        PriceHandler ceo = new CEO();
        //构建后继关系
        sales.setSuccessor(director);
        director.setSuccessor(manager);
        manager.setSuccessor(vp);
        vp.setSuccessor(ceo);
        return sales;
    }


}
