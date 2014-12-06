package hackerrank;


import java.util.Scanner;

public class ChocolateFeast {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i = 0; i < t; i++){
            System.out.println(Solve(in.nextInt(), in.nextInt(), in.nextInt()));
        }
    }

    private static long Solve(int money, int chocolatePrice, int wrappersForChocolate){
        int wrappersHeld = 0;
        int chocolatesEaten = 0;
        while(money >= chocolatePrice || wrappersHeld >= wrappersForChocolate){
            if(money >= chocolatePrice){ //can buy
                int toBuy = money / chocolatePrice;
                money -= chocolatePrice * toBuy;
                chocolatesEaten += toBuy;
                wrappersHeld += toBuy;
            }
            if(wrappersHeld >= wrappersForChocolate){//can change wrappers for chocolate -=
                int toExchange = wrappersHeld / wrappersForChocolate;
                wrappersHeld -= toExchange * wrappersForChocolate;
                chocolatesEaten += toExchange;
                wrappersHeld += toExchange;
            }
        }
        return chocolatesEaten;
    }
}
