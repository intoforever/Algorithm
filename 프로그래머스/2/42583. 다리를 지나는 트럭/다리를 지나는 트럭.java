import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0; // 소요시간
        Deque<Integer> pendingQueue = new ArrayDeque<>(); // 대기큐
        Deque<Integer> processingQueue = new ArrayDeque<>(); // 진행큐
        
        // 대기큐 초기화
        for (int truck : truck_weights) {
            pendingQueue.addLast(truck);
        }
        
        // 진행큐 초기화
        for (int i=0;i<bridge_length;i++) {
            processingQueue.addLast(0);
        }
        
        while (true) {
            answer++; // 초 증가
            processingQueue.pollFirst(); // 진행큐 빼고                
        
            // 현재 다리위의 무게 계싼
            int currentWeight = 0;
            for (int truck : processingQueue) {
                currentWeight += truck;
            }
            
            // 트럭 드루간다~~
            int waitTruck = pendingQueue.peekFirst()==null? 0:pendingQueue.peekFirst();
            // Integer waitTruck = pendingQueue.pollFirst();
            if (currentWeight+waitTruck <= weight && waitTruck != 0) {
                processingQueue.addLast(pendingQueue.pollFirst()); // 대기큐에서 첫번째꺼 빼서 진행큐 마지막에 넣고    
            } else {
                processingQueue.addLast(0); // 조건 안맞으면 0넣어버려
            }
            
            // System.out.println("waitTruck : " + waitTruck);
            // System.out.println("currentWeight : " + currentWeight);
         
            // 현재 다리위의 무게 계싼
            currentWeight = 0;
            for (int truck : processingQueue) {
                currentWeight += truck;
            }
            
            if (pendingQueue.size() ==0 && currentWeight == 0) break;
        }
        
        return answer;
    }
}