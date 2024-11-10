package app;

public class circle {
	private int rayon;
	protected Point p;
	public circle(Point pp,int r) {
		this.p=pp;
		this.rayon=r;
		
		
	}
	public void Afficher() {
		this.p.afficher();
		System.out.println( "rayon :"+this.rayon);
		
	}
	public void Deplacer(int a,int b) {
		this.p.deplacer(a, b);
	}
	public static boolean  coincide(circle a,circle b) {
		return a.p.coincide_V1(b.p) && a.rayon == b.rayon ;
	}
	public static void main(String[] args) {
		 Point p1 = new Point(3, 5, 'A');
		 Point p2 = new Point(7, 7, 'k');

	circle d=new circle(p1,10);
	circle d2=new circle(p2,10);

		d.Afficher();
		d.Deplacer(4, 2);
		d.Afficher();
        System.out.println(circle.coincide(d,d2));


}
}