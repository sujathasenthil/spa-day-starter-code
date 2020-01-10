package org.launchcode.spaday.controllers;

import org.launchcode.spaday.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("user")
public class UserController {

    @GetMapping("add")
    public String  displayAddUserForm(Model model){
//        model.addAttribute(new User());
        return "/user/add";
    }

    @PostMapping("add")
    public String processAddUserForm(Model model, @ModelAttribute User user, Errors errors, String verify) {
        // add form submission handling code here
//        model.addAttribute("user",user);
//        model.addAttribute("verify", verify);
//        model.addAttribute("username", user.getUsername());
//        model.addAttribute("email", user.getEmail());
        if (verify != null && verify.equals(user.getPassword())) {
            model.addAttribute("username", user.getUsername());
            return "/user/index";
        } else {
            model.addAttribute("error","Password is not matched");
            model.addAttribute("username",user.getUsername());
            model.addAttribute("email", user.getEmail());
            return "/user/add";
        }
    }
}