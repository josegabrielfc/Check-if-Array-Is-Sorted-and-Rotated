import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Jose Gabriel Fuentes - 1152085
 */
public class CheckifArrayIsSortedandRotated {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba el numero de casos: ");
        int cases = sc.nextInt();
        System.out.println("Escriba el tamaño con el que desea trabajar los arreglos:           (debe ser mayor de 0)");
        int size = sc.nextInt();
        System.out.println("Digite '1' para ver la solucion con Ordenamiento, Digite '2' para ver la solución logica");
        byte option = sc.nextByte();
        boolean valid = (option == 1) ? true : false;
        while (cases > 0) {
            if (valid) {
                System.out.println(check1(testCases(size)));
            } else {
                System.out.println(check2(testCases(size)));
            }
            cases--;
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

    /**
     *
     * @param size, numero entero que define el tamaño del array
     * @return un arreglo de numeros generados de manera aleatoria segun el caso
     * seleccionado en el Switch
     */
    private static int[] testCases(int size) { //genera un array de cardinalidad 5
        int[] arr = new int[size];
        int aux = 0;

        int random = (int) (Math.random() * 3 + 1);
        int rotate = (int) (Math.random() * (arr.length - 1) + 1);

        switch (random) {
            case 1: // un arreglo totalmente aleatorio
                System.out.println("");
                for (int i = 0; i < arr.length; i++) {
                    arr[i] = (int) (Math.random() * 100 + 1);
                    System.out.print(arr[i] + " ");
                }
                System.out.println("");
                break;
            case 2: // un arreglo ordenado/rotado
                aux = (int) (Math.random() * 100 + 1); // 4
                System.out.println(""); // rotate = 3
                for (int i = 0; i < arr.length; i++) { // 2 3 4 5 6 
                    if (rotate == i) {
                        aux = (int) (Math.random() * 100 + 1); //2
                    }
                    arr[i] = aux;
                    aux++;
                    System.out.print(arr[i] + " ");
                }
                System.out.println("");
                break;
            case 3: // un arreglo completamente ordenado
                aux = (int) (Math.random() * 100 + 1);
                System.out.println("");
                for (int i = 0; i < arr.length; i++) {
                    arr[i] = aux;
                    aux++;
                    System.out.print(arr[i] + " ");
                }
                System.out.println("");
                break;
        }

        return arr;
    }
}
