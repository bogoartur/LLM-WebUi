package llmwebui.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import llmwebui.service.MensagemService;

@Controller
@RequestMapping("/")
public class MensagemController {
    @Autowired
    private MensagemService service;

    @GetMapping
    public ModelAndView index() {
        //var listaMensagens = service.getAll();
        return new ModelAndView("home/index");
    }
}
