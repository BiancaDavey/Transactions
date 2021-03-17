fun main(args: Array<String>)
    {

        // Creating class objects.

        var account1 = CompanyAccount(20000.05, "Distributed Holdings Inc");
        var account2 = SavingsAccount(1050.75, "Bob", "Smith");

        // Demonstrating class methods.

        println("\n Object details before calling methods: \n");
        println("Account 1 Balance: ");
        account1.displayBalance();
        println("Account 2 Balance: ");
        account2.displayBalance();

        account1.withdraw(260.00);
        account2.deposit(3371.65);
        account2.transfer(2000.00);

        println("\n Object details after calling methods: \n");
        println("Account 1 Balance: ");
        account1.displayBalance();
        println("Account 1 Transactions: ");
        account1.displayTransactions();
        println("Account 2 Balance: ");
        account2.displayBalance();
        println("Account 2 Transactions: ");
        account2.displayTransactions();

};