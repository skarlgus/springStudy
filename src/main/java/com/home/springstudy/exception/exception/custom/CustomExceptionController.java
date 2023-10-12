package com.home.springstudy.exception.exception.custom;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 커스텀 예외처리 호출
 * */

@Slf4j
@RestController
@RequestMapping("/api/exception/custom")
public class CustomExceptionController {

    /**
     * 커스텀 예외처리 호출
     * */
    @PostMapping("/call")
    public void testCall() throws Exception {
        throw new Exception();
    }
}
