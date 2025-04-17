public class App {

    public static void main(String[] args) throws Exception {
        
        boolean verdadeiro = !true;
        boolean falso = !true;

        if (verdadeiro && falso){
            System.out.println("as duas sao verdadeiras");
        } else if (verdadeiro || falso){
            System.out.println("uma é verdadeira");
        } else {
            System.out.println("nenhuma é verdadeira");
        }
    }
}
