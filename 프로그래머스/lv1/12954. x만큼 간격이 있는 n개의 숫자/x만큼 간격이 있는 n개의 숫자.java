import java.util.*;
class Solution {
    public long[] solution(int x, int n) {
        List<Long> list = new ArrayList<>();
        for(int i=1;i<=n;i++){
            list.add(((long) x *(i)));
        }
        return list.stream().mapToLong(i->i).toArray();
    }
}