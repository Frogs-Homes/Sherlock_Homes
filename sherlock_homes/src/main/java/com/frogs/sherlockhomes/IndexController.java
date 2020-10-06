package com.frogs.sherlockhomes;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	
	@RequestMapping("/")
	public String index(Model model) {
		model.addAttribute(Const.TITLE, "셜록 홈즈");
		model.addAttribute(Const.VIEW, "index");
		return ViewRef.TEMP_DEFAULT;
	}
}