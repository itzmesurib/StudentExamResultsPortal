package com.example.studentexamresultsportal.controller;

import com.example.studentexamresultsportal.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Controller
public class AdminController {

    @Autowired
    private AdminService adminService;

    // Display the admin dashboard
    @GetMapping("/admin/dashboard")
    public String showDashboard(Model model) {
        return "admin/dashboard";
    }

    // Show the form to upload exam results
    @GetMapping("/admin/upload-results")
    public String showUploadResultsForm() {
        return "admin/upload-results";
    }
    
    // Handle file upload for exam results
    @PostMapping("/admin/upload-results")
    public String uploadResults(@RequestParam("file") MultipartFile file,
                                @RequestParam("examDate") String examDate,
                                @RequestParam("totalMarks") int totalMarks,
                                Model model) throws IOException {
        // Process the file and other form data
        adminService.processFile(file, examDate, totalMarks);
        model.addAttribute("message", "File uploaded and results processed successfully.");
        return "admin/upload-results";
    }

    @GetMapping("/admin/manage-results")
    public String showManageResults(Model model) {
        return "admin/manage-results";
    }
    
    @GetMapping("/admin/view-performance")
    public String viewPerformance() {
        return "admin/view-performance";
    }
    
    @GetMapping("/admin/login")
    public String showAdminLoginPage() {
        return "admin-login";
    }

    @PostMapping("/admin/logout")
    public String logout() {
        return "redirect:/admin/login?logout";
    }
}
