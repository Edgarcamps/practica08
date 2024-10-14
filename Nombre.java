/**
 * Archivo a modificar.
 * Modifica el código ASCII que representa a un camello y agrega una cola.
 * @author Fuentes Esquivel Elian Andrea 
 * @author Campos Mendoza Edgar Felipe       
 * @version 1.0                 
 * @date 9 oct
 *  2024.           
 */
public class Nombre {
    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("Debes ingresar al menos tres cadenas para el nombre");
            return;
        }

        StringBuilder apellidos = new StringBuilder();
        StringBuilder nombre = new StringBuilder();

        // El último argumento es considerado el apellido paterno
              apellidos.append(args[args.length - 1]);

        // El penúltimo argumento es considerado el apellido materno 
              apellidos.insert(0, args[args.length - 2]+"");

        // Los demás argumentos (hasta el penúltimo) son considerados como el nombre de pila
           for (int i = 0; i < args.length - 2; i++) {
            if (i > 0) {
                nombre.append("");
            }

            System.out.println("El nombre completo es:" + apellidos.toString() + "" + nombre.toString());
            System.out.println("El nombre es:" + nombre.toString());
           }
    }
}
