package ri.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Controller for the home page.
 *
 * @author Jiefeng.Yu
 *
 */
@Controller
@RequestMapping("/")
public class DefaultController {

    /**
     * Method for the GET request of the home page.
     *
     * @return modelAndView
     *            ModelAndView
     */
    @RequestMapping(method = RequestMethod.GET)
    public final ModelAndView get() {
        ModelAndView modelAndView = new ModelAndView();

        modelAndView.setViewName("home");
        modelAndView.addObject("bodyClass", "home");

        return modelAndView;
    }
}
