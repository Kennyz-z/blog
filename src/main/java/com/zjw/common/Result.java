package com.zjw.common;


import com.baomidou.mybatisplus.extension.api.R;

public class Result {
    private int code;// 200表示正常
    private String msg;
    private Object data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }


    public static Result success(int code, String msg, Object data) {
        Result res = new Result();
        res.setCode(code);
        res.setMsg(msg);
        res.setData(data);
        return res;
    }

    public static Result error(String msg, Object data) {
        return error(400, msg, data);
    }

    public static Result error(String msg) {
        return error(400, msg, null);
    }

    public static Result error(int code, String msg, Object data) {
        Result res = new Result();
        res.setCode(code);
        res.setMsg(msg);
        res.setData(data);
        return res;
    }
}
