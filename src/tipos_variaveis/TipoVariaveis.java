package tipos_variaveis;

public class TipoVariaveis {

    public static void main(String[] args) {
        double salarioMinimo = 1200;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal; // casting

        // variaveis podem sofrer alteração ao longo da implementacao do codigo
        int numero = 5;
        numero = 10;

        // constantes nao podem sofrer alteracao
        final double VALOR_DE_PI = 3.14;
    }

}
