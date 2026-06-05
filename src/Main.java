public class Main {

    public static void main(String[] args) {

        String a = "Java";
        String b = "Java";
        String c = new String("Java");

        System.out.println(a == b);   //true - porque a e b apontam para o mesmo objeto na pool de strings
        System.out.println(a == c);   //false - porque c é um novo objeto criado com o operador new, então ele não aponta para o mesmo objeto na pool de strings
        System.out.println(a.equals(c)); //true - porque o método equals() compara o conteúdo das strings, e tanto a quanto c têm o mesmo conteúdo "Java"
    }
}


// A string Pool é uma area diferente ou especiais que o Java utiliza para armazenar strings literais. Quando uma string é criada usando aspas duplas (""), ela é automaticamente adicionada à string pool. Se outra string com o mesmo conteúdo for criada, em vez de criar um novo objeto, o Java reutiliza a referência para a string existente na pool. Isso economiza memória e melhora o desempenho, pois evita a criação de múltiplos objetos para strings idênticas. No entanto, quando uma string é criada usando o operador new, um novo objeto é criado na heap.