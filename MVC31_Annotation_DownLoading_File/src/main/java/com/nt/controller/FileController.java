package com.nt.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.nt.service.ListFileService;
@Controller("controller")
public class FileController {
	@Autowired
	private ListFileService service;
	
	@RequestMapping("/home.htm")
	public String displayform(Map<String, Object>map) {
		List<String> filelist=null;
		//use service
		filelist=service.getAllFileNmaes();
		//keep in model attribute
		map.put("Listfiles", filelist);
		return "file_download_form";
		
	}
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

}
