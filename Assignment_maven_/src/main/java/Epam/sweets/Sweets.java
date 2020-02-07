package Epam.sweets;

public class Sweets implements Comparable<Sweets> {
    private String name;
    private int price;
    private int pieces;

    public Sweets(String name, int price, int pieces) {
        this.name = name;
        this.price = price;
        this.pieces = pieces;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPieces() {
        return pieces;
    }

    public void setPieces(int weight) {
        this.pieces = pieces;
    }

    @Override
    public int compareTo(Sweets s) {
        if(s.price > price)
            return 1;
        if(s.price < price)
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
