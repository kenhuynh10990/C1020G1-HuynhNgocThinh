package controller;

import model.Email;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class EmailController {
        @GetMapping("/showform")
        public String showForm(Model model){
            model.addAttribute("mail",new Email());
            List<String> listLanguage= new ArrayList<>();
            listLanguage.add("English");
            listLanguage.add("Chinese");
            listLanguage.add("Japanese");
            listLanguage.add("Vietnamese");

            List<String> listPageSize=new ArrayList<>();
            listPageSize.add("5");
            listPageSize.add("10");
            listPageSize.add("15");
            listPageSize.add("25");
            listPageSize.add("50");
            listPageSize.add("100");
            model.addAttribute("listPageSize",listPageSize);
            model.addAttribute("listLanguage",listLanguage);
            return "create";
        }
    @PostMapping("/addEmail")
    public String update(@ModelAttribute("mail") Email email, Model model){
        model.addAttribute("language",email.getLanguage());
        model.addAttribute("pageSize",email.getPageSize());
        model.addAttribute("spamFilter",email.getSpamFilter());
        model.addAttribute("signature",email.getSignature());
        return "/info";
    }
}
