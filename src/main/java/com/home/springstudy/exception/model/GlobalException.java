package com.home.springstudy.exception.model;

import lombok.Data;

/**
 * 글로벌 에러 dto
 * */
@Data
public class GlobalException {

    /** 응답코드 */
    private String resultCde;

    /** 응답메세지 */
    private String resultMsg;
}
