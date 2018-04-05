package com.andrius.baltrunas.springboot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by andriusbaltrunas on 4/5/2018.
 */
@Controller
public class IndexController {

    private static final String WELCOME_PAGE = "welcome";

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String initPage(){
        return WELCOME_PAGE;
    }
}
