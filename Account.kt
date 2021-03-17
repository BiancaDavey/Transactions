/*
    This program simulates the creation of accounts and provides methods for carrying out transactions.
    The Account class enables the creation of Account objects representing bank accounts.
*/

open class Account(accountBalance : Double)
{

    // init function is executed when an instance of the class is created.
    init {
        println("A new account has been created. ");
    }

    // open var accountBalance : Double = 0.0
    open var balance : Double = accountBalance;
    open var totalWithdrawals : Int = 0
    open var totalDeposits : Int = 0
    open var totalTransfers : Int = 0

    // Method to make a transaction being a withdrawal from an account object.

    open fun withdraw(withdrawAmount : Double) {
        balance -= withdrawAmount;
        totalWithdrawals++;
        println("Withdrawing $withdrawAmount from account.");
    }

    // Method to make a transaction being a deposit into an account object.

    open fun deposit(depositAmount : Double) {
        balance += depositAmount;
        totalDeposits++;
        println("Depositing $depositAmount into account.");
    }

    // Method to make a transaction being a transfer from an account object.

    open fun transfer(transferAmount : Double) {
        balance -= transferAmount;
        totalTransfers++;
        println("Transferring $transferAmount from account.");
    }

    // Method to display the balance details of an account.

    fun displayBalance() {
        println("Account balance: $balance"); // $accountBalance");
    }

    // Method to display the record of transactions made by an account.

    open fun displayTransactions() {
        println("Total number of withdrawals: $totalWithdrawals \n Total number of deposits: $totalDeposits \n Total number of transfers: $totalTransfers");
    }

}
