package org.sameesh.designpattern.chainofresponsibility;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.ObjectUtils;

public class AuthenticationHandler extends BaseHandler {

    public AuthenticationHandler(){
        super();
    }
    @Override
    public String handle(final Request request){
        if(ObjectUtils.isEmpty(request.getToken())){
            return "Token not present";
        }else{
            if(isNextPresent()){
                return this.getHandler().handle(request);
            }
            return "success";
        }
    }

}
