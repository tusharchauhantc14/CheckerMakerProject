package com.checkermaker.formBean;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.commons.CommonsMultipartFile;


public class FileUpload {
    private String fileName;
    private CommonsMultipartFile fileData;

    public FileUpload(CommonsMultipartFile fileData) {
        this.fileData = fileData;
    }

    public FileUpload() {
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public CommonsMultipartFile getFileData() {
        return fileData;
    }

    public void setFileData(CommonsMultipartFile fileData) {
        this.fileData = fileData;
    }

    @Override
    public String toString() {
        return "FileUpload{" +
                "fileName='" + fileName + '\'' +
                ", fileData=" + fileData +
                '}';
    }
}

