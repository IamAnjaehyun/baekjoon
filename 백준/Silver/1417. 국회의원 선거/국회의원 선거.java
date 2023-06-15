import java.util.*;
import java.io.*;

public class Main{
    
    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
                
        final int NUMBER_OF_CANDI = Integer.parseInt(br.readLine());
        int dasom = Integer.parseInt(br.readLine());
       
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<NUMBER_OF_CANDI-1;i++) {
            priorityQueue.add(Integer.parseInt(br.readLine()));
        }
        int answer = 0;
        if(NUMBER_OF_CANDI != 1) {
            while(priorityQueue.peek() >= dasom) {
                answer++;
                dasom++;
                int temp = priorityQueue.poll();
                priorityQueue.add(temp-1);
            
            } 
        }
       
        
        sb.append(answer);
        sb.append("\n"); 
        
        bw.write(sb.toString());
        
        bw.flush();
        br.close();
        bw.close();
        
    }

    
}