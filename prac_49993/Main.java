package prac_49993;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

   public static void main(String[] args) {
      // TODO Auto-generated method

      String skill = "CBD";
      String[] skill_trees = { "BACDE", "CBADF", "AECB", "BDA" };

      System.out.println(solution(skill, skill_trees));
   }

   public static int solution(String skill, String[] skill_trees) {
      int answer = 0;

      char[] s = new char[skill.length() + 1];
      s = skill.toCharArray();

      for (int i = 0; i < skill_trees.length; i++) {
         Queue<Character> q = new LinkedList<>();
         
         char[] st = new char[skill_trees[i].length() + 1];
         st = skill_trees[i].toCharArray();

         for (int j = 0; j < st.length; j++) {
            for (int k = 0; k < s.length; k++) {
               if(st[j] == s[k]){
                  q.add(st[j]);
                  System.out.println(st[j]);
               }
            }
         }
         System.out.println();
         
         //Queue 와 비교
         
      }

      return answer;
   }
}