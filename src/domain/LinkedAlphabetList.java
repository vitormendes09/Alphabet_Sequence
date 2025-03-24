package domain;

public class LinkedAlphabetList implements AlphabetList {

    private static class Node {
        char letter;
        Node next;

        Node(char letter) {
            this.letter = letter;
            this.next = null;
        }
    }

    private Node head;

    @Override
    public void add(char letter) {
        Node newNode = new Node(letter);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }


    @Override
    public String getLettersUpTo(int position) {
        if (position < 1 || position > 26) {
            throw new IllegalArgumentException("Número inválido! Escolha entre 1 e 26.");
        }

        StringBuilder result = new StringBuilder();
        Node temp = head;
        int count = 1;

        while (temp != null && count <= position) {
            result.append(temp.letter).append(" ");
            temp = temp.next;
            count++;
        }

        return result.toString().trim();
    }
}
