package comgrafica.model;

public class JVector_3 {
	
	private final double x;
	private final double y;
	private final double z;
	
	
	public JVector_3(double x, double y, double z) {
		super();
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public JVector_3 add(JVector_3 addend) {
		return new JVector_3(x + addend.x, y + addend.y, z + addend.z);
	}

}
