package org.quantum.nucleus.component.dto;

import java.util.Collection;

/**
 * @author 蒋朋轩
 */
public class PageDTO<T> {

    private Collection<T> data;

    private Long total;

    public Collection<T> getData() {
        return this.data;
    }

    public void setData(Collection<T> data) {
        this.data = data;
    }

    public long getTotal() {
        return this.total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public static <T> PageDTO<T> of(Collection<T> data, long total) {
        PageDTO<T> dto = new PageDTO();
        dto.setData(data);
        dto.setTotal(total);
        return dto;
    }
}
