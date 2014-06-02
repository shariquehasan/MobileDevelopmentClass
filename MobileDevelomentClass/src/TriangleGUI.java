import javax.swing.JOptionPane;

public class TriangleGUI {

	public static void main(String[] args) {
		double side1, side2, side3;
		Triangle t;
		side1 = Double.parseDouble(JOptionPane.showInputDialog("Enter Side1"));
		side2 = Double.parseDouble(JOptionPane.showInputDialog("Enter Side2"));
		side3 = Double.parseDouble(JOptionPane.showInputDialog("Enter Side3"));
		t = new Triangle(side1, side2, side3);
		JOptionPane.showMessageDialog(null, "Area is " + t.getArea()
				+ "\nPerimeter is " + t.getPerimeter());
	}

}

class Triangle {
	double s1, s2, s3;

	public Triangle(double s1, double s2, double s3) {
		this.s1 = s1;
		this.s2 = s2;
		this.s3 = s3;
	}

	public double getArea() {
		double p = getPerimeter() / 2;
		return Math.sqrt(p * (p - s1) * (p - s2) * (p - s3));
	}

	public double getPerimeter() {
		return s1 + s2 + s3;
	}

}