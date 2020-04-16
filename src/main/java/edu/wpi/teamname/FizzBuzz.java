package edu.wpi.teamname;

public class FizzBuzz {
    public static String answer(int number){
        String ans = "";

        if(number%3 == 0){
            ans += "fizz";
        }

        if(number%5 == 0){
            ans += "buzz";
        }

        if(ans.equals("")){
            ans += number;
        }

        return ans;
    }
}
