package controller;

import org.springframework.web.servlet.ModelAndView;
import service.TransferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TransferController {
    @Autowired
    private TransferService transferService;
    @GetMapping({"", "/transfer"})
//    public String transfer(@RequestParam(value = "money") String money, Model model){
//        double result=transferService.transfer(Double.parseDouble(money));
//        model.addAttribute("resultTransfer",result);
//        return "result";
//    }
    public ModelAndView transfer(@RequestParam String money){
        double result=transferService.transfer(Double.parseDouble(money));
//        model.addAttribute("resultTransfer",result);
        ModelAndView modelAndView1 = new ModelAndView("result","result",result);
        return modelAndView1;
    }
}
