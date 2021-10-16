import java.util.Scanner;

public class ArabicToRoman {
    public static void main(String[] args) {

//        System.out.println("Please enter a number: ");
//        Scanner scan = new Scanner(System.in);
//        int num = scan.nextInt();
//        System.out.println(romanString(num));

//      TESTS
        System.out.println(romanString(76));
        System.out.println(romanString(5));
        System.out.println(romanString(897));
        System.out.println(romanString(3999));
        System.out.println(romanString(-725));
        System.out.println(romanString(5987));
    }

    /**
     * Method romanString converts an integer input by user into a Roman digit. It contains 4 dictionaries (arrays)
     * with roman numbers for each class (units, hundreds...)
     * @param num - int number provided by user
     * @return String in roman numerals
     */
    static String romanString(int num) {

        if (num < 0 || num > 3999) {
           return "Wrong number! Enter a number 1-3999";
       } else {

            // creating a dictionary for  thousands, hundreds, tens and units
            String[] thousandsdict = {"", "M", "MM", "MMM"};
            String[] hundredsdict = { "", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
            String[] tensdict = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
            String[] unitsdict = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};

            // counting number of units of each class which will also define an index in array
            int thousandsInt = num / 1000;
            int hundredsInt = (num % 1000) / 100;
            int tensInt = (num % 100) / 10;
            int unitsInt = num % 10;

            //finding roman number in relevant array by it's index
            String thousands = thousandsdict[thousandsInt];
            String hundereds = hundredsdict[hundredsInt];
            String tens = tensdict[tensInt];
            String units = unitsdict[unitsInt];

            // concats into one final string
            String finalString = (thousands + hundereds + tens + units);
            return "Your Roman integer is: " + finalString;
        }
    }
}