package org.CCristian.Archivos.Ejemplos;

import org.CCristian.Archivos.Ejemplos.Servicio.Archivo_Servicio;

public class Ejemplo_LeerArchivo {
    public static void main(String[] args) {

        Archivo_Servicio servicio = new Archivo_Servicio();

        System.out.println(servicio.leerArchivo_2("C:\\Users\\criss\\Desktop\\carpeta\\Java.txt"));
    }
}
