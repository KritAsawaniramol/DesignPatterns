import animals.Quackable;
import animals.composites.LeaderFlock;
import animals.decorated.QuackCounter;
import adapters.AbstractDuckFactory;
import factories.CountingAndEchoDuckFactory;

public class DuckSimulator {
    public static void main (String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        //adapters.AbstractDuckFactory duckFactory = new factories.CountingAndEchoDuckFactory();
        //adapters.AbstractDuckFactory duckFactory = new factories.DuckFactory();

        AbstractDuckFactory duckFactory = new CountingAndEchoDuckFactory.CountingDuckFactory();

        simulator.simulate(duckFactory);
    }

    void simulate(AbstractDuckFactory duckFactory) {

        Quackable mallardDuck = duckFactory.createMallardDuck();
        Quackable redheadDuck = duckFactory.createRedheadDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        System.out.println("\nDuck Simulator: With Composite - Flocks");

        //animals.Quackable mallardDuck = new animals.decorated.QuackEcho(new animals.decorated.QuackCounter(new animals.MallardDuck()));
        //animals.Quackable redheadDuck = new animals.decorated.QuackEcho(new animals.decorated.QuackCounter(new animals.RedheadDuck()));
        //animals.Quackable duckCall = new animals.decorated.QuackEcho(new animals.decorated.QuackCounter(new animals.DuckCall()));
        //animals.Quackable rubberDuck = new animals.decorated.QuackEcho(new animals.decorated.QuackCounter(new animals.RubberDuck()));
        //animals.Quackable gooseDuck = new adapters.GooseAdapter((new animals.Goose()));
        //animals.Quackable pigeon = new adapter.PigeonAdapter(new animals.Pigeon());

        //animals.Quackable mallardDuck = new animals.decorated.QuackCounter(new animals.decorated.QuackEcho(new animals.MallardDuck()));
        //animals.Quackable redheadDuck = new animals.decorated.QuackCounter(new animals.decorated.QuackEcho(new animals.RedheadDuck()));
        //animals.Quackable duckCall = new animals.decorated.QuackCounter(new animals.decorated.QuackEcho(new animals.DuckCall()));
        //animals.Quackable rubberDuck = new animals.decorated.QuackCounter(new animals.decorated.QuackEcho(new animals.RubberDuck()));
        //animals.Quackable gooseDuck = new adapters.GooseAdapter((new animals.Goose()));
        //animals.Quackable pigeon = new adapter.PigeonAdapter(new animals.Pigeon());

        LeaderFlock flockOfDucks = new LeaderFlock();
        flockOfDucks.add(mallardDuck);
        flockOfDucks.add(redheadDuck);
        flockOfDucks.add(duckCall);
        flockOfDucks.add(rubberDuck);




        System.out.println("\nDuck Simulator: Whole animals.composites.Flock Simulation");
        simulate(flockOfDucks);

        //simulate(mallardDuck);
        //simulate(redheadDuck);
        //simulate(duckCall);
        //simulate(rubberDuck);
        //simulate(gooseDuck);
        //simulate(pigeon);
        System.out.println("The ducks quacked " +
                QuackCounter.getQuacks() + " times");
    }
    void simulate(Quackable duck) {
        duck.quack();
    }
}
