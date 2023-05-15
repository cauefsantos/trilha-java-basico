// Simpleficacao da implementação de um if-else com apenas um else

package operadores;

public class OperadorTernario {

    public static void main(String[] args) {

        int a, b;
        String resultado;

        a = 5;
        b = 6;

        resultado = a == b ? "verdadeiro" : "falso";

        /*
        * if (a == b) {
        *   resultado = "verdadeiro"
        * } else {
        *   resultado == "falso"
        * }
        * */

        System.out.println(resultado);

    }

}
