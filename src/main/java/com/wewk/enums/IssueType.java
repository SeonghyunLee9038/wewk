package com.wewk.enums;

public enum IssueType {
    RD("RD", "요구사항 정의"),
    SD("SD", "설계"),
    DESIGN("DESIGN", "디자인"),
    PUB("PUB", "퍼블리싱"),
    DEV("DEV", "개발"),
    TEST("TEST", "테스트");


    private String code;
    private String name;

    IssueType(String name, String code) {
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
