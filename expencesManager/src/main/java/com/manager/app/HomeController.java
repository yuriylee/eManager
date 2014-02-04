package com.manager.app;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import com.manager.app.domain.User;
import com.manager.app.service.EarningService;
import com.manager.app.service.ExpenceService;
import com.manager.app.service.UserService;
import org.apache.commons.lang3.time.DateUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

    @Autowired
    private UserService userService;

    @Autowired
    private EarningService earningService;

    @Autowired
    private ExpenceService expenceService;

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
        User user = userService.getUserById(1l);
        Date date = new Date();
        System.out.println(Calendar.DATE);
        logger.info("Welcome home! The client locale is {}.", locale);
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);

		model.addAttribute("serverTime", formattedDate);
        model.addAttribute("username", user.getName());
        model.addAttribute("earnings", earningService.getAllByUserId(user.getId()));
        model.addAttribute("expences", expenceService.getAllByUserIdAndDate(user.getId(), DateUtils.truncate(date, Calendar.DATE)));
//
		return "home";
	}
	
}
