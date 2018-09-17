import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ATMDispenseChain atmDispenser = new ATMDispenseChain();

        while (true) {
            int amount = 0;
            System.out.println("Ange summa att ta ut");
            Scanner input = new Scanner(System.in);

            amount = input.nextInt();

            if(amount % 10 != 0){
                System.out.println("Summan måste vara i 10 kr.");

                return;
            }

            atmDispenser.getChain1().dispense(new Currency(amount));

        }

    }

}
