package com.example.studentexamresultsportal.service;

import com.example.studentexamresultsportal.model.Admin;
import com.example.studentexamresultsportal.model.Student;
import com.example.studentexamresultsportal.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class AdminService {
    @Autowired
    private AdminRepository adminRepository;

    public Admin getAdminByUsername(String username) {
        return adminRepository.findByUsername(username);
    }

    public void uploadResults(MultipartFile file) {
        // Logic to read Excel file and save results to database
    }

	public void addStudent(Student student) {
		// TODO Auto-generated method stub
		
	}

	public void updateStudent(Student student) {
		// TODO Auto-generated method stub
		
	}

	public void processFile(MultipartFile file, String examDate, int totalMarks) {
		// TODO Auto-generated method stub
		
	}

	
}
