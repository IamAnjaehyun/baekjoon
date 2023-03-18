class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        for (int i = 0; i < skill_trees.length; i++) {
            StringBuilder st = new StringBuilder();

            for (int j = 0; j < skill_trees[i].length(); j++) {
                if (skill.contains(String.valueOf(skill_trees[i].charAt(j)))) {
                    st.append(skill_trees[i].charAt(j));
                }
            }
            int cnt = 0;
            for (int j = 0; j < st.length(); j++) {
                if (st.charAt(j) == skill.charAt(j)) cnt++;
            }
            if (cnt == st.length()) answer++;
        }
        return answer;
    }
}