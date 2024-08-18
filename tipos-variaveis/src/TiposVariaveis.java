public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        
        int numero = 5;
        System.out.println(++numero);

        int a, b;
        String resultado = "";
        a = 6;
        b = 6;

        resultado = a == b ? "iguais" : "diferentes";

        System.out.println(resultado);

        String nomeUm = "Vitor";
        String nomeDois = new String("Vitor");

        System.out.println(nomeUm == nomeDois); // false
        System.out.println(nomeUm.equals(nomeDois)); //true
    }
}
