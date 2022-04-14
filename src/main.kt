fun main(){
var situation=CurrentAccount("20409078","Ephy Phiona",100000)
 println(situation.deposit(10000.00))
    println(situation.withdraw(5000.00))
    situation.details()
    var account=savingAccount("22321545","Tamara",10000)
    var m=Product("OLOO",30,70,"Fruits")
    m.Fruits("mango")
    m.Fruits("lemon")

}
 open class CurrentAccount(var accountNumber:String,var accountName:String,var balance:Int){
     fun deposit(amount: Double):Double{
     var money=amount
        money+=balance
        return money
}
     fun withdraw(amount: Double):Double{
         var cash=balance-amount
         return cash

     }
     fun details(){
         println("Account number$accountNumber with balance $balance is operated by $accountName")
     }
 }
class savingAccount(accountNumber: String,accountName: String,balance: Int):CurrentAccount(accountNumber,accountName,balance){
   //fun withdraw(deduct:Int){ if (deduct<=4){
}
class Product(var name:String,var weight:Int,var price:Int,var category:String){

        fun Fruits(fav:String) {
            when(fav){
                "Mango"-> println("I love friuts")
                "lemon"-> println("bitter taste")
                "weight"-> println("I have 60 kg")
            }
            if (fav.equals("mango")) {
                println("Favourite food?")
            } else if (fav.equals("lemon")) {
                println("I have eaten lemon?")

            } else {
                print("Heavy weight")
            }

        fun numb(){
            for (numbers in 1..20){
                if ((numbers% 2)!=0)
                    println(numbers)
            }

        }


    }
}
fun Fruits(names:String){
        for (names in 1..10)
            if ((names%2)!=0)
    println(names)
}








