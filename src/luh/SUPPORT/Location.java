package luh.SUPPORT;

public class Location {
    private String name;
    private int X;
    private int Y;

    public Location(String name, int x, int y) {
        this.name = name;
        X = x;
        Y = y;
    }

    public double euclideanDistance(Location L){
        return Math.sqrt((Math.pow(L.Y - this.Y, 2)) + (Math.pow(L.X - this.X, 2)));
    }

    public String toString(){
        return String.format("Location [X: %d, Y: %d]", this.X, this.Y);
    }

}
