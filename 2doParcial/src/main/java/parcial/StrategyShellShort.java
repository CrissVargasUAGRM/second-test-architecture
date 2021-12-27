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
public class StrategyShellShort implements Strategy{

    @Override
    public void ordenar(int[] arreglo) {
        for (int i = arreglo.length/2; i > 0; i=(i==2?1:(int)Math.round(i/2.2))) {
            for (int j = i; j < arreglo.length; j++) {
                for (int k = j; k >= i && arreglo[k-i] > arreglo[k]; k -= i) {
                    int temp = arreglo[k];
                    arreglo[k] = arreglo[k-i];
                    arreglo[k-i] = temp;
                }
            }
        }
    }
    
}
