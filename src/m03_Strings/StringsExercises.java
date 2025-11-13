package m03_Strings;

public class StringsExercises {
    static void main() {
        // 1. Concatena dos cadenas de texto.

        String name = "Pablo";
        String name2 = "pablo";
//        var surname = new String("Fernandez");
//
//        System.out.println(name.equals(surname));
        System.out.println(name.equalsIgnoreCase(name2));

        // 2. Muestra la longitud de una cadena de texto.

        System.out.println(name.length());

        // 3. Muestra el primer y último carácter de un string.

        System.out.println(name.charAt(0));
        System.out.println(name.charAt(4));

        // 4. Convierte a mayúsculas y minúsculas un string.

        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        // 5. Comprueba si una cadena de texto contiene una palabra concreta.

        String place = "Rio de Janeiro";
        System.out.println(place.contains("Rio"));
        System.out.println(place.toLowerCase().contains("Rio"));


        // 6. Formatea un string con un entero.

        String place2 = "Rio de Janeiro";
        String name3 = "En Rio de Janeiro esta la estatua de Jesus";

        System.out.println(place.trim());

        // 7. Elimina los espacios en blanco al principio y final de un string.

        // 8. Sustituye todos los espacios en blanco de un string por un guión (-).

        // 9. Comprueba si dos strings son iguales.

        // 10. Comprueba si dos strings tienen la misma longitud.
    }
}
