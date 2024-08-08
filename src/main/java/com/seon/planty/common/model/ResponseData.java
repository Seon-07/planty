package com.seon.planty.common.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResponseData<T> {
	private String status;
    private String message;
    private T data;
    
    public ResponseData() {
    }
    //생성자
    public ResponseData(String status, String message, T data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }
    //생성자
    public ResponseData(String status, String message) {
        this(status, message, null);
    }
    
}
