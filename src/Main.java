public class Main {
    public static void main(String[] args) {
        produto p1 = new produto();
        p1.setNome("Prensado");
        p1.setPreco(5.00);
    produto p2 = new produto();
        p2.setNome("Paiero");
        p2.setPreco(1.00);

        System.out.println(p1);
        System.out.println(p2);
    }
}
// a saida dos codigos sai :produto@8efb846
//produto@2a84aee7 , sendo ilegivel qual os produtos