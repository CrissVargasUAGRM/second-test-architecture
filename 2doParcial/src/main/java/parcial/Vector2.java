/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial;

/**
 *
 * @author Christian Vargas
 */
public class Vector2 implements VectorInt{
    
    int n;
    int[] vector;

    public Vector2(int n) {
        this.vector = new int[n];
    }

    @Override
    public VectorInt clonar() {
        VectorInt vectorClon = new Vector1(this.n);
        return vectorClon;
    }

    @Override
    public void setData(int n) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
