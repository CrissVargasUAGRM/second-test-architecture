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
public class StrategyBurbuja implements Strategy{

    @Override
    public void ordenar(int[] arreglo) {
        int j, i, aux;
        for (i = 0; i < arreglo.length; i++) {
            for (j = 0; j < arreglo.length - i; j++) {
                if(arreglo[j+1] < arreglo[j]){
                    aux = arreglo[j + 1];
                    arreglo[j + 1] = arreglo[j];
                    arreglo[j] = aux;
                }
            }
        }
    }
    
}
