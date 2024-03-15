<h1 align="center">Manejo de Archivo</h1>
<p>En Java, la clase <b>'File'</b> se encuentra en el paquete java.io y proporciona una interfaz para interactuar con los archivos y directorios en el sistema de archivos de la computadora. Esta clase permite crear, eliminar, renombrar, verificar la existencia y recuperar información sobre archivos y directorios.</p>

Algunas de las funcionalidades principales de la clase `File`:
-  <b>Creación y manipulación de archivos y directorios:</b>
    -  Crear un objeto `File` que represente un archivo o directorio en el sistema de archivos.
    -  La clase `File` permite crear nuevos archivos y directorios en el sistema de archivos.
    -  También proporciona métodos para eliminar archivos y directorios existentes.
-  <b>Información sobre archivos y directorios:</b>
    -  La clase `File` permite acceder a información sobre archivos y directorios, como su nombre, tamaño, ruta absoluta, etc.
    -  Verificar si un objeto `File` representa un archivo o un directorio.
    -  Se pueden listar los archivos y subdirectorios en un directorio específico.
-  <b>Operaciones en archivos y directorios:</b>
    -  La clase `File` proporciona métodos para realizar operaciones comunes en archivos, como copiar, mover y renombrar.
    -  También ofrece métodos para verificar la existencia de archivos y directorios, así como para verificar si son accesibles para lectura y escritura.

<h2 align="center">'FileWriter'</h2>
<p>La clase <b>'FileWriter'</b> en Java, que se encuentra en el paquete java.io, es una subclase de <b>'Writer'</b> y se utiliza para escribir caracteres en un archivo de texto. Esta clase se utiliza principalmente para escribir datos de texto en archivos de texto. <b>'FileWriter'</b> es capaz de escribir caracteres directamente en un archivo, lo que lo hace útil para la escritura de archivos de texto simples.</p>

Algunas características clave de la clase `FileWriter`:
-    <b>Escritura de caracteres en un archivo:</b>
        -    `FileWriter` proporciona métodos para escribir caracteres en un archivo de texto. Se puede escribir un solo carácter, una cadena de caracteres o un arreglo de caracteres en el archivo.
-    <b>Apertura y cierre automático de archivos:</b>
        -    `FileWriter` se encarga de abrir y cerrar automáticamente el archivo. Esto significa que no se necesita preocuparse por abrir o cerrar explícitamente el archivo, ya que `FileWriter` maneja estas operaciones.
-    <b>Flujo de escritura:</b>
        -    `FileWriter` utiliza un flujo de escritura para escribir caracteres en el archivo. Los caracteres que se escriben se almacenan en un `búfer` interno antes de escribirse físicamente en el archivo. Se puede forzar la escritura del `búfer` en el archivo utilizando el método `flush()`.
-    <b>Codificación de caracteres:</b>
        -    Se puede especificar la codificación de caracteres que se utilizará al escribir en el archivo. Por defecto, se utiliza la codificación del sistema, pero se puede especificar una codificación específica si se lo desea.
-    <b>Manejo de excepciones:</b>
        -    Al trabajar con `FileWriter`, se debe manejar las posibles excepciones que pueden ocurrir durante la escritura en el archivo, como `IOException`. Es importante cerrar correctamente el `FileWriter` después de su uso, preferiblemente utilizando un bloque `try-with-resources` para asegurar su cierre adecuado.
