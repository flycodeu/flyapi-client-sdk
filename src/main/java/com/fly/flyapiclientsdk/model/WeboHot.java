package com.fly.flyapiclientsdk.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class WeboHot implements Serializable {

    private static final long serialVersionUID = 636309273892078318L;

    String plantform;
    String index;
    String title;
    String hot;
    String href;


}
