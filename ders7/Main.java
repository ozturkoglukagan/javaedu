public class Main {
    //eğer bir metodu mainde çağıracaksan statik olmalı
    public static void main(String[] args) {
        // Human trialHuman = new Human("ismail",180,70);
      
        // System.out.println(trialHuman.ID);
        // System.out.println(trialHuman.name);
        // trialHuman.name = "kaan";
        // System.out.println(trialHuman.name);
        // Human beste = new Human("beste", 200, 45);
        // int result = toplama(15,6);
        // System.out.println(carpma(result, 10));
        Account trial = new Account(999999, "kaan","TRY", 100);
        trial.deposit(50);
        trial.withdraw(500);
        trial.close();
    }

    // public static int toplama(int a,int b) {
    //    return a+b; 
    // }

    // public static int carpma(int a, int b) {
    //     return a*b;
    // }
}
