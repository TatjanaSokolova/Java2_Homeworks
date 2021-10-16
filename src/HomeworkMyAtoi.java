import static java.lang.Integer.MAX_VALUE;
import static java.lang.Integer.MIN_VALUE;

public class HomeworkMyAtoi {

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Please enter a string: ");
//        String s = scanner.nextLine();

        //TESTS
        String s = "023";
        myAtoi(s);
        String a = "-23";
        myAtoi(a);
        String z = "876586876587658656888887585";
        myAtoi(z);
        String k = "-45658687658746656888846";
        myAtoi(k);
        String x = " 77777";
        myAtoi(x);
        String g = "kjhg555fgjc";
        myAtoi(g);
        String f = "-8888gggggg";
        myAtoi(f);
        String y = " 565yt65";
        myAtoi(y);
        String r = "9876  0987";
        myAtoi(r);
    }

    /**
     * Method myAtoi converts input string to an integer
     * @param s - String input by user
     * @return - integer
     */

    public static int myAtoi(String s) {

        //delete leading whitespace
        s = s.trim();

        //figure out will the integer be negative or not
        boolean isNegative = false;
        if (s.charAt(0) == '-') {
            isNegative = true;
            s = s.replace("-", "");
        }

        // if next character is not a digit result = 0
        String string2 = "";
        if (Character.toString(s.charAt(0)).matches("[0-9]+")) {
            string2 = s;
        } else {
            string2 = "0";
            System.out.println("(Not a digit , output is 0)");
        }

        //removing everything but digits
        string2 = string2.replaceAll("[^0-9]", "");


        //converting string to an int
        int i;
        try {
            i = Integer.valueOf(string2);
            if (isNegative) {
                i = -i;
            }
                System.out.println("Your integer is " + i);

        } catch (NumberFormatException nfe) {
            if (isNegative) {
                i = MIN_VALUE;
            } else {
                i = MAX_VALUE;
            } System.out.println("Your integer is " + i);
        }
        return i;
    }
}

