import javax.swing.JOptionPane;

public class PasswordDemo{

    public static void main(String[] args){

        String input; //To hold the user's input

        input = JOptionPane.showInputDialog("Enter a Password");

            if (PasswordVerifier.isValid(input)){
                JOptionPane.showMessageDialog(null, "Valid Password");
            }
            else{
                JOptionPane.showMessageDialog(null, "invalid Password, try again.");
            }           
            
        System.out.println(PasswordVerifier.isValid(input));
    }}