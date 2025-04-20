import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Please, type your number: ");
        int num = sc.nextInt();

        System.out.println("Please, type your agency: ");
        String agency = sc.next();

        System.out.println("Your name, please: ");
        String clientName = sc.next();

        System.out.println("Now, your balance: ");
        Double balance = sc.nextDouble();

        sc.close();

        String part1 = agency.substring(0, agency.length() - 1);
        String part2 = agency.substring(agency.length() - 1);

        String agencyFormat = part1 + "-" + part2;;

        String message = String.format("""
            "Olá %s obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque".
            """, clientName, agencyFormat, num, balance);
        System.out.println(message);
    } 
}
