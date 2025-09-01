package collection.map.test.member;

import java.util.HashMap;
import java.util.Map;

public class MemberRepository {

    private final Map<String,Member> map;

    public MemberRepository() {
        this.map = new HashMap<>();
    }

    public void save(Member member) {
        map.put(member.getId(), member);
    }

    public Member findById(String id) {
        if (map.containsKey(id)) {
            return map.get(id);
        }
        return null;
    }

    public Member findByName(String name) {
        for (Member value : map.values()) {
            if (value.getName().equals(name)) {
                return value;
            }
        }
        return null;
    }

    public void remove(String id) {
        map.remove(id);
    }
}
