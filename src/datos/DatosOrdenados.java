/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

/**
 *
 * @author Noemí Lara Acono
 */
public class DatosOrdenados {
    private int [] valores; 

    public DatosOrdenados(int[] valores) {
        this.valores = valores;
    }
    
    public int getSize(){
        return valores.length; 
    }
    
    //método búsqueda secuencial
    public int busquedaSecuencial(int clave) {
        System.out.print("i=");
        for(int i=0; i<valores.length && valores[i]>=clave; i++) {
            if(clave==valores[i] ){
                return i;
            }
            System.out.print(" "+i);
        }
        return -1;
    }
    
    //método búsqueda binaria
    public int búsquedaBinaria(int clave) {
        int bajo=0;
        int alto=valores.length-1;
        int central=(bajo+alto)/2;
        int i=0; 
        System.out.println("i = " );
        while(bajo<alto&&clave!=valores[central]) {
            if(clave<valores[central]) {
                alto=central-1;
            } else {
                bajo=central+1;
            }
            central=(bajo+alto)/2;
        }
        if(clave==valores[central]) {
            return central;
        }
        return -1;
    }
    
    public int getMinimo() {
        return valores[0];
    }
    
    public int getMaximo() {
        int m=valores.length-1;
        return valores[m];
    }
    
    @Override
    public String toString(){
        String cad = "Datos ORDENADOS: ";
        for (int x : valores){
            cad += x + ", ";
        }
        return cad;
    }
    
}