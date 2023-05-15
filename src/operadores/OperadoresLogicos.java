package operadores;

public class OperadoresLogicos {

    public static void main(String[] args) {

        boolean condicao1 = true;
        boolean condicao2 = false;

        System.out.println(condicao1 && condicao2 ? "As duas condicoes sao verdadeiras" : "Uma das condicoes e falsa");

        System.out.println(condicao1 || condicao2 ? "Uma das condicoes e verdadeira" : "Ambas as condicoes sao falsas");

    }

}
