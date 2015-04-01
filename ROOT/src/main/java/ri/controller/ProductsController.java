package ri.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Controller for the Ireland Impression page.
 *
 * @author Jiefeng.Yu
 *
 */
@Controller
@RequestMapping("/products")
public class ProductsController {

    /**
     * Method to display the products page.
     *
     * @param model
     *            Model.
     */
    @RequestMapping(method = RequestMethod.GET)
    public final void get(final Model model) {
        // empty. view auto resolved by default RequestToViewNameTranslator.
        model.addAttribute("bodyClass", "products");
    }
}
