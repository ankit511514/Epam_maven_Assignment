package Epam.chocolate;

public class Chocolate  implements Comparable<Chocolate>{
    private String name;
    private int price;
    private int pieces;
public Chocolate()
{

}
    public Chocolate(String name,int price,int pieces){
        this.name=name;
        this.price=price;
        this.pieces=pieces;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getPieces() {
        return pieces;
    }

    @Override
    public int compareTo(Chocolate c) {
        if(c.price > price)
            return 1;
        if(c.price < price)
            return -1;
        else
            return 0;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", price=" + price +
                ", pieces=" + pieces;
    }
}
