package org.sameesh.designpattern.chainofresponsibility;

/**
 * Handler interface which need to be implemented by CofR handlers BaseHandlers or ExtendedHandlers
 */
public interface Handler {
    public void setNext(Handler handler);
    public String handle(final Request request);
}
