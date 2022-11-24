package WestTwo.Round2.Problem3;

public class ThreadArray extends Thread {

    private Object object;
    private int[] arr;

    public ThreadArray(Object object, int[] arr) {
        this.object = object;
        this.arr = arr;
    }

    @Override
    public void run() {
        synchronized (object) {
            for (int i : arr) {
                System.out.println(i);
                object.notify();
                try {
                    object.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {

        Object object = new Object();
        int[] arr1 = {1, 3, 5, 7, 9};
        ThreadArray t1 = new ThreadArray(object,arr1);
        int[] arr2 = {2, 4, 6, 8, 10};
        ThreadArray t2 = new ThreadArray(object,arr2);

        t1.start();
        t2.start();
    }
}
