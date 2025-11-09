package br.com.ss.Exception;

import java.io.IOException;

/**
 * This class demonstrates the difference between checked and unchecked exceptions in Java.
 */
public class ExceptionExample {

    /**
     * This method demonstrates a checked exception.
     * The compiler requires that this method either handle the IOException
     * or declare it in the method signature using the 'throws' keyword.
     *
     * @throws IOException if an I/O error occurs (for demonstration).
     */
    public static void throwCheckedException() throws IOException {
        System.out.println("Inside throwCheckedException(). This will throw a checked exception.");
        throw new IOException("This is a checked exception.");
    }

    /**
     * This method demonstrates an unchecked exception.
     * The method throws a RuntimeException (specifically, an IllegalArgumentException),
     * but it is not required to declare this in the method signature.
     */
    public static void throwUncheckedException() {
        System.out.println("Inside throwUncheckedException(). This will throw an unchecked exception.");
        // We are throwing our custom exception that extends RuntimeException.
        throw new CustomRuntimeException("This is a custom unchecked exception.");
    }

    public static void main(String[] args) {
        System.out.println("--- Demonstrating Checked vs. Unchecked Exceptions ---");

        // --- Handling a Checked Exception ---
        // The call to throwCheckedException() must be wrapped in a try-catch block
        // because it's declared to throw a checked exception (IOException).
        // If you remove the try-catch, the code will not compile.
        try {
            throwCheckedException();
        } catch (IOException e) {
            System.out.println("Caught a checked exception: " + e.getMessage());
        }

        System.out.println("\n------------------------------------------------------\n");

        // --- Handling an Unchecked Exception ---
        // The call to throwUncheckedException() is not required by the compiler
        // to be in a try-catch block, because RuntimeExceptions are unchecked.
        // However, if we don't catch it, the program will crash.
        try {
            throwUncheckedException();
        } catch (CustomRuntimeException e) {
            System.out.println("Caught an unchecked exception: " + e.getMessage());
        }

        System.out.println("\n--- Program finished successfully ---");
    }
}