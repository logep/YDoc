package com.github.ydoc.yapi;

import lombok.Getter;

/**
 * @author yujian
 */

public enum RequestBodyType {
    /**
     * object
     */
    OBJECT("object"),
    /**
     * string
     */
    STRING("string"),
    /**
     * array
     */
    ARRAY("array"),
    /**
     * number
     */
    NUMBER("number"),
    /**
     * boolean
     */
    BOOLEAN("boolean"),
    /**
     * ITEMS
     */
    ITEMS("items"),
    /**
     * integer
     */
    INTEGER("integer");
    RequestBodyType(String type){
        this.type =type;
    }
    @Getter
    public String type;
    public static RequestBodyType of(String low){
        for (RequestBodyType value : values()) {
            if(value.getType().equalsIgnoreCase(low)){
                return value;
            }
        }
        return OBJECT;
    }
}
