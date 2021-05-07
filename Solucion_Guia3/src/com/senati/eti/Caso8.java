package com.senati.eti;

import java.util.Scanner;

public class Caso8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		
		int n = 0;
        
        while (n<1 || n>30) {
    		System.out.print("Ingrese numero [1-30]...:");
            n = sc.nextInt();
            if(n<1 || n >30) 
               System.out.println("Numero fuera de rango.. SOLO INGRESE [1-30]");
               
        }
        
        System.out.println("Tabla de Mutiplicar" + n);
        System.out.println("---------");
        
        for (int i = 1; i <=15; i++)
        	System.out.println(n + "x" + i + "=" + (n*i));
        System.out.println("-------------");   
          
   
                  
        
        
	}

}