/**
 * Archivo a modificar.
 * Modifica el código ASCII que representa a un camello y agrega una cola.
 * @author Fuentes Esquivel Elian Andrea 
 * @author Campos Mendoza Edgar Felipe       
 * @version 1.0                 
 * @date 9 oct
 *  2024.           
 */
public class MyString {
    char[] cadenas;

    // Constructor que inicializa la clase con un arreglo de caracteres
    public MyString(char[] cadenas) {
        this.cadenas = cadenas;
    }

    // Constructor que inicializa la clase con un arreglo de caracteres vacío de una longitud dada
    public MyString(int longitud) {
        this.cadenas = new char[longitud];
    }

    // Método para cambiar un carácter en una posición específica
    public void CambiarEn(int posicion, char caracter) {
        cadenas[posicion] = caracter;
    }

    // Método para extraer una subcadena desde una posición inicial hasta el final del arreglo
    public char[] Substraer(int inicio) {
        if (inicio < 0 || inicio >= cadenas.length) {
            throw new IndexOutOfBoundsException("Posicion fuera de rango");
        }
        char[] subcadena = new char[cadenas.length - inicio];
        for (int i = inicio; i < cadenas.length; i++) {
            subcadena[i - inicio] = cadenas[i];
        }
        return subcadena;
    }

    // Método para extraer una subcadena entre dos posiciones
    public char[] Substraer2(int inicio, int fin) {
        if (inicio < 0 || fin > cadenas.length || inicio > fin) {
            throw new IndexOutOfBoundsException("Posicion fuera de rango");
        }
        char[] subcadena = new char[fin - inicio];
        for (int i = inicio; i < fin; i++) {
            subcadena[i - inicio] = cadenas[i];
        }
        return subcadena;
    }

    // Método para obtener el número de bytes que ocupa el arreglo de caracteres
    public int GetNumeeroBytes() {
        return cadenas.length * 2;
    }

    // Método para obtener la longitud de la cadena
    public int length() {
        return cadenas.length;
    }

    // Método para obtener el carácter en una posición específica
    public char charAT(int index) {
        if (index < 0 || index >= cadenas.length) {
            throw new IndexOutOfBoundsException("indice fuera de rango");
        }
        return cadenas[index];
    }

    // Método para comparar dos objetos MyString carácter por carácter
    public boolean equals(MyString otracadena) {
        if (this.length() != otracadena.length()) {
            return false;
        }
        for (int i = 0; i < cadenas.length; i++) {
            if (this.cadenas[i] != otracadena.cadenas[i]) {
                return false;
            }
        }
        return true;
    }

    // Método para mostrar la representación de la cadena de caracteres
    public void mostrarCadena() {
        for (char c : cadenas) {
            System.out.print(c);
        }
        System.out.println(); // Nueva línea al final
    }

    // Método main para probar la clase MyString
    public static void main(String[] args) {
        // Crear un objeto MyString con un arreglo de caracteres
        char[] caracteres = { 'H', 'o', 'l', 'a', ' ', 'M', 'u', 'n', 'd', 'o' };
        MyString miCadena = new MyString(caracteres);

        // Mostrar la cadena original
        System.out.print("Cadena original: ");
        miCadena.mostrarCadena();

        // Cambiar un carácter en una posición específica
        miCadena.CambiarEn(5, 'L');
        System.out.print("Después de cambiar el carácter en la posición 5: ");
        miCadena.mostrarCadena();

        // Extraer una subcadena desde la posición 2 hasta el final
        char[] subcadena = miCadena.Substraer(2);
        System.out.print("Subcadena desde la posición 2: ");
        for (char c : subcadena) {
            System.out.print(c);
        }
        System.out.println();

        // Extraer una subcadena desde la posición 2 hasta la posición 8
        char[] subcadena2 = miCadena.Substraer2(2, 8);
        System.out.print("Subcadena desde la posición 2 hasta la 8: ");
        for (char c : subcadena2) {
            System.out.print(c);
        }
        System.out.println();

        // Mostrar el número de bytes que ocupan los caracteres
        int numeroBytes = miCadena.GetNumeeroBytes();
        System.out.println("Número de bytes que ocupan los caracteres: " + numeroBytes);

        // Probar el método equals para comparar dos cadenas
        char[] otraCadenaChars = { 'H', 'o', 'l', 'a', ' ', 'L', 'u', 'n', 'd', 'o' };
        MyString otraCadena = new MyString(otraCadenaChars);
        System.out.print("¿Las cadenas son iguales?: ");
        System.out.println(miCadena.equals(otraCadena));
    }
}
