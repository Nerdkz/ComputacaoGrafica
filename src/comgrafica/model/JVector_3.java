package comgrafica.model;

public class JVector_3 {
	
	public float x;
	public float y;
	public float z;
        
        public JVector_3 (){
            
        }
	
	public JVector_3(float x, float y, float z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
        //Soma de vetores
	public JVector_3 add(JVector_3 addend) {
		return new JVector_3(x + addend.x, y + addend.y, z + addend.z);
	}
        //Multiplicação de vetores
        public JVector_3 mult(float k) {
            return new JVector_3(x*k, y*k, z*k);
        }
          public JVector_3 div(float k) {
            return new JVector_3(x/k, y/k, z/k);
        }
        //Subtração de vetores
	public JVector_3 sub(JVector_3 subend) {
		return new JVector_3(x - subend.x, y - subend.y, z - subend.z);
	}
        //Produto Escalar
        public float dotEscalar(JVector_3 vetor) {
            return (x*vetor.x + y*vetor.y + z*vetor.z);
        }     
        //Produto vetorial
        public JVector_3 crossVetorial(JVector_3 vetor) {
            return new JVector_3 (y*vetor.z - z*vetor.y, z*vetor.x - x*vetor.z,x*vetor.y - y*vetor.x);
        }
        //Blend de cores
        public JVector_3 multColor(JVector_3 vetor) {
            return new JVector_3(x*vetor.x, y*vetor.y, z*vetor.z);
        }
        public float length(){
            return (float) Math.sqrt(x*x + y*y + z*z);
        }
        public JVector_3 normalize() {
            return div(length());
        }

}
