package com.example.UserList.controller;

import com.example.UserList.service.UserService;
import com.example.UserList.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/usuarios")
    public String mostrarUsuarios(Model model) {
        List<User> usuarios = userService.obtenerUsuarios();
        model.addAttribute("usuarios", usuarios);
        return "usuarios";
    }
}
