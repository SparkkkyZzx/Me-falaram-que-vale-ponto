public class ValidadorSenha {
    public static void main(String[]ags ) {
        String senhaCorreta = new String("1234");
        String tentativa = "1234";
        if (tentativa.equals(senhaCorreta)) {
            System.out.println("Acesso liberado");
        } else {
            System.out.println("Acesso negado"); // este roda!
        }

    }
}
// da acesso negado, porque a comparação usando "==" verifica se as referências dos objetos são as mesmas, e nesse caso, "tentativa" e "senhaCorreta" são objetos diferentes na memória, mesmo que tenham o mesmo conteúdo. Para comparar o conteúdo das strings, o certo seria equals
// apos dar o equals deu acesso liberado
//o risco de usar "==" para comparar strings é que ele pode levar a resultados inesperados, especialmente quando as strings são criadas de maneiras diferentes (como usando o operador new ou literais). Isso pode causar bugs difíceis de detectar, pois o código pode funcionar corretamente em alguns casos e falhar em outros, dependendo de como as strings foram criadas. Portanto, é sempre recomendado usar o método equals() para comparar o conteúdo das strings, garantindo que a comparação seja feita corretamente.