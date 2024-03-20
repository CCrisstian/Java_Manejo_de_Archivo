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

<h2 align="center">'BufferedWriter'</h2>
<p><b>BufferedWriter</b> en Java es una clase que se utiliza para escribir texto en un flujo de salida de caracteres de forma eficiente, es decir, es capaz de escribir grandes cantidades de datos de forma rápida en un archivo. Esta clase es una subclase de <b>Writer</b> y proporciona un búfer interno que acumula los datos antes de escribirlos en el archivo subyacente. Al utilizar un búfer interno, <b>BufferedWriter</b> reduce el número de accesos al sistema de archivos, lo que mejora el rendimiento de la escritura.</p>

Métodos de la clase `BufferedWriter`:
-  `close()`: Cierra el flujo de salida y libera los recursos asociados.
-  `append(char c)`: Agrega un solo carácter al flujo de salida.
-  `append(CharSequence csq)`: Agrega una secuencia de caracteres al flujo de salida.
-  `append(CharSequence csq, int start, int end)`: Agrega una porción de una secuencia de caracteres al flujo de salida, comenzando desde el índice `start` hasta `end`.
-  `flush()`: Limpia cualquier `búfer` de salida, asegurando que los datos pendientes se escriban en el flujo de salida.
-  `newLine()`: Escribe una nueva línea en el flujo de salida.
-  `write(int c)`: Escribe un solo carácter en el flujo de salida.
-  `write(String s, int off, int len)`: Escribe una porción de una cadena de caracteres en el flujo de salida, comenzando desde el índice off hasta `off `+ `len`.
-  `write(char[] cbuf, int off, int len)`: Escribe una porción de un arreglo de caracteres en el flujo de salida, comenzando desde el índice off hasta `off `+ `len`.
-  `write(String str)`: Escribe una cadena de caracteres completa en el flujo de salida.
-  `write(char[] cbuf)`: Escribe un arreglo completo de caracteres en el flujo de salida.
-  `equals(Object obj)`: Compara este objeto `BufferedWriter` con otro objeto para verificar si son iguales.
-  `hashCode()`: Devuelve el código hash del objeto `BufferedWriter`.
-  `toString()`: Devuelve una representación en cadena del objeto `BufferedWriter`.

<h2 align="center">'PrintWriter'</h2>
<p>La clase <b>PrintWriter</b> en Java es una subclase de Writer que proporciona métodos convenientes para escribir representaciones de varios tipos de datos en un flujo de caracteres. Es especialmente útil para la escritura de texto formateado en archivos y otras salidas de texto, como la consola o sockets de red.</p>

Métodos de la clase `PrintWriter`:
-  `printn(int x)`: Escribe el valor entero `x` en el flujo de salida sin agregar un salto de línea al final.
-  `print(boolean b)`: Escribe el valor booleano `b` en el flujo de salida.
-  `println(char x)`: Escribe el carácter `x` en el flujo de salida, seguido de un salto de línea.
-  `println(float x)`: Escribe el valor de punto flotante `x` en el flujo de salida, seguido de un salto de línea.
-  `printin(Long x)`: Escribe el valor largo `x` en el flujo de salida.
-  `print(char c)`: Escribe el carácter `c` en el flujo de salida.
-  `print(int i)`: Escribe el valor entero `i` en el flujo de salida.
-  `print(long L)`: Escribe el valor largo `L` en el flujo de salida.
-  `print(float f)`: Escribe el valor de punto flotante `f` en el flujo de salida.
-  `print(double d)`: Escribe el valor de punto flotante de doble precisión `d` en el flujo de salida.
-  `print(char[] s)`: Escribe el arreglo de caracteres `s` en el flujo de salida.
-  `print(String s)`: Escribe la cadena de caracteres `s` en el flujo de salida.
-  `print(Object obj)`: Escribe la representación de cadena del objeto `obj` en el flujo de salida.
-  `println(char[] x)`: Escribe el arreglo de caracteres `x` en el flujo de salida, seguido de un salto de línea.
-  `println(double x)`: Escribe el valor de punto flotante de doble precisión `x` en el flujo de salida, seguido de un salto de línea.
-  `println(Object x)`: Escribe la representación de cadena del objeto `x` en el flujo de salida, seguido de un salto de línea.
-  `println(String x)`: Escribe la cadena de caracteres `x` en el flujo de salida, seguido de un salto de línea.
-  `println(boolean x)`: Escribe el valor booleano `x` en el flujo de salida, seguido de un salto de línea.
-  `append(char c)`: Agrega un solo carácter al flujo de salida.
-  `append(CharSequence csq)`: Agrega una secuencia de caracteres al flujo de salida.
-  `append(CharSequence csq, int start, int end)`: Agrega una porción de una secuencia de caracteres al flujo de salida, comenzando desde el índice `start` hasta `end`.
-  `checkError()`: Verifica si se ha producido algún error en el flujo de salida.
-  `close()`: Cierra el flujo de salida.
-  `flush()`: Limpia cualquier búfer de salida, asegurando que los datos pendientes se escriban en el flujo de salida.
-  `format(String format, Object ... args)`: Formatea una cadena utilizando una especificación de formato y escribe el resultado en el flujo de salida.
-  `format(Locale l, String format, Object ... args)`: Formatea una cadena utilizando una especificación de formato y escribe el resultado en el flujo de salida utilizando la configuración regional especificada.
-  `printf(String format, Object ... args)`: Es un método conveniente que es equivalente a `format(String, Object ...)`. 
-  `printf(Locale l, String format, Object ... args)`: Es un método conveniente que es equivalente a `format(Locale, String, Object ...)`. 
-  `println()`: Escribe un salto de línea en el flujo de salida.
-  `write(int c)`: Escribe un solo carácter en el flujo de salida.
-  `write(String s)`: Escribe una cadena de caracteres en el flujo de salida.
-  `write(char[] buf)`: Escribe un arreglo de caracteres en el flujo de salida.
-  `write(String s, int off, int len)`: Escribe una porción de una cadena de caracteres en el flujo de salida, comenzando desde el índice `off` hasta `off + len`.
-  `write(char[] buf, int off, int len)`: Escribe una porción de un arreglo de caracteres en el flujo de salida, comenzando desde el índice `off` hasta `off + len`.
-  `equals(Object obj)`: Compara este objeto `PrintWriter` con otro objeto para verificar si son iguales.
-  `hashCode()`: Devuelve el código hash del objeto `PrintWriter`.
-  `toString()`: Devuelve una representación en cadena del objeto `PrintWriter`.

<h2 align="center">'FileReader'</h2>
<p>La clase <b>FileReader</b> en Java se utiliza para leer caracteres de un archivo de texto. Esta clase es una subclase de <b>InputStreamReader</b>, que a su vez es una subclase de <b>Reader</b>. <b>FileReader</b> es especialmente útil cuando se necesita leer datos de un archivo de texto de manera eficiente y sencilla.</p>

Métodos de la clase `FileReader`:
-  `close()`: Cierra el flujo de entrada y libera los recursos asociados.
-  `getEncoding()`: Devuelve la codificación de caracteres utilizada por este `FileReader`.
-  `mark(int readAheadLimit)`: Marca la posición actual en el flujo de entrada. Permite regresar a esta posición después de haber leído un número limitado de caracteres.
-  `read()`: Lee un solo carácter de la fuente de entrada y devuelve su valor como un entero. Si llega al final del flujo de entrada, devuelve -1.
-  `read(char[] cbuf)`: Lee caracteres del flujo de entrada y los coloca en el arreglo de caracteres `cbuf`. Devuelve el número de caracteres leídos o -1 si se alcanza el final del flujo de entrada.
-  `markSupported()`: Indica si este `FileReader` admite el marcado del flujo de entrada.
-  `read(CharBuffer target)`: Lee caracteres y los coloca en el buffer `CharBuffer`. Devuelve el número de caracteres leídos o -1 si se alcanza el final del flujo de entrada.
-  `read(char[] cbuf, int off, int len)`: Lee caracteres del flujo de entrada y los coloca en el arreglo de caracteres `cbuf`, comenzando en el índice `off` y leyendo hasta `len` caracteres. Devuelve el número de caracteres leídos o -1 si se alcanza el final del flujo de entrada.
-  `ready()`: Comprueba si hay caracteres disponibles para ser leídos sin bloquear.
-  `reset()`: Restablece el flujo de entrada al estado marcado previamente por `mark()`.
-  `skip(long n)`: Omite `n` caracteres en el flujo de entrada y devuelve el número de caracteres realmente omitidos.
-  `transferTo(Writer out)`: Transfiere todos los caracteres restantes en el flujo de entrada al `Writer` especificado.
-  `equals(Object obj)`: Compara este objeto `FileReader` con otro objeto para verificar si son iguales.
-  `hashCode()`: Devuelve el código hash del objeto `FileReader`.
-  `toString()`: Devuelve una representación en cadena del objeto `FileReader`.

<h2 align="center">'BufferedReader'</h2>
<p>La clase <b>BufferedReader</b> en Java se utiliza para leer texto de una fuente de entrada de caracteres, como un archivo, un <b>InputStreamReader</b>, o cualquier otro objeto que implemente la interfaz <b>Reader.</b> Proporciona un búfer interno que mejora el rendimiento de la lectura al minimizar el número de accesos al sistema de archivos o la red.</p>

Métodos de  `BufferedReader`:
-  `close()`: Cierra el flujo de entrada y libera los recursos asociados.
-  `lines()`: Devuelve un flujo (`Stream`) de líneas del texto leído por este `BufferedReader`.
-  `mark(int readAheadLimit)`: Marca la posición actual en el flujo de entrada. Permite regresar a esta posición después de haber leído un número limitado de caracteres.
-  `read()`: Lee un solo carácter de la fuente de entrada y devuelve su valor como un entero. Si llega al final del flujo de entrada, devuelve -1.
-  `read(char[] cbuf, int off, int len)`: Lee caracteres en un arreglo de caracteres `cbuf`, comenzando en el índice `off` y leyendo hasta `len` caracteres. Devuelve el número de caracteres leídos o -1 si se alcanza el final del flujo de entrada.
-  `markSupported()`: Indica si este `BufferedReader` admite el marcado del flujo de entrada.
-  `readLine()`: Lee una línea completa de texto del flujo de entrada y la devuelve como una cadena. Devuelve `null` si se alcanza el final del flujo de entrada.
-  `read(CharBuffer target)`: Lee caracteres en un buffer `CharBuffer`. Devuelve el número de caracteres leídos o -1 si se alcanza el final del flujo de entrada.
-  `read(char[] cbuf)`: Lee caracteres en un arreglo de caracteres `cbuf`. Devuelve el número de caracteres leídos o -1 si se alcanza el final del flujo de entrada.
-  `ready()`: Comprueba si hay caracteres disponibles para ser leídos sin bloquear.
-  `reset()`: Restablece el flujo de entrada al estado marcado previamente por `mark()`.
-  `skip(long n)`: Omite `n` caracteres en el flujo de entrada y devuelve el número de caracteres realmente omitidos.
-  `transferTo(Writer out)`: Transfiere todos los caracteres restantes en el flujo de entrada al `Writer` especificado.
-  `equals(Object obj)`: Compara este objeto `BufferedReader` con otro objeto para verificar si son iguales.
-  `hashCode()`: Devuelve el código hash del objeto `BufferedReader`.
-  `toString()`: Devuelve una representación en cadena del objeto `BufferedReader`.

<h2 align="cenet">'Scanner'</h2>
<p>La clase <b>Scanner</b> en Java se utiliza para analizar tipos primitivos y cadenas de caracteres desde diversas fuentes de entrada, como archivos, cadenas de texto, o flujos de entrada (InputStream). Proporciona métodos simples y convenientes para leer y analizar datos en un formato específico.</p>

Métodos de la clase `Scanner`:
-  `hasNext()`: Verifica si hay más elementos disponibles para ser leídos.
-  `hasNext(String pattern)`: Verifica si hay más elementos disponibles para ser leídos que coincidan con el patrón especificado.
-  `hasNext(Pattern pattern)`: Verifica si hay más elementos disponibles para ser leídos que coincidan con el patrón de expresión regular especificado.
-  `close()`: Cierra el `Scanner`.
-  `toString()`: Devuelve una representación en cadena del `Scanner`.
-  `delimiter()`: Devuelve el delimitador actual utilizado por el `Scanner`.
-  `findAll(Pattern pattern)`: Encuentra todas las ocurrencias de la expresión regular especificada en la entrada actual.
-  `findAll(String patString)`: Encuentra todas las ocurrencias de la cadena de patrón especificada en la entrada actual.
-  `findInLine(String pattern)`: Encuentra la próxima ocurrencia de la expresión regular especificada en la misma línea que la posición actual del `Scanner`.
-  `findInLine(Pattern pattern)`: Encuentra la próxima ocurrencia de la expresión regular especificada en la misma línea que la posición actual del `Scanner`.
-  `findWithinHorizon(String pattern, int horizon)`: Encuentra la próxima ocurrencia de la expresión regular especificada dentro del horizonte de búsqueda especificado.
-  `findWithinHorizon(Pattern pattern, int horizon)`: Encuentra la próxima ocurrencia de la expresión regular especificada dentro del horizonte de búsqueda especificado.
-  `hasNextBigDecimal()`: Verifica si hay más tokens de tipo `BigDecimal` disponibles para ser leídos.
-  `hasNextBigInteger()`: Verifica si hay más tokens de tipo `BigInteger` disponibles para ser leídos.
-  `hasNextBigInteger(int radix)`: Verifica si hay más tokens de tipo `BigInteger` con la base especificada disponibles para ser leídos.
-  `hasNextBoolean()`: Verifica si hay más tokens de tipo `Boolean` disponibles para ser leídos.
-  `hasNextByte()`: Verifica si hay más tokens de tipo `Byte` disponibles para ser leídos.
-  `hasNextByte(int radix)`: Verifica si hay más tokens de tipo `Byte` con la base especificada disponibles para ser leídos.
-  `hasNextDouble()`: Verifica si hay más tokens de tipo `Double` disponibles para ser leídos.
-  `hasNextFloat()`: Verifica si hay más tokens de tipo `Float` disponibles para ser leídos.
-  `hasNextInt()`: Verifica si hay más tokens de tipo `Integer` disponibles para ser leídos.
-  `hasNextInt(int radix)`: Verifica si hay más tokens de tipo `Integer` con la base especificada disponibles para ser leídos.
-  `hasNextLine()`: Verifica si hay más líneas disponibles para ser leídas.
-  `hasNextLong()`: Verifica si hay más tokens de tipo `Long` disponibles para ser leídos.
-  `hasNextLong(int radix)`: Verifica si hay más tokens de tipo `Long` con la base especificada disponibles para ser leídos.
-  `hasNextShort()`: Verifica si hay más tokens de tipo `Short` disponibles para ser leídos.
-  `hasNextShort(int radix)`: Verifica si hay más tokens de tipo `Short` con la base especificada disponibles para ser leídos.
-  `ioException()`: Devuelve la excepción de E/S si ocurrió durante la operación de entrada.
-  `Locale()`: Devuelve el `Locale` utilizado por el `Scanner`.
-  `match()`: Devuelve el patrón de la última operación de búsqueda, compilado como una expresión regular.
-  `next()`: Lee el próximo token de la entrada.
-  `next(String pattern)`: Lee el próximo token que coincida con el patrón especificado.
-  `next(Pattern pattern)`: Lee el próximo token que coincida con el patrón de expresión regular especificado.
-  `nextBigDecimal()`: Lee el próximo token como un `BigDecimal`.
-  `nextBigInteger()`: Lee el próximo token como un `BigInteger`.
-  `nextBigInteger(int radix)`: Lee el próximo token como un `BigInteger` con la base especificada.
-  `nextBoolean()`: Lee el próximo token como un `Boolean`.
-  `nextByte()`: Lee el próximo token como un `Byte`.
-  `nextByte(int radix)`: Lee el próximo token como un `Byte` con la base especificada.
-  `nextDouble()`: Lee el próximo token como un `Double`.
-  `nextFloat()`: Lee el próximo token como un `Float`.
-  `nextInt()`: Lee el próximo token como un `Integer`.
-  `nextInt(int radix)`: Lee el próximo token como un `Integer` con la base especificada.
-  `nextLine()`: Lee la próxima línea de la entrada.
-  `nextLong()`: Lee el próximo token como un `Long`.
-  `nextLong(int radix)`: Lee el próximo token como un `Long` con la base especificada.
-  `nextShort()`: Lee el próximo token como un `Short`.
-  `nextShort(int radix)`: Lee el próximo token como un `Short` con la base especificada.
-  `radix()`: Devuelve la base numérica utilizada por el `Scanner`.
-  `remove()`: Elimina el último token leído.
-  `reset()`: Restablece el `Scanner` a un estado inicial sin tokens.
-  `skip(String pattern)`: Omite cualquier token que coincida con el patrón especificado.
-  `skip(Pattern pattern)`: Omite cualquier token que coincida con el patrón de expresión regular especificado.
-  `tokens()`: Devuelve una representación del `Scanner` como un flujo de tokens.
-  `useDelimiter(String pattern)`: Establece el delimitador de tokens como la expresión regular especificada.
-  `useDelimiter(Pattern pattern)`: Establece el delimitador de tokens como el patrón de expresión regular especificado.
-  `useLocale(Locale locale)`: Establece el `Locale` del `Scanner`.
-  `useRadix(int radix)`: Establece la base numérica para la lectura de enteros.
-  `forEachRemaining(Consumer <? super String> action)`: Procesa los tokens restantes, uno por uno, utilizando la operación especificada.
-  `equals(Object obj)`: Compara este objeto `Scanner` con otro objeto para verificar si son iguales.
-  `hashCode()`: Devuelve el código hash del `Scanner`.
