package org.quantum.nucleus.component.dto;

/**
 * @author ike
 * @date 2021 年 05 月 13 日 19:15
 */
public class BizResponse<T> implements BizResponseState {

    private String code;

    private T data;

    @Override
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public static <T> BizResponse<T> of(T data){
        BizResponse<T> response = new BizResponse<>();
        response.setCode("ok");
        response.setData(data);
        return response;
    }
}
