package com.jalvadev.blog.bases;

public class Result<T> {
    
    private boolean isSuccess;

    private String message;

    private T result;

    private Result(boolean isSuccess, String message, T result){
        this.isSuccess = isSuccess;
        this.message = message;
        this.result = result;
    }

    public static <T> Result<T> Success(String message, T result) { return new Result<T>(true, message, result); }

    public static <T> Result<T> Error(String message, T result) { return new Result<T>(false, message, result); }

    public boolean isSuccess(){ return this.isSuccess; }

    public String getMessage() { return this.message; }

    public T getResult() { return this.result; }
}
