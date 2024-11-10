package app;

public class Point {
    private int abscisse;
    protected int ordonnee;
    private char nom;

    public Point() {
        this.abscisse = 0;
        this.ordonnee = 0;
        this.nom = 'O';
    }

    public Point(int abscisse, int ordonnee, char nom) {
        this.abscisse = abscisse;
        this.ordonnee = ordonnee;
        this.nom = nom;
    }

    public Point(Point p) {
        this.abscisse = p.abscisse;
        this.ordonnee = p.ordonnee;
        this.nom = p.nom;
    }

    public void afficher() {
        System.out.println(nom + "(" + abscisse + ", " + ordonnee + ")");
    }

    public void deplacer(int a, int b) {
        this.abscisse += a;
        this.ordonnee += b;
    }

    public void reset() {
        this.abscisse = 0;
        this.ordonnee = 0;
    }

    @Override
    public String toString() {
        return nom + "(" + abscisse + ", " + ordonnee + ")";
    }    

    public boolean coincide_V1(Point p) {
        return this.abscisse == p.abscisse && this.ordonnee == p.ordonnee;
    }

    public static boolean coincide_V2(Point a, Point b) {
        return a.abscisse == b.abscisse && a.ordonnee == b.ordonnee;
    }

    public static void main(String[] args) {
        Point p1 = new Point(); 
        Point p2 = new Point(5, 10, 'A'); 
        Point p3 = new Point(p2);

        p1.afficher(); 
        p2.afficher(); 
        p3.afficher(); 

        p2.deplacer(3, -2);
        p2.afficher(); 

        p2.reset(); 
        p2.afficher(); 

        System.out.println(p1.coincide_V1(p2));
        System.out.println(Point.coincide_V2(p1, p3));
        System.out.println(p1); 
        System.out.println(p2); 
    }
}
