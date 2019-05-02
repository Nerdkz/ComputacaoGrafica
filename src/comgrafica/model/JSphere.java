package comgrafica.model;

public class JSphere extends JShape {
	
	private JVector_3 position;
	private float radius;
	
	public JSphere() {
		
	}
	
	public JSphere(JVector_3 position, float radius) {
		super();
		this.position = position;
		this.radius = radius;
	}
	
	public JVector_3 getPosition() {
		return position;
	}
	public void setPosition(JVector_3 position) {
		this.position = position;
	}
	public float getRadius() {
		return radius;
	}
	public void setRadius(float radius) {
		this.radius = radius;
	}
	
	

}
