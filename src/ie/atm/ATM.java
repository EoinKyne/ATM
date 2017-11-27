package ie.atm;

public class ATM {

	private boolean userAuthenticated; //whether user is authenticated
	private int	currentAccountNumber; //current user's account number
	private Screen screen;//ATM screen
	private Keypad keypad; //ATM keypad
	private CashDispenser cashDispenser; // ATM cash dispenser
	private DepositSlot depositSlot; // ATM deposit slot
	private BankDatabase bankDatabase; // account information db
	
	// Main menu -  constants corresponding to menu options
	private static final int BALANCE_INQUIRY = 1;
	private static final int WITHDRAWAL = 2;
	private static final int DEPOSIT = 3;
	private static final int EXIT = 4;
	
	// Constuctor to initialise instance vbls
	public ATM() {
		
		userAuthenticated = false; //user is not authenticated to start
		currentAccountNumber = 0; // No current account number to start
		screen = new Screen(); // create screen
		keypad = new Keypad(); // create keypad
		cashDispenser = new CashDispenser(); //create cash dispenser
		depositSlot = new DepositSlot(); // create deposit slot
		bankDatabase = new BankDatabase(); // create account info db
	}
	
	// start ATM
	public void run(){
		// welcome and authenticate user and perform transaction
		while (true){
			// loop while user is not yet authenticated
			while ( !userAuthenticated ){
				screen.displayMessageLine("\nWelcome");
				authenticateUser(); // authenticate user
			}
			performTransactions(); //user is now authenticated
			userAuthenticated = false; // reset before next ATM session
			currentAccountNumber = 0; // reset before next ATM session
			screen.displayMessageLine("\nThank You. Goodbye");
		}
	}
	// attempt to authenticate user
	private void authenticateUser(){
		
	}
	
	// display main menu and perform transactions
	private void performTransactions(){
		
	}
	
	// display main menu and return input selection
	private int displayMainMenu(){
		return 0;
	}
	
	//return object of specified transaction subclass
	private Transaction createTransaction(int type){
		return null;
	}
}
