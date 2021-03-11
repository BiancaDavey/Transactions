/*
    This program simulates the creation of accounts and provides methods for carrying out transactions.
    The Account class enables the creation of Account objects representing bank accounts.
*/

open class Account(accountBalance : Double)
{
    var accountBalance : Double = 0.0;
    var totalWithdrawals : Int = 0;
    var totalDeposits : Int = 0;
    var totalTransfers : Int = 0;

    /*
    TODO: ensure constructor form is correctly implemented.
    constructor(accountBalance: Double) {
        accountBalance = balance;
    }
    */

    // Method to make a transaction being a withdrawal from an account object.

    open fun withdraw(withdrawAmount : Double) {
        accountBalance -= withdrawAmount;
        totalWithdrawals++;
    }

    // Method to make a transaction being a deposit into an account object.

    open fun deposit(depositAmount : Double) {
        accountBalance += depositAmount;
        totalDeposits++;
    }

    // Method to make a transaction being a transfer from an account object.

    open fun transfer(transferAmount : Double) {
        accountBalance -= transferAmount;
        totalTransfers++;
    }

    // Method to display the balance details of an account.

    open fun displayBalance() {
        println("Account balance: $accountBalance");
    }

    // Method to display the record of transactions made by an account.

    open fun displayTransactions() {
        println("Total number of withdrawals: $totalWithdrawals \n Total number of deposits: $totalDeposits \n Total number of transfers: $totalTransfers");
    }

}