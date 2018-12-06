package xyz.cxc6922.springboottemplate.model.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class RestApiResult {
    private int code;
    private String msg = "";
    private Object info;

    public RestApiResult(Object info) {
        this.info = info;
    }

    public RestApiResult() {

    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setInfo(Object info) {
        this.info = info;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
