/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dm.floor13.exceptions;

/**
 *
 * @author danimaetrix
 */
public class MissingDataException extends Exception {

    public MissingDataException(String message) {
        super(message);
    }

    public MissingDataException(String message, Throwable cause) {
        super(message, cause);
    }

}
