package comgrafica.model;

public class JVector_2 {
	
	private final double x;
	private final double y;
	
	
	public JVector_2(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public JVector_2 add(JVector_2 addend) {
		return new JVector_2(x + addend.x, y + addend.y);
	}

}
