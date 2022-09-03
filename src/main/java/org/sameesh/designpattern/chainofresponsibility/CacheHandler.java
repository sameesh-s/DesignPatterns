package org.sameesh.designpattern.chainofresponsibility;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.ObjectUtils;

import java.util.HashMap;
import java.util.Map;

public class CacheHandler extends BaseHandler {

    public CacheHandler(){
        super();
    }

    private static Map<String, String> CACHE = new HashMap<>();

    public String handle(final Request request){
        if(ObjectUtils.isEmpty(request)){
            return "can't process Request is empty!";
        }else if(ObjectUtils.isEmpty(request.getMsg())){
            return "can't process Request message is empty!";
        }else {
            if(!CACHE.containsKey(request.getMsg())){
                String response = "success";
                if(isNextPresent()){
                    System.out.println("Next is prsent");
                    response = this.getHandler().handle(request);
                }
                CACHE.put(request.getMsg(), response);
            }
            System.out.println(CACHE.get(request.getMsg()));
            return CACHE.get(request.getMsg());
        }
    }
}
