/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_17_rangos;

import java.util.Scanner;

/**
 *
 * @author Jose Enrique
 */
public class EVA1_17_RANGOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        int calif;
        Scanner captu = new Scanner(System.in);
        System.out.println("Introduce tu calificacion final");
        calif = captu.nextInt();
        if (calif <=100 && calif >=0 ){
            System.out.println("Calif valida");
    }else{
           System.out.println("Calif invalidad"); 
        }
    }
    
}
