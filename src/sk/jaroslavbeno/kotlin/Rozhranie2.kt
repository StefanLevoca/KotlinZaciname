package sk.jaroslavbeno.kotlin

import java.lang.Exception
import java.math.BigDecimal

fun main(args: Array<String>) {

    val account = Account(accountManipulation = OnlineBankingManipulation())
    account.takOutMoney()

}

class Account(var accountBalance: BigDecimal = BigDecimal(1000),
              val accountManipulation: AccountManipulation){
    fun takOutMoney(){
        accountManipulation.withdraw(this)
    }

    fun putMoenyIn(){
        accountManipulation.deposit(this)
    }
}





interface AccountManipulation{
    fun withdraw(account: Account)
    fun deposit(account: Account)
}

class AtmManipulation: AccountManipulation{
    override fun withdraw(account: Account) {
        println("Please enter PIN:");
        println("Enter amount:");
        println("Take you money.");
        account.accountBalance.subtract(BigDecimal(100))
    }

    override fun deposit(account: Account) {
        throw Exception()
    }
}

class OnlineBankingManipulation: AccountManipulation{
    override fun withdraw(account: Account) {
        println("Please name and password:");
        println("Enter amount to send:");
        println("Insert code for verification.");
        account.accountBalance = account.accountBalance.subtract(BigDecimal(200))
    }

    override fun deposit(account: Account) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
