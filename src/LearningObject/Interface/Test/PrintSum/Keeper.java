package LearningObject.Interface.Test.PrintSum;

public class Keeper {
    public void keep(Animal animal)
    {
        animal.eat();
        if(animal instanceof Tiger)
           ((Tiger)animal).strolling();
    }
}
