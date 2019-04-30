package strategy;

import strategy.impl.RunPushStrategyImpl;

public class ReadDuck extends Duck {
    public ReadDuck() {
        super();
        super.setRunStrategy(new RunPushStrategyImpl());
    }

    @Override
    public void run() {
        super.run();
    }

    @Override
    public void swing() {
        super.swing();
    }
}
