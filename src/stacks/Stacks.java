/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stacks;
public class Stacks {

    private static class Node {
        private int date;
        private Node next;
        private Node(int date) {
            this.date = date;
        }
    }
    private static Node head;
    private static void push(int valor) {
        Node node = new Node(valor);
        node.next = head;
        head = node;
    }

    public static int pop() {
        int valor = head.date;
        head = head.next;
        return valor;
    }
    public boolean isempety() {
        return head == null;
    }

    public int peek() {
        return head.date;
    }

    

    public static void show() {
        Node current = head;
        while (current.next != null) {
            System.out.println("" + current.date);
            current = current.next;
        }
        System.out.println("" + current.date);
    }

    public static void main(String[] args) {
        //como usar- how to use
        push(20);
        push(12);
        push(546);
        push(54);
        push(454);
        push(454);
        pop();
        pop();
        show();
    }

}
