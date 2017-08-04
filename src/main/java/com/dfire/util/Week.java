package com.dfire.util;

/**
 * Created by ch on 2017/8/1.
 */
public enum Week {

    Monday(1, "星期一"),
    Tuesday(2, "星期二"),
    Wednesday(3, "星期三"),
    Thursday(4, "星期四"),
    Friday(5, "星期五"),
    Saturday(6, "星期六"),
    Sunday(7, "星期七");

    private Integer id;
    private String message;

    Week(int id, String message) {
        this.id = id;
        this.message = message;
    }

    public Integer getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "Week{" +
                "id=" + id +
                ", message='" + message + '\'' +
                '}';
    }
}
