package util;

import constant.IConstant;

import java.util.Calendar;

public class Helper {

    /**
     * Don't let anyone instantiate this class.
     */
    private Helper() {
    }

    /**
     * Prints the menu.
     */
    public static void menu() {
        System.out.println("\nCANDIDATE MANAGEMENT SYSTEM");
        System.out.println("1. Experience");
        System.out.println("2. Fresher");
        System.out.println("3. Internship");
        System.out.println("4. Searching");
        System.out.println("5. Exit");
    }

    /**
     * Returns continue option.
     *
     * @param messageInfo  the message to be printed instructing the user to input
     * @param messageError the message will be printed if the input does not match the regular expression
     * @return <code>true</code> if value input is [y] or [Y]; <code>false</code> otherwise
     */
    public static boolean isContinue(String messageInfo, String messageError) {
        String option = Validate.getString(messageInfo, messageError, IConstant.REGEX_YES_NO);
        return option.equalsIgnoreCase(IConstant.YES);
    }

    /**
     * Returns the current year.
     *
     * @return the integer value is the current year
     */
    public static int getCurrentYear() {
        return Calendar.getInstance().get(Calendar.YEAR);
    }
}
