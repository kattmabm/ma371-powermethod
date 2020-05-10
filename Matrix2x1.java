
public class Matrix2x1 {
	
	private double top;
	private double bottom;
	
	public Matrix2x1(double top, double bottom) {
		this.top = top;
		this.bottom = bottom;
	}
	
	public double largerValue() {
		if (Math.abs(this.top) > Math.abs(this.bottom)) {
			return top;
		} else {
			return bottom;
		}
	}

	public double getTop() {
		return top;
	}
	public void setTop(double top) {
		this.top = top;
	}
	public double getBottom() {
		return bottom;
	}
	public void setBottom(double bottom) {
		this.bottom = bottom;
	}

}
