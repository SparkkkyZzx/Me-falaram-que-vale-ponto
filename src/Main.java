public class Main {

    public static void main(String[] args) {

        Livro l1 = new Livro("Clean Code", "978-0132350884");
        Livro l2 = new Livro("Clean Code", "978-0132350884");
        System.out.println(l1 == l2); // ?
        System.out.println(l1.equals(l2)); // ?
    }
}
// O ISBN identifica unicamente um livro.
// Títulos podem ser iguais para livros diferentes
// ou podem variar entre edições, idiomas e traduções.
// Por isso, o ISBN é mais confiável para determinar
// se dois livros representam a mesma obra.
