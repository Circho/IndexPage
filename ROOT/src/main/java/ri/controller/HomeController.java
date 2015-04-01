package ri.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Controller for the home page.
 *
 * @author Jiefeng.Yu
 *
 */
@Controller
@RequestMapping("/home")
public class HomeController {

    /**
     * Method for the GET request of the home page.
     *
     * @param model
     *            Model
     */
    @RequestMapping(method = RequestMethod.GET)
    public final void get(final Model model) {

        model.addAttribute("bodyClass", "home");
    }

}
