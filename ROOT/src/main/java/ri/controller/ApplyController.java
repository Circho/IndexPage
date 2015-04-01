package ri.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Controller for the immigration apply page.
 *
 * @author Jiefeng.Yu
 *
 */
@Controller
@RequestMapping("/apply")
public class ApplyController {

    /**
     * Method to display the page.
     *
     * @param model
     *            Model.
     */
    @RequestMapping(method = RequestMethod.GET)
    public final void get(final Model model) {
        // empty. view auto resolved by default RequestToViewNameTranslator.

        model.addAttribute("bodyClass", "apply");
    }
}
