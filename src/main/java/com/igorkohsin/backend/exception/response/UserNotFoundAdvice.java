package com.igorkohsin.backend.exception.response;

import com.igorkohsin.backend.exception.UserEmailNotFoundException;
import com.igorkohsin.backend.exception.UserIdNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class UserNotFoundAdvice {

    @ResponseBody
    @ExceptionHandler({UserIdNotFoundException.class, UserEmailNotFoundException.class})
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String userIdNotFoundHandler(UserIdNotFoundException exception) {return exception.getMessage();}
    String userEmailNotFoundHandler(UserEmailNotFoundException exception){return exception.getMessage();}
}