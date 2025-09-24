package charset;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Set;
import java.util.SortedMap;

public class AvailableCharsetMain {
    public static void main(String[] args) {
        // 이용 가능한 모든 Charset 자바 + OS
        SortedMap<String, Charset> charsets = Charset.availableCharsets();
        for (String charsetName : charsets.keySet()) {
            System.out.println("charsetName = " + charsetName);
        }

        System.out.println("======");
        //문자로 조(대소문자 구분 X)
        Charset charset1 = Charset.forName("MS949");
        System.out.println("charset1 = " + charset1);

        //별칭 조회
        Set<String> aliases = charset1.aliases();
        for (String alias : aliases) {
            System.out.println("alias = " + alias);
        }

        //utf-8 문자로 조회
        Charset charset2 = Charset.forName("utf-8");
        System.out.println("charset2 = " + charset2);

        Charset charset3 = StandardCharsets.UTF_8;
        System.out.println("charset3 = " + charset3);

        //시스템의 기본 Charset
        Charset charset4 = Charset.defaultCharset();
        System.out.println("charset4 = " + charset4);
    }
}
