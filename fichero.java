import java.io.*;

/**
 *
 * @author Jose Gabriel Fuentes - 1152085
 */
public class fichero {

    public static void main(String[] args) throws IOException {
        FileWriter fichero = new FileWriter("../fichero.txt"); // Colocar direccion donde se guarde el fichero
        int cases = 100;
        while (cases > 0) {
            int[] arr = new int[5];
            int aux = 0;

            int random = (int) (Math.random() * 3 + 1);
            int rotate = (int) (Math.random() * (arr.length - 1) + 1);

            switch (random) {
                case 1: // un arreglo totalmente aleatorio
                    System.out.println("");
                    fichero.write("\n");
                    for (int i = 0; i < arr.length; i++) {
                        arr[i] = (int) (Math.random() * 100 + 1);
                        System.out.print(arr[i] + " ");
                        fichero.write(arr[i] + " ");
                    }
                    System.out.println("");
                    fichero.write("\n");
                    break;
                case 2: // un arreglo ordenado/rotado
                    aux = (int) (Math.random() * 100 + 1); // 4
                    System.out.println(""); // rotate = 3
                    fichero.write("\n");
                    for (int i = 0; i < arr.length; i++) { // 2 3 4 5 6 
                        if (rotate == i) {
                            aux = (int) (Math.random() * 100 + 1); //2
                        }
                        arr[i] = aux;
                        aux++;
                        System.out.print(arr[i] + " ");
                        fichero.write(arr[i] + " ");
                    }
                    System.out.println("");
                    fichero.write("\n");
                    break;
                case 3: // un arreglo completamente ordenado
                    aux = (int) (Math.random() * 100 + 1);
                    System.out.println("");
                    fichero.write("\n");
                    for (int i = 0; i < arr.length; i++) {
                        arr[i] = aux;
                        aux++;
                        System.out.print(arr[i] + " ");
                        fichero.write(arr[i] + " ");
                    }
                    System.out.println("");
                    fichero.write("\n");
                    break;
            }
            cases--;
        }
        fichero.close();
    }
}
