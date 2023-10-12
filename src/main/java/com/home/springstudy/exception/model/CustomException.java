package com.home.springstudy.exception.model;

import lombok.Data;

/**
 * 커스텀 에러 dto
 * */
@Data
public class CustomException {

    /** 응답코드 */
    private String customResultCde;

    /** 응답메세지 */
    private String customResultMsg;
}
