/**
 * Created by surya on 11/28/17.
 */
public class AddingString {

    public final static String Equation = "1234567 abc+efg";

    public static void main(String[] args) {
        String translatedEquation = TranslateEquation(Equation);
        int result = CalculateEquation(translatedEquation);
        System.out.println("Input = " + Equation);
        System.out.println("Translated = " + translatedEquation);
        System.out.println("Result = " + result);
    }

    public static String TranslateEquation(String equation) {
        char[] values = equation.substring(0, equation.indexOf(" ")).toCharArray();
        char[] result = equation.substring(equation.indexOf(" ") + 1).toCharArray();

        for(int i=0, j=0; i<result.length; i++) {
            if( Character.isLetter(result[i]) ) {
                result[i] = values[j++];
            }
        }

        return new String(result);
    }

    public static int CalculateEquation(String equation) {
        int result = 0;
        int opIndex = IndexOfOperation(equation);
        int left = Integer.parseInt( equation.substring(0,opIndex) );
        int right = Integer.parseInt( equation.substring(opIndex+1) );

        char opChar = equation.charAt(opIndex);
        switch(opChar) {
            case '+':
                result = left + right;
                break;
            case '-':
                result = left - right;
                break;
            case '*':
                result = left * right;
                break;
            case '/':
                result = left / right;
                break;
            default:
                break;
        }

        return result;
    }

    public static int IndexOfOperation(String equation) {
        int i=0;
        while( Character.isDigit(equation.charAt(i)) ) {
            i++;
        }

        return i;
    }

}
