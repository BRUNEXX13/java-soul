package br.com.ss.variables;

public class Variables {

    static void main() {

        //“Can a final variable in Java be modified?”
        final StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        System.out.println(sb);
    }
}
