public class BPI_ATM {
    public static void main(String[] args) {
        ATMDispenseChain atmDispenser = new ATMDispenseChain();
        int amount = 240; // Amount to be dispensed
        if (amount % 10 != 0) {
            System.out.println("Amount should be in multiples of 100s.");
            
        } else
        atmDispenser.dispense(new Currency(amount));
    }
}








