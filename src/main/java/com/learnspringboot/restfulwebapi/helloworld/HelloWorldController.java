package com.learnspringboot.restfulwebapi.helloworld;


import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

//REST API
@RestController
public class HelloWorldController {

    private MessageSource messageSource;

    public HelloWorldController(MessageSource messageSource) {
        this.messageSource = messageSource;
    }
    @GetMapping(path = "/hello-world-international")
    public String helloWorldInternationalized(){

        Locale locale = LocaleContextHolder.getLocale();
        return messageSource.getMessage("good.morning.message", null, "DefaultMessage", locale);
    }

    //"Hello-World"
    @GetMapping(path = "/hello-world")
    public String helloWorld(){
        return "Hello Around of Studio";
    }

    @GetMapping(path = "/hello-world-bean")
    public HelloWorldBean helloWorldbean(){
        return new HelloWorldBean("Hello World");
    }

    @GetMapping(path = "/hello-world/path-variable/{name}")
    public HelloWorldBean helloWorldPathVar(@PathVariable String name){
        return new HelloWorldBean(
                String.format("Hello World, %s", name)
        );
    }


}
