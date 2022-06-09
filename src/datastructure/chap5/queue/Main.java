package datastructure.chap5.queue;

public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue();

        for (int i = 0; i < 5; i++) {
            queue.add(i*3);
        }

        while (!queue.isEmpty()){
            System.out.println(queue.poll());
        }

        System.out.println("=============================================");
        

    }

}
