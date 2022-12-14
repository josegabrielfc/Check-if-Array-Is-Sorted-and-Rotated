# Check-if-Array-Is-Sorted-and-Rotated
https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/
Given an array nums, return true if the array was originally sorted in non-decreasing order, then rotated some number of positions (including zero). Otherwise, return false.

+ Recomendaciones para visualizar:
  - Probar codigos por consola de comando, de lo contrario hacerlo en un ide y modificando algunas cosas (como incluirlo en algun paquete de netBeans, etc)
  - Revisar Codigos Java para mayor claridad en la explicación del desarrollo del metodo
  - Para mas claridad ver el siguiente video: https://youtu.be/IcEna5hkUV4

Archivos de codigo de algoritmo son: 
  - CheckifArrayIsSortedandRotated.java
  - CheckifArrayIsSortedandRotatedFichero.java
  Adicional: El archivo de c++ es un intento de traduccion de lenguaje, de Java a C++, contiene algunos errores en la parte de la sintaxis, pero la estructura y logica es la adecuada.
  
Archivos de fichero:
  - fichero.java    Donde se realiza la creacion de un fichero con los casos pruebas, donde este es leido en el codigo de CheckifArrayIsSortedandRotatedFichero.java
  - fichero.txt     Fichero que se genero para realizar pruebas, y verificar que los codigos funcionan correctamente

Conclusiones:

Según el problema que se desarrollo en leetcode se puede aprender que hay ejercicios, que aplicando logica no hay necesidad de realizar ordenamiento (tambien valido para busqueda)
Generar y crear documentos, es una buena practica al momento de probar codigos
De acuerdo a los problemas hay metodos de ordenamiento que aunque su Complexity sea superior a otro metodo, dependiendo de los valores este puede ser hasta mas optimo, 
por ejemplo: 
    a) Un metodo de ordenamiento que sea O(n^2), la notación omicron evalua los peores casos, ya que esta seria la cota superior...
    b) Un metodo de ordenamiento que sea O(n*log(n))
    
 Aunque a simple vista se deduce que la B es mas eficiente que la A, en ciertos casos especiales, y mayormente con datos pequeños y dependiendo de lo que requiera el problema el metodo A puede llegar a ser el mas eficiente.
 
 
 
Descripción del Ejercicio  
# Check-if-Array-Is-Sorted-and-Rotated
https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/

Given an array nums, return true if the array was originally sorted in non-decreasing order, then rotated some number of positions (including zero). Otherwise, return false.

There may be duplicates in the original array.

Note: An array A rotated by x positions results in an array B of the same length such that A[i] == B[(i+x) % A.length], where % is the modulo operation.


Example 1:

Input: nums = [3,4,5,1,2]
Output: true
Explanation: [1,2,3,4,5] is the original sorted array.
You can rotate the array by x = 3 positions to begin on the the element of value 3: [3,4,5,1,2].


Example 2:

Input: nums = [2,1,3,4]
Output: false
Explanation: There is no sorted array once rotated that can make nums.


Example 3:

Input: nums = [1,2,3]
Output: true
Explanation: [1,2,3] is the original sorted array.
You can rotate the array by x = 0 positions (i.e. no rotation) to make nums.

 ![image](https://user-images.githubusercontent.com/106695664/199315836-62fb96ad-fb3a-46d7-822c-42209eda8fdd.png)

 
