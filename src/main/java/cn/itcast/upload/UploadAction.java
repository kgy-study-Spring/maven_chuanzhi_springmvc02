package cn.itcast.upload;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

/**
 * 文件上传
 * @author Administrator
 *
 */
@Controller
public class UploadAction {

	public UploadAction() {
		System.out.println("UploadAction.UploadAction()");
	}
	
	@RequestMapping("/upload")
	public String upload(@RequestParam("file") MultipartFile file) throws Exception{
		try {
			FileUtils.copyInputStreamToFile(file.getInputStream(), new File("D:/"+file.getOriginalFilename()));
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(file.getOriginalFilename());
		return "/jsp/ok.jsp";
	}
	
	@RequestMapping("/uploadFiles")
	public String upload(@RequestParam("file") MultipartFile[] file) throws Exception{
		for (MultipartFile multipartFile : file) {
			System.out.println(multipartFile.getOriginalFilename());
		}
		return "/jsp/ok.jsp";
	}
}
