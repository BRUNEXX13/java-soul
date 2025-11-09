package br.com.ss.Exception;

/*
Question 5: The Subtle Exception Question
He asked,

“What’s the difference between checked and unchecked exceptions?”

I said, “Checked ones need to be caught.”
I paused, then added, “Or declared.”

He said, “Good. Now tell me — is RuntimeException checked or unchecked?”

RuntimeException and its subclasses are unchecked. You can throw them without declaring them in the method signature.
 */
public class CustomRuntimeException extends RuntimeException {
    public CustomRuntimeException(String message) {
        super(message);
    }
}