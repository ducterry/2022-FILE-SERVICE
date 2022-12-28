package com.ndangducbn.service;

import com.ndangducbn.exception.FileStorageException;
import com.ndangducbn.exception.MyFileNotFoundException;
import com.ndangducbn.config.FileStorageProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;
import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;


public interface FileStorageService {
    public String storeFile(MultipartFile file);

    public Resource loadFileAsResource(String fileName);
}
