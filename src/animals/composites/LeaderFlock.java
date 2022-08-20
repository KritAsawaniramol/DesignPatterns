package animals.composites;

import animals.Quackable;
import animals.composites.Flock;

import java.util.Iterator;

public class LeaderFlock extends Flock {

    public void quack() {
        Iterator iterator = quackers.iterator();
        int i = 0;
        while(iterator.hasNext()){
            Quackable quacker = (Quackable)iterator.next();
            if(i == 0){
                quacker.quack();
                quacker.quack();
                quacker.quack();
            }
            else{
                quacker.quack();
            }
            i++;
        }
    }

}

