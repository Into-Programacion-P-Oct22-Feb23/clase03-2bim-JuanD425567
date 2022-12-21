/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete04;

/**
 *
 * JUAN DAVID GARCIA CARRION
 */
public class Ejemplo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creación de arreglo bidimensionales
        
        double[][] dato1 = {{1, 2, 3},{6, 8, 9}}; //
        /*
            1   4   3
            36  64  9
        d*/
       double dato2[][] = new double[2][3];
       
        for (int i = 0; i < dato1.length ; i++) {
            for (int j = 0; j < dato1[i].length; j++) {
                if (dato1[i][j]%2==0) {
                    dato2[i][j]=dato1[i][j]*dato1[i][j];
                }else{
                    dato2[i][j]=dato1[i][j];
                }
                
            }
        }
        for (int i = 0; i < dato1.length; i++) {
            for (int j = 0; j < dato1[i].length; j++) {
                System.out.printf("%.0f\t", dato2[i][j]);
            }
            System.out.println("");
        }
    }
    
}
