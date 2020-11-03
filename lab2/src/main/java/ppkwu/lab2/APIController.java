package ppkwu.lab2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author pawel.welfle
 */

@RestController
public class APIController {

    /**
     * method to get info about signs
     */

    @GetMapping("/check")
    @ResponseBody
    public String checkMyString(@RequestParam String myString) {
        return myString;
    }

    /**
     * method to get info about lower signs amount
     */
    @GetMapping("/lowers")
    @ResponseBody
    public String checkingLower(@RequestParam String myString) {
        int lowerCase = 0;
        for (int k = 0; k < myString.length(); k++) {
            if (Character.isLowerCase(myString.charAt(k))) lowerCase++;
        }
        return "Amount of Lower Cases Letters: " + lowerCase;
    }

    /**
     * method to get info about upper signs amount
     */
    @GetMapping("/uppers")
    @ResponseBody
    public String checkingUpper(@RequestParam String myString) {
        int upperCase = 0;
        for (int k = 0; k < myString.length(); k++) {
            if (Character.isUpperCase(myString.charAt(k))) upperCase++;
        }
        return "Amount of Upper Cases Letters: " + upperCase;
    }

    /**
     * method to get info about digits amount
     */
    @GetMapping("/digits")
    @ResponseBody
    public String checkingDigits(@RequestParam String myString) {
        int digitsAmount = 0;
        for (int k = 0; k < myString.length(); k++) {
            if (Character.isDigit(myString.charAt(k))) digitsAmount++;
        }
        return "Amount of digits: " + digitsAmount;
    }

    /**
     * method to get info about specials signs amount
     */
    @GetMapping("/specials")
    @ResponseBody
    public String checkingSpecials(@RequestParam String myString) {
        int specials = 0;
        for (int k = 0; k < myString.length(); k++) {
            if (!Character.isDigit(myString.charAt(k))
                    && !Character.isUpperCase(myString.charAt(k))
                    && !Character.isLowerCase(myString.charAt(k))) {
                specials++;
            }
        }
        return "Amount of specials: " + specials;
    }

    /**
     * method to get info about all signs in string
     */
    @GetMapping("/analize")
    @ResponseBody
    public String stringAnalize(@RequestParam String myString) {
        checkingUpper(myString);
        checkingLower(myString);
        checkingDigits(myString);
        checkingSpecials(myString);

        return "Analize of given string: " + myString + "<br>"
                + checkingUpper(myString) + "<br>" +
                checkingLower(myString) + "<br>" +
                checkingDigits(myString) + "<br>" +
                checkingSpecials(myString);
    }


}
