public class DuckSimulator {
    public static void main (String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        //AbstractDuckFactory duckFactory = new CountingAndEchoDuckFactory();
        //AbstractDuckFactory duckFactory = new DuckFactory();

        AbstractDuckFactory duckFactory = new CountingDuckFactory();

        simulator.simulate(duckFactory);
    }

    void simulate(AbstractDuckFactory duckFactory) {

        Quackable mallardDuck = duckFactory.createMallardDuck();
        Quackable redheadDuck = duckFactory.createRedheadDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        System.out.println("\nDuck Simulator: With Composite - Flocks");

        //Quackable mallardDuck = new QuackEcho(new QuackCounter(new MallardDuck()));
        //Quackable redheadDuck = new QuackEcho(new QuackCounter(new RedheadDuck()));
        //Quackable duckCall = new QuackEcho(new QuackCounter(new DuckCall()));
        //Quackable rubberDuck = new QuackEcho(new QuackCounter(new RubberDuck()));
        //Quackable gooseDuck = new GooseAdapter((new Goose()));
        //Quackable pigeon = new PigeonAdapter(new Pigeon());

        //Quackable mallardDuck = new QuackCounter(new QuackEcho(new MallardDuck()));
        //Quackable redheadDuck = new QuackCounter(new QuackEcho(new RedheadDuck()));
        //Quackable duckCall = new QuackCounter(new QuackEcho(new DuckCall()));
        //Quackable rubberDuck = new QuackCounter(new QuackEcho(new RubberDuck()));
        //Quackable gooseDuck = new GooseAdapter((new Goose()));
        //Quackable pigeon = new PigeonAdapter(new Pigeon());

        LeaderFlock flockOfDucks = new LeaderFlock();
        flockOfDucks.add(mallardDuck);
        flockOfDucks.add(redheadDuck);
        flockOfDucks.add(duckCall);
        flockOfDucks.add(rubberDuck);




        System.out.println("\nDuck Simulator: Whole Flock Simulation");
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
