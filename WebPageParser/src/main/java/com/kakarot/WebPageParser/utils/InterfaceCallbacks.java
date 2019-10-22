package com.kakarot.WebPageParser.utils;

/**
 * Application level callbacks
 */
public interface InterfaceCallbacks {

    /**
     * on success
     *
     * @param object
     */
    void onSuccess(Object object);

    /**
     * on failures
     *
     * @param e
     */
    void onFailure(Object e);
}
