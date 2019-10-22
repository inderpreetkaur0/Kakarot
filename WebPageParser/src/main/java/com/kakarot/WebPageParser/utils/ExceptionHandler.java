package com.kakarot.WebPageParser.utils;

/**
 * Application specific exception class
 */
public class ExceptionHandler extends Exception {


    private String errorCode = null;
    private String errorMessage = null;
    private String errorDetails = null;

    public ExceptionHandler(String errorMessage, String errorCode, Throwable throwable) {
        super(errorMessage, throwable);
        this.errorCode = errorCode;
        errorDetails = throwable.getLocalizedMessage();
    }

    public ExceptionHandler(String errorCode, String errorMessage) {
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    /**
     * returns error code
     *
     * @return error code
     */
    public String getErrorCode() {
        return errorCode;
    }

    @Override
    public String getMessage() {
        if (this.errorMessage != null) {
            return this.errorMessage;
        }
        return super.getMessage();
    }

    /**
     * @return error details
     */
    public String getErrorDetails() {
        if (this.errorDetails != null) {
            return this.errorDetails;
        } else
            return "";
    }


    @Override
    public String toString() {
        return "Exception:\nCode:" + getErrorCode() + "\nMessage:" + getMessage() + "\nDetails:" + getErrorDetails();
    }

}
