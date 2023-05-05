package com.fly.flyapiclientsdk.model.Query;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
public class PictureRequest implements Serializable {
    private static final long serialVersionUID = -6932555065886112606L;
    private String searchText;
    @Builder.Default
    private int pageSize = 1;

}
