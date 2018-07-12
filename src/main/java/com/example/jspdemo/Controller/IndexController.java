package com.example.jspdemo.Controller;

import com.example.jspdemo.Service.IdeasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class IndexController {
    private final IdeasService ideasService;

    @Autowired
    public IndexController(IdeasService ideasService) {
        this.ideasService = ideasService;
    }

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @PostMapping("/")
    public String getIdeas(@RequestParam("num") int count, Model model) {
        List<String> ideas = ideasService.getIdeas(count);

        if (ideas.size() < count) {
            model.addAttribute("warning", String.format("Woah there. We only have %d suggestions.", ideas.size()));
        }

        if (count <= 0) {
            model.addAttribute("error", "Please play nice and pick a valid number starting from 1");
        }

        model.addAttribute("ideas", ideas);

        return "index";
    }
}
