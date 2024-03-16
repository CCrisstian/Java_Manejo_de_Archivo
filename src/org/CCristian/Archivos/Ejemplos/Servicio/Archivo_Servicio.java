package org.CCristian.Archivos.Ejemplos.Servicio;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Archivo_Servicio {

/*-------------------MÉTODOS-------------------*/
    public void crearArchivo(String nombre){
        File archivo = new File(nombre);
        try {
            FileWriter escritor = new FileWriter(archivo, true);
                /*append:true ---> permite agregar mas contenido*/
            escritor.append("Hola qye tal amigos!\n")
                    .append("¿Todo bien? yo acá escribiendo un archivo...\n")
                    .append("Hasta luego Lucas!\n");
            escritor.close();
            System.out.println("El archivo se ha creado con éxito");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}


