package com.home.springstudy.exception.exception.global;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 글로벌 예외처리 호출
 * */

@Slf4j
@RestController
@RequestMapping("/api/exception/global")
public class GlobalExceptionController {

    /**
     * 글로벌 예외처리 호출
     * */
    @PostMapping("/call")
    public void testCall() throws Exception {
        throw new Exception();
    }
}
