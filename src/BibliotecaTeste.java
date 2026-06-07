import java.util.HashSet;

public class BibliotecaTeste {

    public static void main(String[] args) {

        HashSet<Livro> biblioteca = new HashSet<>();

        Livro l1 = new Livro("Clean Code", "978-0132350884");
        Livro l2 = new Livro("Clean Code", "978-0132350884");

        biblioteca.add(l1);
        biblioteca.add(l2);

        System.out.println("Tamanho do Set: " + biblioteca.size());
    }
}

//Rodada A: tamanho do Set = 1.
//Rodada B: tamanho do Set = 2.
//Motivo: o HashSet utiliza hashCode() e equals() para detectar duplicatas. Sem um hashCode() compatível com equals(), objetos iguais podem ser armazenados como se fossem diferentes.