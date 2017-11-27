package ie.atm;

public class ATM {

	private boolean userAuthenticated;
	private int	currentAccountNumber;
	private Screen screen;
	private Keypad keypad;
	private CashDispenser cashDispenser;
	private DepositSlot depositSlot;
	private BankDatabase bankDatabase;
	
	private static final int BALANCE_INQUIRY = 1;
	private static final int WITHDRAWAL = 2;
	private static final int DEPOSIT = 3;
	private static final int EXIT = 4;
	
	
	public ATM() {
		
		userAuthenticated = false;
		currentAccountNumber = 0;
		screen = new Screen();
		keypad = new Keypad();
		cashDispenser = new CashDispenser();
		depositSlot = new DepositSlot();
		bankDatabase = new BankDatabase();
	}
	
	
	private void authenticateUser(){
		
	}
	
	private void performTransactions(){
		
	}
	
	private int displayMainMenu(){
		return 0;
	}
	
	private Transaction createTransaction(int type){
		return null;
	}
}
