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

}
