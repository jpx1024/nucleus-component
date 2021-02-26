package org.quantum.nucleus.component.dto;

/**
 * 响应
 * @author ike
 */
public class Response {

    private String code;

    private String message;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public static Response buildSuccess(){
        Response response = new Response();
        response.setCode("SUCCESS");
        return response;
    }

    public static Response buildFailure(ResponseState responseState) {
        Response response = new Response();
        response.setCode(responseState.getCode());
        response.setMessage(responseState.getMessage());
        return response;
    }
}
