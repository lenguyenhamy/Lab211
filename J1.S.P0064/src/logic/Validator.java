package logic;

import exception.PhoneNumberMaxLengthException;
import util.Validate;

public class Validator {

    public String getPhoneNumber() {
        do {
            try {
                return Validate.getPhoneNumber(
                        "Phone number: ",
                        "Phone number must is number",
                        "Phone number must be 10 digits",
                        Validate.REGEX_NUMBER
                );
            } catch (NumberFormatException | PhoneNumberMaxLengthException e) {
                System.out.println(e.getMessage());
            }
        } while (true);
    }

    public String getEmail() {
        return Validate.getString(
                "Email: ",
                "Email must is correct format.",
                Validate.REGEX_EMAIL
        );
    }

    public String getDate() {
        return Validate.getString(
                "Date: ",
                "Date to correct format (dd/mm/yyyy)",
                Validate.REGEX_DATE
        );
    }
}
