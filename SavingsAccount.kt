class SavingsAccount(accountBalance : Double, clientFirstName : String, clientLastName : String) : Account(accountBalance)
{

    var clientFirstName : String = "";
    var clientLastName : String = "";
    var transferFee : Double = 0.1;

    /*
    constructor(balance: Double, firstName : String, lastName : String) : super(accountBalance) {
        clientFirstName = firstName;
        clientLastName = lastName;
    }
     */

    // TODO: Method to calculate the applicable transfer fee, based on the amount being transferred.

    /*
    fun calculateFee(transactionAmount : Double) {
        return transactionFee * transferAmount;
    }
     */

    // Method to display the details of the account, overriding the superclass method.

    override fun displayTransactions() {
        println("Balance is $accountBalance");
    }


}