package interfaceenhancement.ex;

public class Account {
    private Double balance;  //by using private modifier we can achive data hiding ->which is Data hiding
    public Double getBalance(){
        return balance;
    }
    public void deposite(Double amount){
        this.balance=this.balance+amount;  //here we call this.balance which is Abstraction
    }
    //this is a Real time example of Abstraction

}
