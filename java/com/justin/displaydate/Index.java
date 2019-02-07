package com.justin.displaydate;

import java.text.DateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class Index {
	
	Date date = new Date();
	DateFormat fullDf = DateFormat.getDateInstance(DateFormat.FULL);
	DateFormat timeDf = DateFormat.getTimeInstance(DateFormat.FULL);


	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	@RequestMapping("/date")
	public String date(Model model) {
		model.addAttribute("page", "date");
		model.addAttribute("date", fullDf.format(date));
		return "date.jsp";
	}
	
	@RequestMapping("/time")
	public String time(Model model) {
		model.addAttribute("page", "time");
		model.addAttribute("time", timeDf.format(date));
		return "time.jsp";
	}
	
}
