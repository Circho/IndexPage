package ri.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Controller for the latest news page.
 *
 * @author Jiefeng.Yu
 *
 */
@Controller
@RequestMapping("/news")
public class NewsController {

    /**
     * Method to display the page.
     *
     * @param model
     *            Model.
     */
    @RequestMapping(method = RequestMethod.GET)
    public final void get(final Model model) {
        // empty. view auto resolved by default RequestToViewNameTranslator.

        model.addAttribute("bodyClass", "news");
    }
}
