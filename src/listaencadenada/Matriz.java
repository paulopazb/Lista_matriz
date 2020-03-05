/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaencadenada;

/**
 *
 * @author Paulo Paz
 */

public class Matriz {
	private int fila;
	private int columna;
        private int[][] m;
        
    public Matriz(){
           m = new int[100][100];
           fila = 0;
	   columna = 0;
        }

public void setElem(int x, int f, int c)
{
    m[f][c]=x;
}

public int getElem(int f,int c)
{
    return m[f][c];
}
        
public void setFila(int f)
{
    fila=f;
}

public int getFila()
{
    return fila;
}

public void setColumna(int c)
{
  columna=c;
}

public int getColumna()
{
 return columna;
}

public int sumaeElementos()
{
    int mayor=0;
    for(int i=0; i<getFila();i++)
    {
       for(int j=0;j<getColumna();j++)
       {
           if(m[i][j]>mayor)
           {
             mayor= m[i][j];
           }
       }
     
    }
      return mayor;
}




      
       
        
     
    
}
