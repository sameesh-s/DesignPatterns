package org.sameesh.designpattern.chainofresponsibility;

import lombok.Data;

/**
 * Request object used for passing through the CofR handlers
 */
@Data
public class Request {
    private String token;
    private String msg;
}
