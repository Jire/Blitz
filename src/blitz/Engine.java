package blitz;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public final class Engine {

	private final ExecutorService service;

	Engine(boolean multiprocessing) {
		service = Executors.newFixedThreadPool(
				multiprocessing ?
						Runtime.getRuntime().availableProcessors()
						: 1
				);
	}

	void submit(Runnable task) {
		service.submit(task);
	}

}