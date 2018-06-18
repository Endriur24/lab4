package lab3;

public class main {
    public static void main(String[] args)
    {
        Vector2D vect1 = new Vector2D(2d,5d);
        Vector2D vect2 = new Vector2D(3d,9d);
        Vector2D sum12 = vect1.sumVect(vect2);
        Vector2D sub12 = vect1.subVect(vect2);
        Vector2D wers1 = vect1.normalize();
        Vector2D wers2 = vect2.normalize();
        double l1 = vect1.length();
        double l2 = vect2.length();
        Vector2D v1amp = vect1.constMultVect(7);
        System.out.println("Wektor 1: ");
        System.out.println("dlugosc: " + l1);
        System.out.println("znormalizowany: x - " + wers1.x + " y - " + wers1.y);
        System.out.println("Wektor 2: ");
        System.out.println("dlugosc: " + l2);
        System.out.println("znormalizowany: x - " + wers2.x + " y - " + wers2.y);
        System.out.println();
        System.out.println("Suma: x - " + sum12.x + " y - " + sum12.y);
        System.out.println("Roznica: x - " + sub12.x + " y - " + sub12.y);
        System.out.println();
        System.out.println("Wektor 1 pomnozony przez 7:");
        System.out.println("x- " + v1amp.x);
        System.out.println("y- " + v1amp.y);
    }
}