// 겹치는 선분의 길이
// 문제 설명
// 선분 3개가 평행하게 놓여 있습니다. 세 선분의 시작과 끝 좌표가 [[start, end], [start, end], [start, end]] 형태로 들어있는 2차원 배열 lines가 매개변수로 주어질 때, 두 개 이상의 선분이 겹치는 부분의 길이를 return 하도록 solution 함수를 완성해보세요.

// lines가 [[0, 2], [-3, -1], [-2, 1]]일 때 그림으로 나타내면 다음과 같습니다.

// line_2.png

// 선분이 두 개 이상 겹친 곳은 [-2, -1], [0, 1]로 길이 2만큼 겹쳐있습니다.
import java.util.HashMap;

class Solution {
    public int solution(int[][] lines) {
        HashMap<Integer, Integer> stacks = new HashMap<>();
        for (int i = 0; i < lines.length; i++) {
            for (int j = lines[i][0]; j < lines[i][1]; j++) {
                stacks.put(j, stacks.getOrDefault(j, 0) + 1);
            }
        }

        int len = 0;
        for (int k : stacks.keySet()) {
            if (stacks.get(k) > 1)
                len++;
        }

        return len;
    }
}