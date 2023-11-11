public class Aula4Recursividade {

    public static void main(String[] args) {
        repercucao(10);
    }

    private static void repercucao(int contador) {
        System.out.println(contador);
        contador = contador-1;
        if (contador == 0) {
            return;
        }
        repercucao(contador);

    }
}
