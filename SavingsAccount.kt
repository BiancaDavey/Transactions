class SavingsAccount(accountBalance : Double, val clientFirstName : String, val clientLastName : String) : Account(accountBalance)
{

    init {
        println("A new savings account has been created.");
    }

    var transferFee : Double = 0.05;

    // Method to calculate the applicable fee for a transfer.

    fun calculateFee(transactionAmount : Double) : Double {
        return transferFee * transactionAmount;
    }

    // TODO: override transfer() function from super.

    // Method to display the details of the account, overriding the superclass method.

    override fun displayTransactions() {
        println("Account holder: $clientFirstName $clientLastName");
        super.displayTransactions();
        println("Balance: $balance");
    }


}