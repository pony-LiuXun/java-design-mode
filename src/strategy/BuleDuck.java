package strategy;

import strategy.impl.RunStrategyImpl;
import strategy.impl.TweetStrategyImpl;

public class BuleDuck extends Duck {
    public BuleDuck() {
        super();
        super.setTweetStrategy(new TweetStrategyImpl());
        super.setRunStrategy(new RunStrategyImpl());
    }


}
