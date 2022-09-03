package org.sameesh.designpattern.chainofresponsibility;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HandlerTest {

    @Test
    @DisplayName("COR test ")
    public void handlerClientTest(){
        Handler authHandler = new AuthenticationHandler();
        String className = authHandler.getClass().getName();
        Handler cachHandler = new CacheHandler();
        authHandler.setNext(cachHandler);
        Request request = new Request();
        request.setMsg("Hello");
        request.setToken("validtoken");
        String response = authHandler.handle(request);
        assertEquals("success", response);
    }

}