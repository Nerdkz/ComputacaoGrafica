package comgrafica.model;

public class JShaderGlobal {
	
	private JVector_3 point;
	private JVector_3 normal;
	private JVector_2 uv;
	private JVector_3 tangentU;
	private JVector_3 tangentV;
	private JVector_3 viewDirection;
	private JVector_3 lightDirection;
	private JVector_3 lightPoint;
	private JVector_3 lightNormal;
	
	
	public JShaderGlobal() {
		
	}
	
	public JShaderGlobal(JVector_3 point, JVector_3 normal, JVector_2 uv, JVector_3 tangentU, JVector_3 tangentV,
			JVector_3 viewDirection, JVector_3 lightDirection, JVector_3 lightPoint, JVector_3 lightNormal) {
		super();
		this.point = point;
		this.normal = normal;
		this.uv = uv;
		this.tangentU = tangentU;
		this.tangentV = tangentV;
		this.viewDirection = viewDirection;
		this.lightDirection = lightDirection;
		this.lightPoint = lightPoint;
		this.lightNormal = lightNormal;
	}

	public JVector_3 getPoint() {
		return point;
	}
	public void setPoint(JVector_3 point) {
		this.point = point;
	}
	public JVector_3 getNormal() {
		return normal;
	}
	public void setNormal(JVector_3 normal) {
		this.normal = normal;
	}
	public JVector_2 getUv() {
		return uv;
	}
	public void setUv(JVector_2 uv) {
		this.uv = uv;
	}
	public JVector_3 getTangentU() {
		return tangentU;
	}
	public void setTangentU(JVector_3 tangentU) {
		this.tangentU = tangentU;
	}
	public JVector_3 getTangentV() {
		return tangentV;
	}
	public void setTangentV(JVector_3 tangentV) {
		this.tangentV = tangentV;
	}
	public JVector_3 getViewDirection() {
		return viewDirection;
	}
	public void setViewDirection(JVector_3 viewDirection) {
		this.viewDirection = viewDirection;
	}
	public JVector_3 getLightDirection() {
		return lightDirection;
	}
	public void setLightDirection(JVector_3 lightDirection) {
		this.lightDirection = lightDirection;
	}
	public JVector_3 getLightPoint() {
		return lightPoint;
	}
	public void setLightPoint(JVector_3 lightPoint) {
		this.lightPoint = lightPoint;
	}
	public JVector_3 getLightNormal() {
		return lightNormal;
	}
	public void setLightNormal(JVector_3 lightNormal) {
		this.lightNormal = lightNormal;
	}
	
	
	

	
	

}
