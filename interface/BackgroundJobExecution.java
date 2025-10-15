@FunctionalInterface
interface Task {
    void execute();
}

public class BackgroundJobExecution {
    public static void main(String[] args) {

        Task traditionalJob = new Task() {
            public void execute() {
                Thread thread = new Thread(new Runnable() {
                    public void run() {
                        System.out.println("Traditional job started.");
                        try {
                            Thread.sleep(2000);
                        } catch (InterruptedException e) {
                            System.out.println("Job interrupted");
                        }
                        System.out.println("Traditional job completed.");
                    }
                });
                thread.start();
            }
        };

        traditionalJob.execute();
        Task lambdaJob = () -> {
            Thread thread = new Thread(() -> {
                System.out.println("Lambda job started.");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    System.out.println("Job interrupted");
                }
                System.out.println("Lambda job completed.");
            });
            thread.start();
        };

        lambdaJob.execute();

        System.out.println("Main thread continues...");
    }
}

