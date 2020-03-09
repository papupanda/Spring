package com.nt.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.nt.command.FileUploadCommand;
import com.nt.service.ListFileService;
@Controller("controller")
public class FileController {
	@Autowired
	private ListFileService service;
	@RequestMapping("/first.htm")
	public String ShowForm() {
		return "Show";
	}
	
	
	//downloading relevant request
	@RequestMapping("/home.htm")
	public String displayform(Map<String, Object>map) {
		List<String> filelist=null;
		//use service
		filelist=service.getAllFileNmaes();
		//keep in model attribute
		map.put("Listfiles", filelist);
		return "file_download_form";
		
	}
	//download
	@RequestMapping("/download.htm")
	public String download(@RequestParam("file")String fileName,HttpServletResponse res,HttpServletRequest req) throws IOException {
		File file=null;
		InputStream is=null;
		OutputStream os=null;
		//create inputStream pointing to the file to be download
		file=new File("E:/springuploads/"+fileName);
		//get the length of file and make it response content length
		res.setContentLengthLong(file.length());
		//get MIME type of the file and make response contentnt type
		ServletContext sc=req.getServletContext();
		res.setContentType(sc.getMimeType("E:/springuploads/"+fileName));
		//set Content-Dispostion header value with "attachment"
		res.setHeader("Content-Disposition", "attachment;fileName="+fileName);
		//create InputStream pointing to the file to be downloaded
		is=new FileInputStream(file);
		//create OutputStream pointing to response object
		os=res.getOutputStream();
		//write the content of File to downloaded to response obj
		IOUtils.copy(is, os);
		//close stream
		is.close();
		os.close();
		return null;
	}
	
	//uploading intial request
	@GetMapping("/upload.htm")
	public String DisplayUpload(@ModelAttribute("upcmd")FileUploadCommand cmd) {
		return "Upload_File";
	}
	//upload postback request
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
