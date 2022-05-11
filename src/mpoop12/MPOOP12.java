/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mpoop12;

//UNA VEZ QUE HAGAS EL DESARROLLO BORRAS LOS COMENTARIOS 
import java.awt.SystemColor;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.w3c.dom.ls.LSOutput;

/**
 *
 * @author Duque Rafael
 */
public class MPOOP12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File archivo = new File ("archivo.txt");// creamos objeto archivo que apunta a archivo.txt
        System.out.println(archivo.exists());
        try {
            boolean secCreo = archivo.createNewFile(); //agrega el archivo 
            System.out.println("Se creó="+secCreo); //SE PREGUNTA SI SE CREÓ EL ARCHIVO
            System.out.println(archivo.exists());
        } catch (IOException ex) {
            Logger.getLogger(MPOOP12.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        // Comparamos File Write y File Reader con archivo .txt y luego con archivo .csv
        System.out.println("#######FileWrite#####");//
        try { 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));//del teclado hacemos una lectura de caracteres que pasa por un buffer
        System.out.println("Escriba el texto para el archivo");
        String texto = br.readLine(); // guardamos lo que escribimos en el texto para imprimirlo 
        
        FileWriter fw =new FileWriter("fw.csv");// Si existe lo apunta sino existe lo crea y lo apunta
        BufferedWriter bw = new BufferedWriter (fw);
        PrintWriter salida = new PrintWriter (bw);
        salida.println (texto);// PODEMOS VER EL TEXTO QUE ESCRIBIMOS EN LA CARPETA DEL PROYECTO EN EL ARCHIVO FW
        for (int i = 0; i < 10; i++) {
            salida.println("linea del for"+i);
        }
        for (int i = 0; i < 10; i++) {
            salida.println("Rafael,Duque,Araujo,317313239,21");
        }
        
        salida.close();//CIERRA EL ARCHIVO DE TEXTO
        
        
        
        } catch (IOException ex) {
            Logger.getLogger(MPOOP12.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println("#######FilerReader#####");//
        try {
       
        FileReader fr = new FileReader ("fw.csv"); //cambiamos de archivo txt s csv 
        BufferedReader br = new BufferedReader(fr);
        System.out.println("El texto del archivo es");
        String linea = br.readLine();
        while (linea!=null) {                
            System.out.println(linea);
            linea = br.readLine();
        }
        
        br.close();
               
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MPOOP12.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(MPOOP12.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println("#######StringTokenizer#####");
        System.out.println("#######Actividad Extra#####");
          
        String linea = "Rafael,Duque,Araujo,317313239,21"; // para separar las comas y representar 
        Alumno alumno = new Alumno();
        float temp =0;
        String textoTemporal;
        StringTokenizer tokenizador = new StringTokenizer(linea,",");// usamos un tokenizador y la separamos por cada coma que se encuentre
        while (tokenizador.hasMoreTokens())  {
            textoTemporal = tokenizador.nextToken();// tokenizamos el platillo (nombre,precioe ingredientes)
            if(temp==0) //tokeniza el nombre
                alumno.setNombre(textoTemporal);
            else if(temp ==1)//tokeniza apellido paterno
                alumno.setApPaterno(textoTemporal);
            else if (temp ==2) // tokeniza apellido materno 
                alumno.setApMaterno(textoTemporal);
            else if(temp ==3)//tokeniza num Cuenta
                alumno.setNumCuenta(Integer.parseInt(textoTemporal));
            else if (temp ==4) // tokeniza edad
                alumno.setEdad(Integer.parseInt(textoTemporal));
            
            System.out.println(textoTemporal);
            temp++;
        } 
     
    }    
    
}
