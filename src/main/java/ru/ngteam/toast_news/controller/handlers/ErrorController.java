package ru.ngteam.toast_news.controller.handlers;

import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import ru.ngteam.toast_news.dto.ErrorDto;
import ru.ngteam.toast_news.exceptions.AuthException;
import ru.ngteam.toast_news.exceptions.ToastException;

@ControllerAdvice
@ResponseBody
public class ErrorController {
    @ExceptionHandler(ToastException.class)
    public ErrorDto handleBindException(AuthException e, HttpServletResponse response) {
        response.setStatus(400);
        return new ErrorDto(e.getMessage());
    }
}
