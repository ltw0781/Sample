package com.aloha.board.controller;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.boot.autoconfigure.ssl.SslProperties.Bundles.Watch.File;
// import org.springframework.http.MediaType;
// import org.springframework.stereotype.Controller;
// import org.springframework.util.FileCopyUtils;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.RequestMapping;

// import com.aloha.board.dto.Files;
// import com.aloha.board.service.FileService;

// import jakarta.servlet.ServletOutputStream;
// import jakarta.servlet.http.HttpServletResponse;
// import lombok.extern.slf4j.Slf4j;

import java.io.File;
import java.io.FileInputStream;

import org.apache.catalina.util.URLEncoder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.aloha.board.dto.Files;
import com.aloha.board.service.FileService;

import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/file")
public class FIleController {
    
    @Autowired
    private FileService fileService;

    @GetMapping("/{no}")
    public void fileDownload(@PathVariable("no") int no
                               ,HttpServletResponse response) throws Exception {

        Files downloadFile = fileService.download(no);

        // 파일이 없으면,
        if ( downloadFile == null) {
            return;
        }

        // 파일 경로, 파일 명
        String fileName = downloadFile.getFileName();   // 파일 이름
        String filePath = downloadFile.getFilePath();   // 파일 경로

        // 다운로드를 위한 응답 헤더 세팅
        // - ContentType            : application/octect-s
        response.setContentType(MediaType.APPLICATION_OCTET_STREAM_VALUE);

        // fileName = URLEncoder.encode(fileName, "UTF-8");

        response.setHeader("Content-Disposition", "attachment; filename=\"" + fileName + "\"");



        // 파일 다운로드
        File file = new File(filePath);
        FileInputStream fis = new FileInputStream(file);        // 파일 입력
        ServletOutputStream sos = response.getOutputStream();   // 파일 출력
        FileCopyUtils.copy(fis, sos);

        fis.close();
        sos.close();

    }
    

}
