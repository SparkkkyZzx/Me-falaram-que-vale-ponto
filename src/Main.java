public class Main {
    public static void main(String[] args) {

        produto p1 = new produto("Caneta", 2.50);
        produto p2 = new produto("Caderno", 15.90);

        System.out.println(p1);
        System.out.println(p2);
    }
}

//a saida ficou produto{nome='Caneta', preco=2,50}
//produto{nome='Caderno', preco=15,90 , fica legivel mas para mim nao esta bom