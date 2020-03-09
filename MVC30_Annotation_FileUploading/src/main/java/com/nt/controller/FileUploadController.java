package com.nt.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.nt.command.FileUploadCommand;

@Controller
public class FileUploadController {
@GetMapping("/upload.htm")
public String DisplayUpload(@ModelAttribute("upcmd")FileUploadCommand cmd) {
	return "Upload_File";
}
@PostMapping("/upload.htm")
public String upload(Map<String,Object>map,@ModelAttribute("upcmd")FileUploadCommand cmd) throws IOException {
	String destDir="E:/SpringUploads";
	File destloc=null;
	InputStream is1=null,is2=null;
	String destFile1=null,destFile2=null;
	OutputStream os1=null,os2=null;
	
	//create or Locate Dest Folder on Server Machine file System
	destloc=new File(destDir);
	if(!destloc.exists()) {
		destloc.mkdirs();
	}
	//get inputstream representing the upload file
	is1=cmd.getFile1().getInputStream();
	is2=cmd.getFile2().getInputStream();
	//get original file name of upload file
	destFile1=cmd.getFile1().getOriginalFilename();
	destFile2=cmd.getFile2().getOriginalFilename();
	//create output represt destination file
	os1=new FileOutputStream(destloc.getAbsolutePath()+"/"+destFile1);
	os2=new FileOutputStream(destloc.getAbsolutePath()+"/"+destFile2);
	//copy upload file content to destination file
	IOUtils.copy(is1, os1);
	IOUtils.copy(is2, os2);
	//close stream
	is1.close();
	is2.close();
	os1.close();
	os2.close();
	//add model attribute
	map.put("fname1",destFile1);
	map.put("fname2", destFile2);
	return "show_result";
}
}
