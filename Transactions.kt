//class Transactions {

    fun main(args: Array<String>)
    {

        // Creating class objects from the CompanyAccount and SavingsAccount subclasses.

        val account1 = CompanyAccount(20000.05, "Distributed Holdings Inc");
        val account2 = SavingsAccount(1050.75, "Bob", "Smith");

        // Demonstrating class methods.

        account1.displayTransactions();
        account2.displayTransactions();

        println("Object details before calling methods: ");
        account1.displayBalance();
        account2.displayBalance();
        account1.displayTransactions();
        account2.displayTransactions();

        account1.withdraw(260.00);
        account2.deposit(3371.65);
        account2.transfer(2000.00);

        println("Object details after calling methods: ");
        account1.displayBalance();
        account2.displayBalance();
        account1.displayTransactions();
        account2.displayTransactions();

    }

//}