package enumeration.test.http;

public enum HttpStatus {
    OK(200, "OK"),
    BAD_REQUEST(400, "Bad Request"),
    NOT_FOUND(404, "Not Found"),
    INTERNAL_SERVER_ERROR(500, "Internal Server Error");

    private final int code;
    private final String message;

    HttpStatus(int code, String message) {
        this.code = code; // 생성자에서 상태 코드를 초기화
        this.message = message; // 생성자에서 메시지를 초기화
    }
    public int getCode() {
        return code; // 상태 코드를 반환하는 메서드
    }
    public String getMessage() {
        return message; // 메시지를 반환하는 메서드
    }

}
