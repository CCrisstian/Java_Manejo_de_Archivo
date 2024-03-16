<h1 align="center">Manejo de Archivo</h1>
<p>En Java, la clase <b>'File'</b> se encuentra en el paquete java.io y proporciona una interfaz para interactuar con los archivos y directorios en el sistema de archivos de la computadora. Esta clase permite crear, eliminar, renombrar, verificar la existencia y recuperar información sobre archivos y directorios.</p>

Métodos de la clase `File`:
-  `canExecute()`: Verifica si el archivo puede ejecutarse.
-  `canRead()`: Verifica si el archivo puede leerse.
-  `canWrite()`: Verifica si el archivo puede escribirse.
-  `compareTo(File pathname)`: Compara la ruta de este archivo con la ruta especificada.
-  `delete()`: Borra el archivo.
-  `createNewFile()`: Crea un nuevo archivo en la ruta especificada.
-  `deleteOnExit()`: Programa el archivo para que se borre cuando finalice la aplicación.
-  `equals(Object obj)`: Compara este objeto `File` con otro objeto para verificar si son iguales.
-  `exists()`: Verifica si el archivo existe.
-  `getAbsoluteFile()`: Devuelve una instancia de `File` que representa la ruta absoluta del archivo.
-  `getAbsolutePath()`: Devuelve la ruta absoluta del archivo como una cadena.
-  `getCanonicalPath()`: Devuelve la ruta canónica del archivo como una cadena.
-  `getFreeSpace()`: Devuelve el espacio libre en el sistema de archivos que contiene el archivo.
-  `getName()`: Devuelve el nombre del archivo o directorio representado por este objeto `File`.
-  `getParent()`: Devuelve el nombre del directorio padre como una cadena.
-  `getParentFile()`: Devuelve un objeto `File` que representa el directorio padre del archivo.
-  `getPath()`: Devuelve la ruta del archivo como una cadena.
-  `getTotalSpace()`: Devuelve el tamaño total del sistema de archivos que contiene el archivo.
-  `getUsableSpace()`: Devuelve el espacio disponible en el sistema de archivos que contiene el archivo.
-  `hashCode()`: Devuelve el código hash del objeto `File`.
-  `isAbsolute()`: Verifica si la ruta del archivo es absoluta.
-  `isDirectory()`: Verifica si el objeto `File` representa un directorio.
-  `isFile()`: Verifica si el objeto `File` representa un archivo.
-  `isHidden()`: Verifica si el archivo está oculto.
-  `lastModified()`: Devuelve la última vez que se modificó el archivo, en milisegundos desde el 1 de enero de 1970.
-  `length()`: Devuelve el tamaño del archivo en bytes.
-  `list()`: Devuelve un array de cadenas que representan los nombres de los archivos y directorios en el directorio representado por este objeto `File`.
-  `list(FilenameFilter filter)`: Devuelve un array de cadenas que representan los nombres de los archivos y directorios que pasan el filtro especificado.
-  `listFiles()`: Devuelve un array de objetos `File` que representan los archivos y directorios en el directorio representado por este objeto `File`.
-  `listFiles(FileFilter filter)`: Devuelve un array de objetos `File` que representan los archivos y directorios que pasan el filtro especificado.
-  `listFiles(FilenameFilter filter)`: Devuelve un array de objetos `File` que representan los archivos y directorios cuyos nombres pasan el filtro especificado.
-  `mkdir()`: Crea el directorio representado por este objeto `File`.
-  `mkdirs()`: Crea el directorio representado por este objeto `File`, junto con cualquier directorio padre que sea necesario.
-  `renameTo(File dest)`: Renombra el archivo representado por este objeto `File` al nombre especificado por el objeto `File` de destino.
-  `setExecutable(boolean executable)`: Establece si el archivo es ejecutable.
-  `setExecutable(boolean executable, boolean ownerOnly)`: Establece si el archivo es ejecutable, opcionalmente solo para el propietario.
-  `setLastModified(long time)`: Establece la última vez que se modificó el archivo.
-  `setReadable(boolean readable)`: Establece si el archivo es legible.
-  `setReadable(boolean readable, boolean ownerOnly)`: Establece si el archivo es legible, opcionalmente solo para el propietario.
-  `setReadOnly()`: Establece el archivo como de solo lectura.
-  `setWritable(boolean writable)`: Establece si el archivo es escribible.
-  `setWritable(boolean writable, boolean ownerOnly)`: Establece si el archivo es escribible, opcionalmente solo para el propietario.
-  `toPath()`: Devuelve un objeto `Path` que representa la ruta de este archivo.

<h2 align="center">'FileWriter'</h2>
<p>La clase <b>'FileWriter'</b> en Java, que se encuentra en el paquete java.io, es una subclase de <b>'Writer'</b> y se utiliza para escribir caracteres en un archivo de texto. Esta clase se utiliza principalmente para escribir datos de texto en archivos de texto. <b>'FileWriter'</b> es capaz de escribir caracteres directamente en un archivo, lo que lo hace útil para la escritura de archivos de texto simples.</p>

Métodos de la clase `FileWriter`:
-  `append(char c)`: Añade un solo carácter al final del archivo.
-  `append(CharSequence csq)`: Añade una secuencia de caracteres al final del archivo.
-  `append(CharSequence csq, int start, int end)`: Añade una porción de una secuencia de caracteres al final del archivo, comenzando desde el índice start hasta end.
-  `close()`: Cierra el flujo de escritura, liberando cualquier recurso asociado.
-  `flush()`: Limpia cualquier búfer de salida, asegurando que los datos pendientes se escriban al archivo.
-  `getEncoding()`: Devuelve la codificación de caracteres utilizada para escribir en el archivo.
-  `write(int c)`: Escribe un solo carácter en el archivo.
-  `write(String str)`: Escribe una cadena de caracteres en el archivo.
-  `write(char[] cbuf)`: Escribe un arreglo de caracteres en el archivo.
-  `write(String str, int off, int len)`: Escribe una porción de una cadena de caracteres en el archivo, comenzando desde el índice off hasta off + len.
-  `write(char[] cbuf, int off, int len)`: Escribe una porción de un arreglo de caracteres en el archivo, comenzando desde el índice off hasta off + len.
-  `equals(Object obj)`: Compara este objeto FileWriter con otro objeto para verificar si son iguales.

