package com.checkermaker.controller;
import org.springframework.dao.DataAccessException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.NoHandlerFoundException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class ExceptionHandlerController {
    private static final Logger logger = LogManager.getLogger(ExceptionHandlerController.class);

    @ExceptionHandler(NoHandlerFoundException.class)
    ModelAndView handle404(){
        ModelAndView mv=new ModelAndView();
        logger.error("Error :  page not found Occur");
        mv.addObject("error","page not found!");
        mv.setViewName("errorPage");
        return mv;
    }

    @ExceptionHandler(DataAccessException.class)
    ModelAndView handleDataAccessException(HttpServletRequest req, DataAccessException dataAccessException){
        ModelAndView mv=new ModelAndView();
        logger.error("Error : "+dataAccessException);
        logger.error(dataAccessException.toString());
        mv.addObject("exception",dataAccessException);
        mv.addObject("url",req.getRequestURL());
        mv.setViewName("errorPage");
        return mv;
    }
}
