package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import services.CaculatorService;

@Controller
public class CaculatorController {
    @Autowired
    private CaculatorService caculatorService;

    @RequestMapping("/result")
    public String caculate(@RequestParam(required = false) Double number1, @RequestParam(required = false) Double number2, @RequestParam(value = "operator",required = false) String operator, Model model) {
        double result = caculatorService.caculator(number1, number2, operator);
        model.addAttribute("result", result);
        model.addAttribute("operator", operator);

        return "result";
    }
}
