package com.wewk.enums;

public enum IssueStatus {
    OPEN("OPEN", "열림"),
    IN_PROGRESS("IN_PROGRESS", "진행중"),
    RESOLVED("RESOLVED", "작업완료"),
    CLOSE("CLOSE", "닫힘"),
    REOPENED("REOPENED", "다시 열림");


    private String code;
    private String name;

    IssueStatus(String name, String code) {
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
