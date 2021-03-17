class CompanyAccount(accountBalance : Double, val companyName : String) : Account(accountBalance)
{
    init {
        println("A new company account has been created.");
    }

    var transferFee : Double = 0.1;

    // Method to calculate the applicable transfer fee, based on the amount being transferred.

    fun calculateFee(transferAmount : Double) : Double {
        return transferFee * transferAmount;
    }

    // TODO: override transfer() function from super.

    /*
    override fun transfer(transferAmount : Double) {
        var transactionFee : Double = calculateFee(transferAmount);
        super.transfer(transferAmount -= transferFee);
    }
     */

    // Method to display the details of the account, overriding the superclass method.

    override fun displayTransactions() {
        println("Account holder: $companyName");
        super.displayTransactions();
        println("Account balance: $balance");
    }

}
