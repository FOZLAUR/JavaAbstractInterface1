package fozlaur;

public class Main {
    public static void main(String[] args) {
        Cock cock = new Cock();
        Hen hen = new Hen();
        Chick chick = new Chick();
        int quantity[] = getQuantity(4);
        System.out.format(quantity[0]+" cock for %.2f yuan, ", cock.getCost());
        System.out.format(quantity[1]+" hen for %.2f yuan, ",hen.getCost());
        System.out.format(quantity[2]+" chicks for %.2f yuan.\n",chick.getCost());
        cock.setNum(quantity[0]);
        hen.setNum(quantity[1]);
        chick.setNum(quantity[2]);

        double sum = cock.getNum()*cock.getCost() + hen.getNum()*hen.getCost() + chick.getNum()*chick.getCost();
        System.out.println(sum);
    }

    public static int[] getQuantity(int limit){
        boolean isFound = false;
        int[] quantity = {0,0,0};
        int i = 0;

        if(limit<0){
            i = 4;
        } else if (limit>3){
            i = 12;
        } else {
            i = 4*limit;
        }

        quantity[0] = i;
        quantity[1] = (25 - 7*(i/4));
        quantity[2] = 100 - quantity[0] - quantity[1];
        return quantity;
    }
}
