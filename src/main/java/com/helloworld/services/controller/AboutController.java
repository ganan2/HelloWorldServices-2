package com.helloworld.services.controller;

import com.helloworld.services.domain.About;
import com.helloworld.services.service.AboutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Optional;

@Controller
public class AboutController {

    @Autowired
    private AboutService aboutService;

    @RequestMapping(value = "/about", method = {RequestMethod.GET, RequestMethod.POST})
    public String getAbout() throws Exception{
        About about = new About();
        about.setAboutMessage("Hello world!");
        aboutService.saveAbout(about);
        return "/about/about";
    }

    @RequestMapping(
            value = "/about/{mongoId}",
            method = {RequestMethod.GET, RequestMethod.POST},
            produces = "application/json")
    @ResponseBody
    public About getMongoId(@PathVariable("mongoId") String mongoId) throws Exception {
        Optional<About> optionalAbout = aboutService.findByMongoId(mongoId);
        About about = optionalAbout.get();

        if(  about != null){
            About localAbout = new About();
            localAbout.setAboutMessage(about.getAboutMessage());
            localAbout.setMongoId(mongoId);
            return localAbout;
        };
        return about;
    }
}
