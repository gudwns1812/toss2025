package lang.math.test;

import java.util.Random;

public class LottoGenerator {
    private final Random random = new Random();
    private int[] lottoNumbers;
    private int count; // 로또 번호 개수
    private final int maxNumber = 45; // 로또 번호 최대값

    public int[] generate() {
        lottoNumbers = new int[6];
        count = 0;

        while (count < 6) {
            int number = random.nextInt(maxNumber) + 1; // 1 ~ 45
            if (!isDuplicate(number)) {
                lottoNumbers[count] = number;
                count++;
            }
        }

        return lottoNumbers;
    }
    private boolean isDuplicate(int number) {
        for (int i = 0; i < count; i++) {
            if (lottoNumbers[i] == number) {
                return true; // 중복된 번호가 있음
            }
        }
        return false; // 중복된 번호가 없음
    }
}
