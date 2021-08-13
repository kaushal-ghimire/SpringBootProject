package com.rimesh.student.controller;
import com.rimesh.student.entities.User;
import com.rimesh.student.repository.UserRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SignUpController {

    private  final UserRepository repo;

    public SignUpController(UserRepository repo) {
        this.repo = repo;
    }


    @GetMapping("/register")
    public String showSignUpForm(Model model) {
        model.addAttribute("user", new User());
        return "Signup_form";
    }

    @PostMapping("/process_register")
    public String processRegistration(User user) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String encodedPassword=encoder.encode(user.getPassword());
        user.setPassword(encodedPassword);
        repo.save(user);
        return "login";
    }
    @GetMapping("/teachers")
    public String teacher(Model model) {
        model.addAttribute("user", new User());
        return "teacher";
    }
    @GetMapping("/students")
    public String student(Model model) {
        model.addAttribute("user", new User());
        return "student";
    }

    @GetMapping("/nurserys")
    public String nursery(Model model) {
        model.addAttribute("user", new User());
        return "nursery";
    }

    @GetMapping("/addStudents")
    public String studentAdd(Model model) {
        model.addAttribute("user", new User());
        return "studentAdd";
    }

    @GetMapping("/addTeachers")
    public String teacherAdd(Model model) {
        model.addAttribute("user", new User());
        return "teacherAdd";
    }
}
