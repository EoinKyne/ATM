package ie.atm;

public class Withdrawal extends Transaction {
	
	// attributes
	private int accountNumber;
	private double amount;
	
	// references to associated objects
	private Screen screen;
	private Keypad keypad;
	private CashDispenser cashDispenser;
	private BankDatabase bankDatabase;
	
	public Withdrawal(){
		
	}
	
	public void execute(){
		
	}

}
