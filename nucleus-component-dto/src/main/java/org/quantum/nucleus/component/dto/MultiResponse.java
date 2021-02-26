package org.quantum.nucleus.component.dto;

import java.util.Collection;

/**
 * @author ike
 */
public class MultiResponse<T> extends Response {

    private long total;

    private Collection<T> data;

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public Collection<T> getData() {
        return data;
    }

    public void setData(Collection<T> data) {
        this.data = data;
    }

    public static <T> MultiResponse<T> of(Collection<T> data, long total) {
        MultiResponse<T> multiResponse = MultiResponse.buildSuccess();
        multiResponse.setData(data);
        multiResponse.setTotal(total);
        return multiResponse;
    }

    public static <T> MultiResponse<T> of(Collection<T> data) {
        return of(data, 0);
    }

    public static <T> MultiResponse<T> of(PageDTO dto) {
        MultiResponse<T> multiResponse = MultiResponse.buildSuccess();
        multiResponse.setData(dto.getData());
        multiResponse.setTotal(dto.getTotal());
        return multiResponse;
    }

    public static MultiResponse buildSuccess() {
        MultiResponse multiResponse = new MultiResponse();
        multiResponse.setCode("SUCCESS");
        return multiResponse;
    }

    public static MultiResponse buildFailure(ResponseState responseState) {
        MultiResponse multiResponse = new MultiResponse();
        multiResponse.setCode(responseState.getCode());
        multiResponse.setMessage(responseState.getMessage());
        return multiResponse;
    }
}