package com.company.spring_rest_app.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

@Controller
@RequestMapping("/upload")
public class FileUploadController {

    private static Logger logger = Logger.getLogger(FileUploadController.class);

    private static final String TARGET_FOLDER = "E:/JavaStudy/spring_rest_app/target/fileUploads/";

    @GetMapping
    public String handleGetRequest() {
        return "file-upload";
    }

    @PostMapping
    public String uploadFile(@RequestParam("upload-file") MultipartFile multipartFile, Model model) throws IOException {
        String name = multipartFile.getOriginalFilename();

        if (multipartFile.getOriginalFilename().equals("")) {
            model.addAttribute("emptyFile", "Please, choose file for upload.");
            return "file-upload";
        }

        InputStream inputStream = multipartFile.getInputStream();
        Files.copy(inputStream, Paths.get(TARGET_FOLDER + name), StandardCopyOption.REPLACE_EXISTING);
        model.addAttribute("msg", "File has been uploaded:  " + name);
        return "file-uploaded";
    }
}
