package com.zeeshanlalani.restfulwebservice.filtering;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/*
Static Filtering
both value1 and value2 will be ignored in the response.
 */

@JsonIgnoreProperties("value1")
//@JsonIgnoreProperties({"value1", "value2"})
public class SomeBean {

    private String value1;

    @JsonIgnore
    private String value2;

    private String value3;

    public SomeBean(String value1, String value2, String value3) {
        this.value1 = value1;
        this.value2 = value2;
        this.value3 = value3;
    }

    public String getValue3() {
        return value3;
    }

    public String getValue2() {
        return value2;
    }

    public String getValue1() {
        return value1;
    }

    @Override
    public String toString() {
        return "SomeBean{" +
                "value1='" + value1 + '\'' +
                ", value2='" + value2 + '\'' +
                ", value3='" + value3 + '\'' +
                '}';
    }
}
