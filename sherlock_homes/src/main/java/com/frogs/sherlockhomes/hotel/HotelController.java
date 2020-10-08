package com.frogs.sherlockhomes.hotel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.frogs.sherlockhomes.Const;
import com.frogs.sherlockhomes.ViewRef;

@Controller
@RequestMapping("/hotel")
public class HotelController {

		@Autowired
		private HotelService service;
		
		@RequestMapping("/map")
		public String hotelMap(Model model) {
			model.addAttribute(Const.TITLE, "지도 보기");
			model.addAttribute(Const.VIEW, "hotel/map"); // jsp 파일 위치
			return ViewRef.TEMP_DEFAULT;
		}
}
