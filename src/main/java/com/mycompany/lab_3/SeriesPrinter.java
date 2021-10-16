
package com.mycompany.lab_3;

public class SeriesPrinter {
    void printSeries(int n){
        
        System.out.print("printSeries-> ");
        for(int i=0;i<=n;i++){
            
            System.out.print(" "+i);
        }
       
    }
    void printSeries(int startIndex, int endIndex){
        System.out.println(" ");
        System.out.print("printSeries-> ");
        for(int i=startIndex;i<=endIndex;i++){
            System.out.print(" "+i);
        }
    }
    void printSeries(int startIndex, int endIndex, int interval){
        System.out.println(" ");
        System.out.print("printSeries-> ");
        for(int i=startIndex;i<=endIndex;i+=interval){

            System.out.print(" "+i);
        }
    }
}
