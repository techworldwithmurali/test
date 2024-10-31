package com.murali.users.controller;

import com.murali.users.model.User; // Adjust import based on your model package
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("/showNewUserForm")
    public String showNewUserForm(Model model) {
        model.addAttribute("user", new User());
        return "new_user"; // Corresponds to your new_user.html
    }

    // Add other methods here
}
