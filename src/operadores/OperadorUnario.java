package operadores;

/*
* + -> Valor positivo (nao afeta a atribuicao inicial)
* -  -> Valor negativo (nao afeta a atribuicao inicial)
* ++ -> Incremento de valor
* -- -> Decremento de valor
* ! -> Negacao de exprexoes booleanas
* */

public class OperadorUnario {

    public static void main(String[] args) {

        int numero = 5; // por padrao o valor é positivo
        System.out.println(-numero);
        System.out.println(numero);

        numero = -numero;

        System.out.println(numero);

        numero = -numero;

        numero++;
        // numero += 1;
        // numero = numero + 1;

        System.out.println(numero);
        System.out.println(numero++);
        System.out.println(numero);
        System.out.println(++numero);
        System.out.println(numero);

        boolean valor = true;

        System.out.println(!valor);
        System.out.println(valor);

    }

}
