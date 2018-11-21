package com.taotao.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.taotao.common.pojo.EUTreeNode;
import com.taotao.common.pojo.TaotaoResult;
import com.taotao.service.ContentCategoryService;

@RequestMapping("/content/category")
@Controller
public class ContentCategoryController {

	@Autowired
	ContentCategoryService contentCategoryService;
	
	@RequestMapping("/list")
	@ResponseBody
	public List<EUTreeNode> getContentCatList(@RequestParam(value="id",defaultValue="0") Long parentId){
		List<EUTreeNode> list = contentCategoryService.getCategoryService(parentId);
		return list;
	}
	
	@RequestMapping("/create")	
	@ResponseBody
	public TaotaoResult createContentCategory(Long parentId,String name){
		TaotaoResult result = contentCategoryService.insertContentCategory(parentId, name);
		return result;
	}
	
	
}
