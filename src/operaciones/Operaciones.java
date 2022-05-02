/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operaciones;

/**
 *
 * @author ervin
 */
import java.util.ArrayList;
import java.util.HashSet;


public class Operaciones {
private  ArrayList <String> arrayList;
private  HashSet<String>conjunto;
private  String[] arreglo;
private int pos;
 
 public Operaciones () {
 
     arrayList= new ArrayList <>();
     conjunto = new HashSet<>();
     arreglo= new String[100];
     pos=0;
    
 }
 
 
 /*metdo ingresar datos va a resivir un valor*/
  
 public String IngresarDato(String valor, String tipoColeccion) {
   String mensajeSalida= "";
   
    
   switch(tipoColeccion)
   {   
       case "ArrayList" : 
           arrayList.add(valor);
           mensajeSalida= "se adicíono en ArrayList con exito";
           break;
         
       
       case "Set" : 
           conjunto.add(valor);
           mensajeSalida= "se adicíono en conjunto con exito";
           break;
         
          
       case "Arreglo" : 
           arreglo[pos]=valor; 
           pos++; /*a la posicionos= pos asignele lo que traia pos +1*/
           mensajeSalida= "se adicíono en arreglo estatico con exito";
           break;
           
       default : mensajeSalida= "no se pudo adiconar el elemento porque no se selecciono una extructura inexistente";
         
   }
   return mensajeSalida;
 }
 
 public String MostrarDato(String tipo){
  String datoMostrar = "";
  switch(tipo)
   {   
       case "ArrayList" :
           datoMostrar= "Los datos que estan en el ArrayList son:\n";
            for (int i=0;i< arrayList.size(); i++ )
        {
          datoMostrar+= arrayList.get(i)+"\n";
        }
        break;
         
       
       case "Set" : 
            datoMostrar= "Los datos que estan en el conjunto son:\n";
            for (String elemento : conjunto)
        {
          datoMostrar+= elemento+"\n";
        }
           
        break;
         
          
       case "Arreglo" : 
      for (int i=0;i< arreglo.length;i++) {
          
          datoMostrar += arreglo[i] +"\n";
      }
           break;
         default : datoMostrar= "no se pudo mostrar el elemento porque no se selecciono una extructura inexistente";
   }
  
  return datoMostrar;  
 }

 }
 

