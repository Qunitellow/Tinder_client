package com.tinder.client.support;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Response {
    boolean status;
    Object addition;

    public Response(boolean status) {
        this.status = status;
    }
}
