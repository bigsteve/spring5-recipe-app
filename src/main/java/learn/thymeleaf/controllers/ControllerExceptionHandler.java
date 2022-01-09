package learn.thymeleaf.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

import learn.thymeleaf.exceptions.NotFoundException;
import lombok.extern.slf4j.Slf4j;

/**
 * @author stefan
 *
 */
@Slf4j
@ControllerAdvice
public class ControllerExceptionHandler {

    
    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(NotFoundException.class)
    public ModelAndView handleNotFound(Exception e){

        log.error("Handling not found exception: "+e.getMessage());

        ModelAndView modelAndView = new ModelAndView();

        modelAndView.setViewName("page404");
        modelAndView.addObject("exception", e);
        
        return modelAndView;
    }
    
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(NumberFormatException.class)
    public ModelAndView handleNumberFormatException(Exception e){

        log.error("Handling number format exception: "+e.getMessage());

        ModelAndView modelAndView = new ModelAndView();

        modelAndView.setViewName("page400");
        modelAndView.addObject("exception", e);
        
        return modelAndView;
    }
    
}
