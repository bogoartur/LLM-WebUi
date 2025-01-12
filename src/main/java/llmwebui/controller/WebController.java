package llmwebui.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WebController {
///Temporario ate eu ter o react funcionando
    @GetMapping("/")
    public ModelAndView index() {
        return new ModelAndView("home/index");
    }
}
