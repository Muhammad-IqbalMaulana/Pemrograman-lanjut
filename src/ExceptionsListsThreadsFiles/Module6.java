package ExceptionsListsThreadsFiles;

class Module6 implements Runnable{
    public void run() {
        System.out.println("B");
    }
}
class ir extends Thread {
    public void run() {
        System.out.println("A");
        Thread t = new Thread(new Module6());
        t.start();
    }

    public static void main(String[] args) {
        ir object = new ir();
        object.start();
    }
}
