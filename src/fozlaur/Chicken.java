package fozlaur;

abstract class Chicken {
    public double cost;
    public int num = 0;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public double getCost() {
        return cost;
    }

    abstract public void setCost();
    abstract public void makeSound();
}
