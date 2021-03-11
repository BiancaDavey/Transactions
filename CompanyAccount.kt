class CompanyAccount(accountBalance : Double, companyName : String) : Account(accountBalance)
{

    var companyName : String = ""; // initialising field values.
    var transferFee : Double = 0.5;

    /* 
    TODO: ensure that values are added to account.
    constructor(balance : Double, name : String) : super (accountBalance) {
        companyName = name;
    }
     */

    // Method to calculate the applicable transfer fee, based on the amount being transferred.

    fun calculateFee(transferAmount : Double) : Double {
        return transferFee * transferAmount;
    }

    /* 
    TODO: Implement method to make a transaction being a transfer from an account object, overriding the superclass method to add a transfer fee.
    override fun transfer(transferAmount : Double) {
        var transactionFee : Double = calculateFee(transferAmount);
        super.transfer(transferAmount -= transferFee);
    }
     */

    // Method to display the details of the account, overriding the superclass method.

    override fun displayTransactions() {
        println("Account holder: $companyName");
        println("Account balance: $accountBalance");
    }

}