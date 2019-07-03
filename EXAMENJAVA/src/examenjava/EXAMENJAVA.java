/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenjava;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ANUAR
 */
public class EXAMENJAVA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner l = new Scanner(System.in);
        ArrayList<String> nomb = new ArrayList<String>();
        ArrayList<Float> t = new ArrayList<Float>();
        ArrayList<Float> v = new ArrayList<Float>();
        int mejor=0,op = 1;
        float vac=0;
        
       
        
        while (op != 0) {           
            System.out.println("ingrese nombre:");
            nomb.add(l.next());
            System.out.println("ingrese la velocidad y si desea salir digite cero:");
            op = l.nextInt();
            if(op != 0){
                v.add((float) op);
                t.add(100 / v.get(v.size()-1));
                vac =vac + t.get(t.size()-1);
            }}
        
        vac = vac / t.size();
        int i=0, cont=0;
        for(; i<v.size(); i++){
            
            if(v.get(i)>v.get(mejor)){
                mejor = i;
            }
            if(t.get(i)>vac){
                cont=cont+1;
            }
             System.out.println(nomb.get(i) + " " + v.get(i) + " " + t.get(i));

        } 
        System.out.println("Promedio: " + vac);
        System.out.println("El más rápido es " + nomb.get(mejor) + " lo logro en " + t.get(mejor) + " a una velocidad de " + v.get(mejor));
        System.out.println("el numero de estudiantes por encima del promedio es: " + cont);
    }
    
}

    
    

