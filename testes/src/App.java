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

        somas(3, 2);
    }

    public static int somas(int num1, int num2){
        
        int result = num1+num2;
        
        System.out.println(result);
        
        return result;
    }

}
