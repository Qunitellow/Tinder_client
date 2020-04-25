package com.tinder.client.service;

import lombok.Getter;
import org.springframework.stereotype.Component;

@Getter
//убрать методы и менять статусы с помощью сеттеров

@Component
public class StatusOfClient {
    private boolean start;
    private boolean match;
    private boolean auth;

    public StatusOfClient() {
        start = true;
        match = false;
        auth = false;
    }

    public void goStart() {
        start = true;
        match = false;
        auth = false;
    }

    public void goMatch() {
        start = false;
        match = true;
        auth = false;
    }

    public void goAuth() {
        start = false;
        match = false;
        auth = true;
    }
}