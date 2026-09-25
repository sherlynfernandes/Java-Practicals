class SharedData {

    int number;

    synchronized void setNumber(int number) {
        this.number = number;
        System.out.println("Fibonacci Number: " + number);
        notify();
    }

    synchronized int getNumber() {
        return number;
    }
}

class FibonacciThread extends Thread {

    SharedData data;

    FibonacciThread(SharedData data) {
        this.data = data;
    }

    public void run() {

        int a = 0;
        int b = 1;

        for (int i = 0; i <= 20; i++) {

            data.setNumber(a);

            int c = a + b;
            a = b;
            b = c;

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted.");
            }
        }
    }
}

class SquareThread extends Thread {

    SharedData data;

    SquareThread(SharedData data) {
        this.data = data;
    }

    public void run() {

        for (int i = 0; i <= 20; i++) {

            synchronized (data) {

                int number = data.getNumber();
                int square = number * number;

                System.out.println("Square: " + square);
            }

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted.");
            }
        }
    }
}

public class FibonacciSquare {

    public static void main(String[] args) {

        SharedData data = new SharedData();

        FibonacciThread f = new FibonacciThread(data);
        SquareThread s = new SquareThread(data);

        f.start();
        s.start();
    }
}