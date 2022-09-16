package src;

import java.util.Scanner;

public class Main {

    public static void main (String [] args ){
        boolean play = true;
        String ongeldig = "Ongeldige invoer";
        String input;

        while (play) {
            //scanner
            Scanner scanner = new Scanner(System.in);
            //arrays
            Integer[] numeric = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
            String[] alphabetic = {"een", "twee", "drie", "vier", "vijf", "zes", "zeven", "acht", "negen", "nul"};
            //scanner output
            System.out.println("type x to stop and type v to continue");
            input = scanner.nextLine();
            if (input.equalsIgnoreCase("x")){
                break;
            }else if(input.equalsIgnoreCase("v")){System.out.println("Please insert a number from 0 to 9");
                int inputScanner = scanner.nextInt();
                System.out.println();
                //translator methode
                TransLator translate = new TransLator(alphabetic, numeric);
                String answer = translate.translate(inputScanner);
                System.out.println(answer);}
            else {
                System.out.println (ongeldig);
            }
        }
    }
}




// In je main methode een boolean variabele, een Translator object en een Scanner object;
//Je project bevat 1 Translator class met daarin constructor met 2 arrays als parameter en een translate functie;
// De logica van de applicatie wordt gedraaid in een while(boolean)-loop in je main methode.
