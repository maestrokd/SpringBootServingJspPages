package demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {


    @RequestMapping("/")
    public String getIndex () {
        return "index";
    }


    @RequestMapping("/model")
    public String getModel (Model model) {
        model.addAttribute("msg",
                "a Model example");
        return "myView";
    }


    @RequestMapping("/modelandview")
    public ModelAndView getModelAndView () {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("msg",
                "a ModelAndView example");
        modelAndView.setViewName("myView");
        return modelAndView;
    }

}
