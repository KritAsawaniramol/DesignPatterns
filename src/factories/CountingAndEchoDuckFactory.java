package factories;

import animals.*;
import adapters.AbstractDuckFactory;
import animals.decorated.QuackCounter;
import animals.decorated.QuackEcho;

public class CountingAndEchoDuckFactory extends AbstractDuckFactory {
    public Quackable createMallardDuck() {
        return new QuackEcho(new QuackCounter(new MallardDuck()));
    }

    public Quackable createRedheadDuck() {
        return new QuackEcho(new QuackCounter(new RedheadDuck()));
    }

    public Quackable createDuckCall() {
        return new QuackEcho(new QuackCounter(new DuckCall()));
    }

    public Quackable createRubberDuck() {
        return new QuackEcho(new QuackCounter(new RubberDuck()));
    }

    public static class CountingDuckFactory extends AbstractDuckFactory {

        public Quackable createMallardDuck() {
            return new QuackCounter(new MallardDuck());
        }

        public Quackable createRedheadDuck() {
            return new QuackCounter(new RedheadDuck());
        }

        public Quackable createDuckCall() {
            return new QuackCounter(new DuckCall());
        }

        public Quackable createRubberDuck() {
            return new QuackCounter(new RubberDuck());
        }
    }
}
