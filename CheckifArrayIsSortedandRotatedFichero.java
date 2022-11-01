import java.io.*;
import java.util.*;

/**
 *
 * @author Jose Gabriel Fuentes - 1152085
 */
public class CheckifArrayIsSortedandRotatedFichero {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        Scanner sc = new Scanner(System.in);

        String contenido;
        FileReader archivo = new FileReader("../fichero.txt"); // Colocar direccion donde se encuentra el fichero
        BufferedReader buffer = new BufferedReader(archivo);

        while ((contenido = buffer.readLine()) != null) {
            String str = buffer.readLine();
            System.out.println(str);
            String[] numbers = str.split(" ");
            int[] arr = new int[numbers.length];
            for (int i = 0; i < numbers.length; i++) {
                arr[i] = Integer.valueOf(numbers[i]);
            }
            System.out.println(check2(arr));
            //System.out.println(check1(arr));
        }
    }

    /**
     *
     * @param nums , arreglo de numeros que estan ordenados y rotados
     * @return True si el arreglo es ordenado y rotado, false si sucede lo
     * contrario
     */
    public static boolean check2(int[] nums) {
        int count = 0; //Contador para verificar si el arreglo ha sido rotado y es ordenado

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > nums[(i + 1) % nums.length]) { //Comparación de verificar si el arreglo esta ordenado
                count++; // si el elemento de la posicion i, es mayor que el de la posicion i+1, no esta ordenado por ende incrementa el contador
            }
        }
        return (count <= 1); // Si el contador es exactamente 1 o menor, es porque tan solo se hizo 1 rotación y el arreglo en esa rotación esta inicialmente ordenado
    }

    /**
     *
     * @param nums , arreglo de numeros que estan ordenados y rotados
     * @return False si el arreglo no esta ordenado y al rotar 1 sola vez sigue
     * sin estar ordenado, True si sucede lo contrario
     */
    public static boolean check1(int[] nums) {
        String arr = "";
        for (int i : nums) {
            arr += i + " ";
        }

        Arrays.sort(nums);

        String arrSort = "";
        for (int j : nums) {
            arrSort += j + " ";
        }

        String aux = arrSort + arrSort;
        return aux.contains(arr);
    }
}
