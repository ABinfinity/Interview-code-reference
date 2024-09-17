import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceCompletableFutureExample {
    public static void main(String[] args) {
        // Create an ExecutorService with a fixed thread pool
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        // Run a task asynchronously using ExecutorService
        executorService.submit(() -> {
            System.out.println("Task executed by ExecutorService");
        });

        // Run a task asynchronously using CompletableFuture
        CompletableFuture.runAsync(() -> {
            System.out.println("Task executed by CompletableFuture");
        }, executorService);

        // Shutdown the ExecutorService
        executorService.shutdown();
    }
}


// ExecutorService is a framework provided by Java to manage a pool of threads, allowing you to run tasks asynchronously 
//   without manually managing thread creation and lifecycle. 
//   ExecutorService manages a pool of threads, allowing you to submit tasks and execute them concurrently.

// CompletableFuture is a part of Java's concurrency API that allows you to write non-blocking, 
//   asynchronous code. It represents a future result of an operation that you can complete explicitly. 
//   CompletableFuture allows you to run tasks asynchronously and attach callbacks for when they complete.





