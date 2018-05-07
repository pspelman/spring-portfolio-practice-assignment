package com.philspelman.springportfolio.springportfolio;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String index() {
        System.out.println("Got to the / (index) route of the HomeController");
        return "forward:/index.html";

    }


    @RequestMapping("/about")
    public String about() {
        System.out.println("Got to the About route in the HomeController");
        return "This is about me!";
        //fixme: add the return "forward:/about.html" or whatever
    }

    @RequestMapping("/projects")
    public String projects() {
        System.out.println("Got to the /projects route in the HomeController");


        //fixme: add the return "forward:/projects.html
        return "This will return the projects.html";
    }


}

