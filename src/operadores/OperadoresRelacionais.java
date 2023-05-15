package operadores;

public class OperadoresRelacionais {

    public static void main(String[] args) {

        int numero1 = 1;
        int numero2 = 2;

        System.out.println(numero1 < numero2 ? "A condicao e verdadeira" : "A condicao e falsa");

        boolean simNao = numero1 == numero2;

        System.out.println("numeroUm é igual a numeroDois? " + simNao);

        simNao = numero1 != numero2;

        System.out.println("numeroUm é diferente a numeroDois? " + simNao);

        simNao = numero1 > numero2;

        System.out.println("numeroUm é maior a numeroDois? " + simNao);

        simNao = numero1 < numero2;

        System.out.println("numeroUm é menor a numeroDois? " + simNao);
    }

}
