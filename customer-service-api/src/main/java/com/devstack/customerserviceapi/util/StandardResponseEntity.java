package com.devstack.customerserviceapi.util;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class StandardResponseEntity {

    private int code;
    private String message;
    private Object data;


}
