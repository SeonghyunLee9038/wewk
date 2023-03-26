package com.wewk.enums;

public enum IssuePeriority {
    HIGHEST("HIGHEST", "매우높음"),
    HIGH ("HIGH", "높음"),
    MEDIUM ("MEDIUM", "중간"),
    LOW ("LOW", "낮음"),
    LOWEST("LOWEST", "매우낮음");


    private String code;
    private String name;

    IssuePeriority(String name, String code) {
        this.name = name;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

}
