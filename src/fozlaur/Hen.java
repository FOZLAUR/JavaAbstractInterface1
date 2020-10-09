package fozlaur;

public class Hen extends Chicken{

    public Hen(){
        this.cost = 3;
    }

    @Override
    public void setCost(){
        this.cost = 3;
    }

    @Override
    public void makeSound(){
        System.out.println("Cluck cluck!");
    }
}
