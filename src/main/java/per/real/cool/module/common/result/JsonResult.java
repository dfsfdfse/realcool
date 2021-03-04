package per.real.cool.module.common.result;

import lombok.Data;

@Data
public class JsonResult {

    public static final String SUCCESS_MESSAGE = "OK";

    public static final String SUCCESS_CODE = "200";

    private Object data;

    private String code;

    private String message;

    public JsonResult(Object data){
        this.data = data;
        this.code = SUCCESS_CODE;
        this.message = SUCCESS_MESSAGE;
    }

    public static JsonResult success(Object data){
        return new JsonResult(data);
    }
}
