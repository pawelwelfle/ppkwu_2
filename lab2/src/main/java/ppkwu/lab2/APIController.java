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

    @GetMapping("/howMuchLowerCase")
    @ResponseBody
    public String checkingLower(@RequestParam String myString) {
        int lowerCase = 0;
        for (int k = 0; k < myString.length(); k++) {
            if (Character.isLowerCase(myString.charAt(k))) lowerCase++;
        }
        return "Lower Cases: " + lowerCase;
    }


    @GetMapping("/howMuchUpperCase")
    @ResponseBody
    public String checkingUpper(@RequestParam String myString) {
        int upperCase = 0;
        for (int k = 0; k < myString.length(); k++) {
            if (Character.isUpperCase(myString.charAt(k))) upperCase++;
        }
        return "Upper Cases: " + upperCase;
    }


}
