import java.util.*;

public class PasswordVerifier{

    //field
    private static int MIN_PASSWORD_LENGTH = 6;

    //methods
    public static boolean isValid(String str){

        boolean valid = false;

        PasswordVerifier pass = new PasswordVerifier();

        if(pass.hasUpperCase(str)&& pass.hasLowerCase(str) && pass.hasDigit(str)){
            valid = true;
        }

        if (str.length() < 6){
            valid = false;
        }

        return valid;

    }

    //UpperCase Boolean check
    private boolean hasUpperCase(String str){

        boolean valid = false;

        int i = 0;

        while (i < str.length()){
            if (Character.isUpperCase(str.charAt(i)))
            {valid = true;
            break;
        }   
        i++;}

        return valid;
    }

    //Lowercase Boolean Check
    private boolean hasLowerCase(String str){

        boolean valid = false;

        int i = 0;

        while (i < str.length()){
            if (Character.isLowerCase(str.charAt(i))){
            valid = true;
            break;
        }   
        i++;
    }
        return valid;
    }

    //Number boolean check
    private boolean hasDigit(String str){

        boolean valid = false;

        int i = 0;

        while (i < str.length()){
            if ((Character.isDigit(str.charAt(i)))){
            valid = true;
            break;
        }   
        i++;
    }
        return valid;

    }   

}