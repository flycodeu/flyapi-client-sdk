package com.fly.flyapiclientsdk.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AI {

    private String sourceText;
    private String targetText;
    private String source;
    private String target;
}
