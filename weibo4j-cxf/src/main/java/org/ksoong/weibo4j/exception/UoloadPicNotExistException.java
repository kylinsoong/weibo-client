package org.ksoong.weibo4j.exception;

public class UoloadPicNotExistException extends RuntimeException {

    private static final long serialVersionUID = -7980915063554055649L;
    
    public UoloadPicNotExistException(Exception e) {
        super(e);
    }

}
