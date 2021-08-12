package com.gcy;

import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

import java.io.File;

/**
 *
 * @author IfengCloud
 */
@RestController
@RequestMapping(path = "/")
@ApiIgnore
public class HomeController {

    private static org.slf4j.Logger logger = LoggerFactory.getLogger("HomeController");

    public HomeController() {
        logger.error(new java.util.Date().toString() + " 这是一个测试请求， this is a test  !  "
                + new File("").getAbsolutePath());
    }

    @GetMapping("/gcy")
    public String index() {
        return new java.util.Date().toString() + " gcy is started !  " + new File("").getAbsolutePath();
    }

    @GetMapping("/ggw")
    public String error() {
        return "ggw is started !  ";
    }

}
