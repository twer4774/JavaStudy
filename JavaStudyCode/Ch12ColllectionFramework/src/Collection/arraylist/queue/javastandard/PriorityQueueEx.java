package Collection.arraylist.queue.javastandard;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueEx {
    public static void main(String[] args) {
        Queue pq = new PriorityQueue();
        pq.offer(3);
        pq.offer(2);
        pq.offer(5);
        pq.offer(4);
        pq.offer(1);

        System.out.println("pq의 내부 출력 :" + pq);

        Object obj = null;
        //큐에 저장된 요소를 하나씩 꺼낸다
        while ((obj = pq.poll()) != null){
            System.out.println(obj);
        }

    }

}
