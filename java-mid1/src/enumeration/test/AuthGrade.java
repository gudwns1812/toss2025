package enumeration.test;

public enum AuthGrade {
    GUEST(1, "손님"),
    LOGIN(2, "로그인"),
    ADMIN(3, "관리자");

    private final int level;
    private final String description;

    AuthGrade(int level, String description) {
        this.level = level; // 생성자에서 레벨을 초기화
        this.description = description; // 생성자에서 설명을 초기화
    }
    public int getLevel() {
        return level; // 레벨을 반환하는 메서드
    }
    public String getDescription() {
        return description; // 설명을 반환하는 메서드
    }
}
