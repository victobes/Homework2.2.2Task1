import java.util.Locale;

public class Vector2D {
	public double vX;
	public double vY;
	public Vector2D() {
		vX = 1;
		vY = 1;
	}
	public Vector2D(double vX ,double vY) {
		this.vX = vX;
		this.vY = vY;
	}
	public Vector2D(Vector2D v) {
		this(v.getvX(), v.getvY());
	}
	public double getvX() {
		return vX;
	}
	public void setvX(double vX) {
		this.vX = vX;
	}
	public double getvY() {
		return vY;
	}
	public void setvY(double vY) {
		this.vY = vY;
	}
	public void print() {
		System.out.println("(" + String.format(Locale.US,"%.2f", vX) + ", " + String.format(Locale.US,"%.2f", vY) + ")");
	}
}
