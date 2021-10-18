# Definicion de una colección en Java y qué es el "Java CollectionFramework" #   
### **¿Que es una colección en Java?** 
Las colecciones en java son almacenes únicamente de objetos. Anteriormente, en este lenguaje de programación, hemos visto los arrays o las matrices. En ellos, no solo podíamos almacenar objetos, sino también datos primitivos.

La diferencia fundamental entre las colecciones y los arrays, es que, mientras que los arrays tienen un tamaño fijo, las colecciones en java son totalmente dinámicas. Esto quiere decir que, podrán crecer o disminuir según nuestras necesidades.

### **¿Qué es el "Java Collection Framework"?**
Java Collection Framework es como se conoce a la librería de clases contenedoras de Java que podemos encontrar en el paquete estándar java.util. Estas clases sirven para almacenar colecciones de objetos, como listas, conjuntos, mapas, …En Java podemos trabajar con clases genéricas, para ello se utiliza <y >. A este mecanismo se le conoce como genericidad.

Todas estas clases permiten guardar en ellas referencias a objetos (no podemos usarlas a priori con tipos primitivos como int o double). Por ejemplo:

Hay tres tipos de colecciones, cada uno con un interfaz común y diferentes implementaciones. Las diferentes implementaciones de un mismo interfaz realizan la misma tarea aunque la diferencia está en que unas implementaciones son más rápidas en algunas operaciones y más lentas en otras:

* **Conjunto** – los elementos no tienen un orden y no se permiten duplicados.Se define el interfaz Set<E>. Podemos utilizar las siguientes implementaciones:  HashSet<E> (implementación con tabla hash), LinkedHashSet<E> (tabla hash +doble lista enlazada), TreeSet<E> (implementación con árbol)

* **Listas** – estructura secuencial, donde cada elemento tiene un índice o posición. Se utiliza el interfaz List<E>. Podemos utilizar las siguientes implementaciones: ArrayList<E> (acceso rápido), LinkedList<E>(inserciones/borrado rápidas), Stack<E> (pila), Vector<E> (obsoleto)

* **Diccionario o Matriz asociativa** – cada elemento tiene asociado una clave que usaremos para recuperarlo.  Se utiliza el interfaz Map<K,V>. Podemos utilizar las siguientes implementaciones: HashMap<K,V>, TreeMap<K,V>, LinkedHashMap<K,V>

Nombre | Descripcion |Implementaciones| Codigo en java
------------ | -------------|------------ |------------ |
Set |La interfaz Set define una colección que no puede      contener elementos duplicados. Esta interfaz contiene, únicamente, los métodos heredados de Collection añadiendo la restricción de que los elementos duplicados están prohibidos. Es importante destacar que, para comprobar si los elementos son elementos duplicados o no lo son, es necesario que dichos elementos tengan implementada, de forma correcta, los métodos equals y hashCode. Para comprobar si dos Set son iguales, se comprobarán si todos los elementos que los componen son iguales sin importar en el orden que ocupen dichos elementos. |HashSet: este implementación almacena los elementos en una tabla hash. Es la implementación con mejor rendimiento de todas pero no garantiza ningún orden a la hora de realizar iteraciones. Es la implementación más empleada debido a su rendimiento y a que, generalmente, no nos importa el orden que ocupen los elementos. Esta implementación proporciona tiempos constantes en las operaciones básicas siempre y cuando la función hash disperse de forma correcta los elementos dentro de la tabla hash. Es importante definir el tamaño inicial de la tabla ya que este tamaño marcará el rendimiento de esta implementación.<br/><br/>TreeSet: esta implementación almacena los elementos ordenándolos en función de sus valores. Es bastante más lento que HashSet. Los elementos almacenados deben implementar la interfaz Comparable. Esta implementación garantiza, siempre, un rendimiento de log(N) en las operaciones básicas, debido a la estructura de árbol empleada para almacenar los elementos.<br/><br/>LinkedHashSet: esta implementación almacena los elementos en función del orden de inserción. Es, simplemente, un poco más costosa que HashSet.|HashSet < String > hashSet = new HashSet< String >();<br/><br/>  SortedSet< Persona > cjssp = new TreeSet< Persona >();<br/><br/>LinkedHashSet < E > hs = nuevo LinkedHashSet < E > ();
List | La interfaz List define una sucesión de elementos. A diferencia de la interfaz Set, la interfaz List sí admite elementos duplicados | ArrayList: esta es la implementación típica. Se basa en un array redimensionable que aumenta su tamaño según crece la colección de elementos. Es la que mejor rendimiento tiene sobre la mayoría de situaciones.<br/><br/>LinkedList: esta implementación permite que mejore el rendimiento en ciertas ocasiones. Esta implementación se basa en una lista doblemente enlazada de los elementos, teniendo cada uno de los elementos un puntero al anterior y al siguiente elemento.| ArrayList< String > cars = new ArrayList< String >(); <br/><br/>LinkedList< String > ll= new LinkedList< String >();
Map|La interfaz Map asocia claves a valores. Esta interfaz no puede contener claves duplicadas y; cada una de dichas claves, sólo puede tener asociado un valor como máximo.|HashMap: este implementación almacena las claves en una tabla hash. Es la implementación con mejor rendimiento de todas pero no garantiza ningún orden a la hora de realizar iteraciones. Esta implementación proporciona tiempos constantes en las operaciones básicas siempre y cuando la función hash disperse de forma correcta los elementos dentro de la tabla hash. Es importante definir el tamaño inicial de la tabla ya que este tamaño marcará el rendimiento de esta implementación.<br/><br/>TreeMap: esta implementación almacena las claves ordenándolas en función de sus valores. Es bastante más lento que HashMap. Las claves almacenadas deben implementar la interfaz Comparable. Esta implementación garantiza, siempre, un rendimiento de log(N) en las operaciones básicas, debido a la estructura de árbol empleada para almacenar los elementos.<br/><br/>LinkedHashMap: esta implementación almacena las claves en función del orden de inserción. Es, simplemente, un poco más costosa que HashMap.|final Map<Integer, List> hashMap = new HashMap<Integer, List>();<br/><br/>final Map<Integer, List> treeMap = new TreeMap<Integer, List>();<br/><br/>final Map<Integer, List> linkedHashMap = new LinkedHashMap<Integer, List>();