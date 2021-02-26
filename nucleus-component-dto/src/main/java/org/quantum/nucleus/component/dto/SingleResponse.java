package org.quantum.nucleus.component.dto;

public class SingleResponse<T> extends Response {

    private T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public static <T> SingleResponse<T> of(T data) {
        SingleResponse singleResponse = SingleResponse.buildSuccess();
        singleResponse.setData(data);
        return singleResponse;
    }

    public static SingleResponse buildSuccess() {
        SingleResponse singleResponse = new SingleResponse();
        singleResponse.setCode("SUCCESS");
        return singleResponse;
    }

    public static SingleResponse buildFailure(ResponseState responseState) {
        SingleResponse singleResponse = new SingleResponse();
        singleResponse.setCode(responseState.getCode());
        singleResponse.setMessage(responseState.getMessage());
        return singleResponse;
    }
}