package org.CCristian.Archivos.Ejemplos;

import org.CCristian.Archivos.Ejemplos.Servicio.Archivo_Servicio;

import java.io.File;

public class Ejemplo_CrearArchivo {
    public static void main(String[] args) {

        String nombreArchivo = "C:\\Users\\criss\\Desktop\\carpeta\\Java.txt";
        /*Ruta\\Carpeta\\Nombre del archivo*/

        Archivo_Servicio servicio = new Archivo_Servicio();

        servicio.crearArchivo(nombreArchivo);

    }
}
