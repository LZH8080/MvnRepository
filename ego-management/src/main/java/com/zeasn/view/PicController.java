package com.zeasn.view;

import java.io.File;
import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import com.zeasn.bean.Pic;
import com.zeasn.service.PicService;

@Controller
public class PicController {
	@Resource
	private PicService picServiceImpl;
	@RequestMapping("insert")
	public String insert(MultipartFile file,HttpServletRequest request) {
		try {
			FileUtils.copyInputStreamToFile(file.getInputStream(), new File(request.getServletContext().getRealPath("files"),file.getOriginalFilename()));
		} catch (IOException e) {
			e.printStackTrace();
		}
		Pic pic = new Pic();
		pic.setPath(file.getOriginalFilename());
		int code = picServiceImpl.insPic(pic);
		if(code>0) {
			return "redirect:/show";
		}else {
			return "add.jsp";
		}
	}
	@RequestMapping("show")
	public String show(Model model) {
		model.addAttribute("list", picServiceImpl.selAll());
		return "main.jsp";
	}
	@RequestMapping("delete")
	public String delete(int id) {
		//int code = picServiceImpl.delByid(id);
		picServiceImpl.delByid(id);
		return "redirect:/show";

		
	}
}
