import java.util.*;
import java.util.stream.Collectors;


class Solution {
    public String solution(String my_string) {
        List<String> list = new ArrayList<>(List.of(my_string.split("")));
        return list.stream().distinct().collect(Collectors.joining());
    }
}