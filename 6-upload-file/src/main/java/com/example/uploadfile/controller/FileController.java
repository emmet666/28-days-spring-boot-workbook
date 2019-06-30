package com.example.uploadfile.controller;

import com.example.uploadfile.service.FileService;
import lombok.extern.slf4j.Slf4j;
import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.UUID;

/**
 * @author zejun.shu
 * @class UploadFileController
 * @date 2019-06-30
 **/

@Slf4j
@RestController
public class FileController {

	@Autowired
	private FileService uploadFileService;

	@PostMapping(value = "/")
	public String update(@RequestParam("uploadFile") MultipartFile multipartFile) {
		String targetFilePath = "./uploadTest";
		String fileName = UUID.randomUUID().toString().replace("-", "");
		File targetFile = new File(targetFilePath + File.separator + fileName);

		FileOutputStream fileOutputStream = null;
		try {
			fileOutputStream = new FileOutputStream(targetFile);
			IOUtils.copy(multipartFile.getInputStream(), fileOutputStream);
			log.info("------>>>>>>uploaded a file successfully!<<<<<<------");
		} catch (IOException e) {
			return "error";
		} finally {
			try {
				fileOutputStream.close();
			} catch (IOException e) {
				log.error("", e);
			}
		}
		return "success";
	}

	public void download() {

	}
}
