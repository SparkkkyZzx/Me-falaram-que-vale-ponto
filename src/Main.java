public class Main {

    public static void main(String[] args) {

        Livro l1 = new Livro("Clean Code", "978-0132350884");
        Livro l2 = new Livro("Código Limpo", "978-0132350884");

        Livro l3 = new Livro("Xingamentos ao lider", "12635243");
        Livro l4 = new Livro("Como sumir com o corpo do lider ", "77777");

        System.out.println("Mesmo ISBN:");
        System.out.println(l1.hashCode());
        System.out.println(l2.hashCode());

        System.out.println("ISBNs diferentes:");
        System.out.println(l3.hashCode());
        System.out.println(l4.hashCode());
    }
}

//Contrato entre equals() e hashCode():
//Se dois objetos são considerados iguais pelo equals().
//eles DEVEM possuir o mesmo hashCode()
//Objetos diferentes podem, eventualmente,
//possuir o mesmo hashCode()