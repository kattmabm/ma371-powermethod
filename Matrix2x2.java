
public class Matrix2x2 {
	
	private double topLeft;
	private double topRight;
	private double bottomLeft;
	private double bottomRight;
	
	public Matrix2x2(double topLeft, double topRight, double bottomLeft, double bottomRight) {
		this.topLeft = topLeft;
		this.topRight = topRight;
		this.bottomLeft = bottomLeft;
		this.bottomRight = bottomRight;
	}
	
	public Matrix2x1 multiplyByVector(Matrix2x1 vector) {
		Matrix2x1 result = new Matrix2x1(0, 0);
		result.setTop((this.getTopLeft() * vector.getTop()) + (this.getTopRight() * vector.getBottom()));
		result.setBottom((this.getBottomLeft() * vector.getTop()) + (this.getBottomRight() * vector.getBottom()));
		return result;
	}

	public double getTopLeft() {
		return topLeft;
	}
	public void setTopLeft(double topLeft) {
		this.topLeft = topLeft;
	}
	public double getTopRight() {
		return topRight;
	}
	public void setTopRight(double topRight) {
		this.topRight = topRight;
	}
	public double getBottomLeft() {
		return bottomLeft;
	}
	public void setBottomLeft(double bottomLeft) {
		this.bottomLeft = bottomLeft;
	}
	public double getBottomRight() {
		return bottomRight;
	}
	public void setBottomRight(double bottomRight) {
		this.bottomRight = bottomRight;
	}
	
}
