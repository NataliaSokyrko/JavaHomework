
public class chepol {
	public double chePolynom (int n, double x) {
		int i;
		double t1, t2, h, x2;
		if (n==0) return (1.0);
		if (n==1) return (x);
		t2=x;
		t1 = 1.0;
		x2=x+x;
		h=0.0;
		for (i=2; i<=n; i++) {
			h=x2*t2-t1;
			t1=t2;
			t2=h;
		}
		return (h);
	}
}
