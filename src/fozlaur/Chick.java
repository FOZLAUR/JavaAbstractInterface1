package fozlaur;

public class Chick extends Chicken{

    public Chick(){
        this.cost = (1.0/3.0);
    }

    @Override
    public void setCost(){
        this.cost = (1.0/3.0);
    }

    @Override
    public void makeSound(){
        System.out.println("Cheep cheep cheep!");
    }
}
