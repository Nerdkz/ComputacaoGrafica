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
public class JMatrix {
    
    public float[][] data = new float [4][4];
    
    public JMatrix () {
        data[0][0] = 1;
        data[1][1] = 1;
        data[2][2] = 1;
        data[3][3] = 1;
    }
    
    public JMatrix(float M00, float M01, float M02, float M03,
                   float M10, float M11, float M12, float M13,
                   float M20, float M21, float M22, float M23,
                   float M30, float M31, float M32, float M33){
        
        data[0][0] = M00;
        data[0][1] = M01;
        data[0][2] = M02;
        data[0][3] = M03;
        data[1][0] = M10;
        data[1][1] = M11;
        data[1][2] = M12;
        data[1][3] = M13;
        data[2][0] = M20;
        data[2][1] = M21;
        data[2][2] = M22;
        data[2][3] = M23;
        data[3][0] = M30;
        data[3][1] = M31;
        data[3][2] = M32;
        data[3][3] = M33; 
    }
    
    //Transformar vetor
    public JVector_3 mult(JVector_3 vetor) {
        return new JVector_3 (data[0][0] * vetor.x + data[0][1] * vetor.y + data[0][2] * vetor.z + data[0][3],
                            data[1][0] * vetor.x + data[1][1] * vetor.y + data[1][2] * vetor.z + data[1][3],
                            data[2][0] * vetor.x + data[2][1] * vetor.y + data[2][2] * vetor.z + data[2][3]
                           );       
    } 
}
