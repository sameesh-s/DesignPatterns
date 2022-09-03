package org.sameesh.designpattern.chainofresponsibility;

import lombok.Data;
import org.apache.commons.lang3.ObjectUtils;

/**
 * Basic behaviour of the handler class is defined here: Boilerplate code
 */
@Data
public class BaseHandler implements Handler {

    private Handler handler;

    @Override
    public void setNext(Handler handler) {
        this.handler = handler;
    }

    protected boolean isNextPresent(){
        return ObjectUtils.isNotEmpty(this.handler);
    }

    @Override
    public String handle(final Request request) {
        if(isNextPresent()){
            return this.handler.handle(request);
        }
        return "";
    }
}
