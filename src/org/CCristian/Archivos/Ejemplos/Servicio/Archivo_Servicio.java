package org.CCristian.Archivos.Ejemplos.Servicio;

import java.io.*;
import java.util.Scanner;

public class Archivo_Servicio {

/*-------------------MÉTODOS-------------------*/
    public void crearArchivo(String nombre){
        File archivo = new File(nombre);
        try (BufferedWriter buffer = new BufferedWriter(new FileWriter(archivo, true))){
            /*append:true ---> permite agregar mas contenido*/
            buffer.append("Hola qye tal amigos!")
                    .append("¿Todo bien? yo acá escribiendo un archivo...")
                    .append("Hasta luego Lucas!");
            System.out.println("El archivo se ha creado con éxito");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void crearArchivo_2(String nombre){
        File archivo = new File(nombre);
        try (PrintWriter printWriter = new PrintWriter(new FileWriter(archivo, true))){
            /*append:true ---> permite agregar mas contenido*/
            printWriter.println("Hola qye tal amigos!");
            printWriter.println("¿Todo bien? yo acá escribiendo un archivo...");
            printWriter.printf("Hasta luego %s!", "Lucas");
            System.out.println("El archivo se ha creado con éxito");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public String leerArchivo(String nombre){
        StringBuilder sB = new StringBuilder();
        File archivo = new File(nombre);
        try (BufferedReader reader = new BufferedReader(new FileReader(archivo))){
            String linea;
            while ((linea = reader.readLine()) != null){
                sB.append(linea).append("\n");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return sB.toString();
    }

    public String leerArchivo_2(String nombre){
        StringBuilder sB = new StringBuilder();
        File archivo = new File(nombre);
        try (Scanner scanner = new Scanner(archivo)){
            scanner.useDelimiter("\n");
            while (scanner.hasNext()){
                sB.append(scanner.next()).append("\n");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return sB.toString();
    }
}


