package blitz.language;

interface Task extends Runnable {

	/*
	 * This class is used to simplify
	 * code and keep a centralized idea
	 * around what a task actually is.
	 */

	String getName();

}