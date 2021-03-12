package com.example.demo.controller;

import com.example.demo.model.AppUser;
import com.example.demo.model.Blog;
import com.example.demo.repository.AppUserRepository;
import com.example.demo.service.BlogService;
import com.example.demo.service.CategoriesService;
import com.example.demo.util.WebUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;


import java.security.Principal;
import java.util.Date;

//@RestController
@Controller
public class BlogController {
    @Autowired
    private BlogService blogService;
    @Autowired
    private CategoriesService categoriesService;
    @Autowired
    private AppUserRepository userRepository;

    @GetMapping("/create")
    public ModelAndView showCreateForm(Pageable pageable) {
        ModelAndView modelAndView = new ModelAndView("/create");
        modelAndView.addObject("categories", categoriesService.findAll(pageable));
        modelAndView.addObject("blog", new Blog());
        return modelAndView;
    }

    //
    @PostMapping("/create")
    public ModelAndView save(Blog blog) {
        blog.setDate(new Date());
        blogService.save(blog);
        ModelAndView modelAndView = new ModelAndView("redirect:/");

        modelAndView.addObject("blog", new Blog());

        return modelAndView;
    }

    //    @GetMapping("/")
//    public ResponseEntity<List<Blog>> listAllBlog(){
//        List<Blog> blogs = blogService.findAll();
//        if (blogs.isEmpty()){
//            return new ResponseEntity<List<Blog>>(HttpStatus.NO_CONTENT);
//        }else {
//            return new ResponseEntity<List<Blog>>(blogs,HttpStatus.OK);
//        }
//    }
//
//    @GetMapping("/view/{id}")
//    public ResponseEntity<Blog> viewBlog(@PathVariable int id){
//        Blog blog =blogService.findById(id);
//        if (blog==null){
//            return new ResponseEntity<Blog>(HttpStatus.NO_CONTENT);
//        }else {
//            return new ResponseEntity<Blog>(blog,HttpStatus.OK);
//        }
//    }
    @GetMapping("/")
    public String list(Model model, @PageableDefault(size = 2, sort = "date") Pageable pageable) {
//
        model.addAttribute("blog", blogService.findAll(pageable));
//            model.addAttribute("category", categoriesService.findAll(pageable));
        return "/list";
//        }
    }


//    @RequestMapping(value="/setSearch/search", method=RequestMethod.POST)
//    public @ResponseBody String search (@RequestParam String textSearch, ModelMap model,Pageable pageable)
//    {
//        Page<Blog> blogs =  blogService.findAllByTextContaining(textSearch,pageable);
//        model.put("searchResult", questionAnswerSetByQuestion);
//
//        return "setSearch";
//    }

    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable int id, Model model, Pageable pageable) {
        Blog blog = blogService.findById(id);
        if (blog != null) {
            model.addAttribute("categories", categoriesService.findAll(pageable));
            model.addAttribute("blog", blog);
            return "/edit";
        } else {
            return "/error";
        }
    }

    @PostMapping("/edit")
    public String update(Blog blog, Model model) {
        blogService.save(blog);
        model.addAttribute("blog", blog);
        model.addAttribute("message", "Blog updated");
        return "redirect:/";
    }

    @GetMapping("/delete/{id}")
    public String showDeleteForm(@PathVariable int id, Model model) {
        Blog blog = blogService.findById(id);
        if (blog != null) {
            model.addAttribute("blog", blog);
            return "/delete";
        } else {
            return "/delete";
        }
    }

    @PostMapping("/delete")
    public String delete(Blog blog) {
        blogService.remove(blog.getId());
        return "redirect:/";
    }

    @GetMapping("/view/{id}")
    public String viewForm(@PathVariable int id, Model model) {
        model.addAttribute("blog", blogService.findById(id));
        return "/viewBlog";
    }

    @GetMapping("/login")
    public String loginPage(Model model) {
        return "login";
    }


    @GetMapping("/logoutSuccessful")
    public String logoutSuccessfulPage(Model model) {
        model.addAttribute("title", "logout");
        return "logout";
    }


    @RequestMapping(value = "/403", method = RequestMethod.GET)
    public String accessDenied(Model model, Principal principal) {

        if (principal != null) {
            User loginedUser = (User) ((Authentication) principal).getPrincipal();

            String userInfo = WebUtils.toString(loginedUser);

            model.addAttribute("userInfo", userInfo);

            String message = "Hi " + principal.getName() //
                    + "<br> You do not have permission to access this page!";
            model.addAttribute("message", message);

        }

        return "403Page";
    }
}
