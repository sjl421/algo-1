package codeeval.moderate.stack;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Arrays;

/**
 * Stack Implementation
 * Write a program which implements a stack interface for integers.
 * The interface should have 'push' and 'pop' functions.
 * Your task is to 'push' a series of integers and then 'pop' and print every alternate integer.
 */
public class StackImplementation {
    public static void main(String[] args) throws Exception {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        Stack stack = new Stack();
        while ((line = buffer.readLine()) != null) {
            String[] items = line.split(" ");
            for (String item: items) {
                stack.push(Integer.parseInt(item));
            }
            while (!stack.isEmpty()) {
                System.out.print(stack.pop() + " ");
            }
            System.out.println();
        }
    }
}

class Stack {
    private static final int DEFAULT_CAPACITY = 20;

    private int[] elements = new int[DEFAULT_CAPACITY];
    private int capacity = DEFAULT_CAPACITY;
    private int top = 0;

    public void push(int element) {
        if (top >= capacity) {
            capacity += (capacity >> 1);
            elements = Arrays.copyOf(elements, capacity);
        }
        elements[top++] = element;
    }

    public void push(int ...elements) {
        for (int item: elements)
            push(item);
    }

    public int pop() {
        if (top > 0) {
            int item = elements[--top];
            elements[top] = 0;
            if (top > 0) {
                elements[--top] = 0;
            }
            return item;
        }
        throw new RuntimeException("Stack is empty");
    }

    public int size() {
        return top;
    }

    public boolean isEmpty() {
        return top == 0;
    }
}
