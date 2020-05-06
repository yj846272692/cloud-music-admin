package com.soft1851.music.admin.exception;

import com.soft1851.music.admin.common.ResultCode;

/**
 * @Author YangJinG
 * @Description
 * @Date 2020/4/21
 */
public class JwtException extends RuntimeException {

    protected ResultCode resultCode;

    public JwtException(String msg, ResultCode resultCode) {
        super(msg);
        this.resultCode = resultCode;
    }

    public ResultCode getResultCode() {
        return resultCode;
    }
}
