package strategy;

/**
 * 鸭子的抽象父类
 * 鸭子的具体属性交与鸭子属性的策略接口来实现
 *
 * 当一个系统中有许多类，它们之间的区别仅在于它们的行为，希望动态地让一个对象在许多行为中选择一种行为时；
 *  当一个系统需要动态地在几种算法中选择一种时；
 *  当一个对象有很多的行为，不想使用多重的条件选择语句来选择使用哪个行为时。
 */
public abstract class Duck {

    public void run(){
        System.out.println("小鸭子会奔跑");
    }

    public void swing(){
        System.out.println("小鸭子会游泳");
    }

    /**
     * 鸣叫策略
     */
    private TweetStrategy tweetStrategy;

    public void setTweetStrategy(TweetStrategy tweetStrategy) {
        this.tweetStrategy = tweetStrategy;
    }

    public void pertyLiving(){
        try{
            tweetStrategy.livingTweey();
        }catch (NullPointerException e){
            System.out.println("当前实例并未实现鸭子的鸣叫策略");
        }

    }

    /**
     * 奔跑策略
     */

    private RunStrategy runStrategy;

    public void setRunStrategy(RunStrategy runStrategy){
        this.runStrategy =runStrategy ;
    }
    public  void runPerty(){
        runStrategy.runWay();
    }

}
