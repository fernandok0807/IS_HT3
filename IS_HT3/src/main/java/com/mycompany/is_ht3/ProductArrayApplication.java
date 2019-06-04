/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.is_ht3;

import java.util.Arrays;
import java.util.OptionalLong;

/**
 *
 * @author enmanuel
 */
public class ProductArrayApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        long input[] =null;
        System.out.println("Prueba 1");
        input =  new long[]{ 9, 7, 3, 5, 1};
        System.out.print("Probando "+Arrays.toString(input)+" - ");
        System.out.println("Resultado "+ Arrays.toString(calculateProductArrayBasic(input)));
        
        System.out.println("\nPrueba 2 Entrada y Salida Basica");
        input =  new long[]{ 5, 4, 3, 2, 1};
        System.out.print("Probando "+Arrays.toString(input)+" - ");
        System.out.println("Resultado "+ Arrays.toString(calculateProductArrayBasic(input)));
        
        System.out.println("\nPrueba 3 Entrada y Salida Vacia");
        input =  new long[]{};
        System.out.print("Probando "+Arrays.toString(input)+" - ");
        System.out.println("Resultado "+ Arrays.toString(calculateProductArrayBasic(input)));
        
        System.out.println("\nPrueba 4 Entrada Cero y Salida Uno");
        input =  new long[]{0};
        System.out.print("Probando "+Arrays.toString(input)+" - ");
        System.out.println("Resultado "+ Arrays.toString(calculateProductArrayBasic(input)));
        
        System.out.println("\nPrueba 5 Entrada Uno y Salida Uno");
        input =  new long[]{1};
        System.out.print("Probando "+Arrays.toString(input)+" - ");
        System.out.println("Resultado "+ Arrays.toString(calculateProductArrayBasic(input)));
        
        System.out.println("\nPrueba 6 Entrada Dos Numeros y Salida Dos Numeros");
        input =  new long[]{4,6};
        System.out.print("Probando "+Arrays.toString(input)+" - ");
        System.out.println("Resultado "+ Arrays.toString(calculateProductArrayBasic(input)));
        
        System.out.println("\nPrueba 7 Entrada y Salida null");
        input =  null;
        System.out.print("Probando "+Arrays.toString(input)+" - ");
        System.out.println("Resultado "+ Arrays.toString(calculateProductArrayBasic(input)));
        
        System.out.println("\nPrueba 8 Entrada y Salida de Arreglo de Dimension Cero");
        input =  new long[0];
        System.out.print("Probando "+Arrays.toString(input)+" - ");
        System.out.println("Resultado "+ Arrays.toString(calculateProductArrayBasic(input)));
        
        System.out.println("\nPrueba 9 Entrada de Varios Ceros en el Arreglo");
        input =  new long[]{ 8, 0, 3, 0, 1};
        System.out.print("Probando "+Arrays.toString(input)+" - ");
        System.out.println("Resultado "+ Arrays.toString(calculateProductArrayBasic(input)));
        
        System.out.println("\nPrueba 10 Entrada de un Ceros en el Arreglo");
        input =  new long[]{ 8, 7, 3, 0, 1};
        System.out.print("Probando "+Arrays.toString(input)+" - ");
        System.out.println("Resultado "+ Arrays.toString(calculateProductArrayBasic(input)));
        
    }
    
    
    public static long[] calculateProductArrayBasic(long[] input){
        
        if(input==null){
            return null;
        }
        
        else{
        long resultado[] = Arrays.copyOf(input, input.length);
        Arrays.fill(resultado, 0);
        long auxiliar[] = Arrays.copyOf(input,input.length);
        Arrays.sort(auxiliar);
        long valEncontrado=0;
        int posEncontrado;
        for(int i=0; i<input.length;i++){
            valEncontrado=input[i];
            posEncontrado = Arrays.binarySearch(auxiliar, valEncontrado);
            auxiliar[posEncontrado] = 1;
            OptionalLong n = Arrays.stream(auxiliar).reduce((a,b)-> a*b);
            auxiliar[posEncontrado] = valEncontrado;
            resultado[i]=n.getAsLong();
        }
        return resultado;
    }
                    
    }
    
}
