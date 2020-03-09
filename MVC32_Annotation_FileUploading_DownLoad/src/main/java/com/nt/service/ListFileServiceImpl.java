package com.nt.service;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service("service")
public class ListFileServiceImpl implements ListFileService {
	@Override
	public List<String> getAllFileNmaes() {
		String destPath="E:/SpringUploads";
		File file=null;
		File allname[]=null;
		List filenamelist=null;
		file=new File(destPath);
		allname=file.listFiles();
		filenamelist=new ArrayList();
		for(File f:allname) {
			if(f.isFile()) {
				filenamelist.add(f.getName());
			}
			
		}
		return filenamelist;
	}

}
