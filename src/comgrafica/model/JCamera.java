/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comgrafica.model;

/**
 *
 * @author aluno
 */
public class JCamera {
    
    
    public float FOV;
    public JFilm film;
    public JMatrix WorldMatrix;
    
    public JCamera(float FOV, JFilm film, JMatrix WorldMatrix){
        this.FOV = FOV;
        this.film = film;
        this.WorldMatrix = WorldMatrix;
    }
    
    public JCamera(){
        
    }
    
    public void lookAt(JVector_3 position, JVector_3 target, JVector_3 up){
        JVector_3 w = position.sub(target).normalize();
        JVector_3 u = up.crossVetorial(w).normalize();
        JVector_3 v = w.crossVetorial(u);
        JMatrix WorldMatrix = new JMatrix(u.x, v.x, w.x, position.x,
                                          u.y, v.y, w.y, position.y,
                                          u.z, v.z, w.z, position.z,
                                          0, 0 ,0, 1);                                       
    }
    
    public JRay generateRay(float x, float y, JVector_3 sample) {
        float xndc = (float)(x + 0.5) / film.width;
        float yndc = (float) (y+0.5) / film.height;
        float D = (float) Math.tan(FOV/2);
        float xscreen = (float) (2*xndc - 1) * film.aspectRatio() * D;
        float yscreen = (float) (1 - 2*yndc) * D;
        JVector_3 pixel = new JVector_3(xscreen, yscreen, -1);
        pixel = WorldMatrix.mult(pixel);
        JVector_3 position = new JVector_3(); //extrair a posição da camera de world matrix
        JVector_3 direction = pixel.sub(position).normalize();//criar direção do raio
        return new JRay(position, direction);
    }
}
