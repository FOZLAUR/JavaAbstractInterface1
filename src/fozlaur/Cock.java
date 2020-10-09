package fozlaur;

public class Cock extends Chicken{

    public Cock(){
        this.cost = 5;
    }

    @Override
    public void setCost(){
        this.cost = 5;
    }

    @Override
    public void makeSound(){
        System.out.println("Cock-a-doodle-doo!");
    }
}
