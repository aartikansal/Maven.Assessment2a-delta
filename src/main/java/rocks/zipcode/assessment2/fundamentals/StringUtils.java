package rocks.zipcode.assessment2.fundamentals;

/**
 * @author leon on 28/11/2018.
 */
public class StringUtils {
    /**
     * @param stringToBePadded - string value to be flushed right
     * @param amountOfPadding - amount of padding to be flushed left
     * @return `stringToBePadded` flushed right by left-padding
     */
    public static String buildPad(Integer amountOfPadding){
        StringBuilder pad= new StringBuilder();
        for(int i =0; i< amountOfPadding; i++){
            pad.append(" ");
        }
        return pad.toString();
    }
    public static String padLeft(String stringToBePadded, int amountOfPadding) {
        return buildPad(amountOfPadding-stringToBePadded.length())+stringToBePadded;
    }

    /**
     * @param stringToBePadded - string value to be flushed left
     * @param amountOfPadding - amount of padding to be flushed right
     * @return `stringToBePadded` flushed right by right-padding
     */
    public static String padRight(String stringToBePadded, int amountOfPadding) {
        return stringToBePadded +buildPad(amountOfPadding-stringToBePadded.length());
    }

    /**
     * @param stringToBeRepeated - string value to be repeated
     * @param numberOfTimeToRepeat - number of times to repeat `stringToBeRepeated`
     * @return the string repeated and concatenated `n` times
     */
    public static String repeatString(String stringToBeRepeated, int numberOfTimeToRepeat) {
        StringBuilder output= new StringBuilder();
        for(int i =0; i<numberOfTimeToRepeat; i++){
            output.append(stringToBeRepeated);
        }
        return output.toString();
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains alpha characters
     */
    public static Boolean isAlphaString(String string) {
        Boolean alpha = true;
        for (int i = 0; i < string.length(); i++) {
            String strToCheck = String.valueOf(string.charAt(i)).toUpperCase();
            if (!strToCheck.matches("[A-Z]") && !strToCheck.matches(" ")) {
                alpha = false;
            }
        }
        return alpha;
    }
    /**
     * @param string - string to be evaluated
     * @return - true if string only contains numeric characters
     */
    public static Boolean isNumericString(String string) {
       Boolean numeric= true;
       for(int i=0;i<string.length();i++){
           if(!String.valueOf(string.charAt(i)).matches(" 0-9")){
               numeric = false;
           }
       }
         return numeric;
        }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains special characters
     */
    public static Boolean isSpecialCharacterString(String string) {

        Boolean alpha = isNumericString(string);
        Boolean numeric = isNumericString(string);
        Boolean special = true;
        if(alpha || numeric) special = false;
        for(int i = 0; i<string.length();i++){
            String strToCheck = String.valueOf(string.charAt(i));
            if(strToCheck.toUpperCase().matches("[A-z]")){
                special = false;

            }
        }
        return special;




    }
}
