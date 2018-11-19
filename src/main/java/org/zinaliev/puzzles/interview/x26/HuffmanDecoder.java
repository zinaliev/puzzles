package org.zinaliev.puzzles.interview.x26;

import java.util.ArrayList;
import java.util.List;

public class HuffmanDecoder {

    public static final char NEW_LINE = '\n';
    public static final String SEPARATOR = "\t";

    public static void main(String[] args) {

        List<String> codes = new ArrayList<>();

        codes.add("a	100100");
        codes.add("b	100101");
        codes.add("c	110001");
        codes.add("d	100000");
        codes.add("[newline]	111111");
        codes.add("p	111110");
        codes.add("q	000001");

        System.out.println(decode(codes, "111110000001100100111111100101110001111110"));
        System.out.println("---------");
        System.out.println(decode(codes, ""));
        System.out.println("---------");

    }

    public static String decode(List<String> codes, String encoded) {
        StringBuilder result = new StringBuilder();

        Dictionary.StreamDecoder decoder = createDictionary(codes).createDecoder();

        for (int i = 0; i < encoded.length(); i++) {
            Character decoded = decoder.read(encoded.charAt(i));

            if (decoded != null)
                result.append(decoded);
        }

        return result.toString();
    }

    private static Dictionary createDictionary(List<String> codes) {

        Dictionary result = new Dictionary();

        String[] split;
        for (String code : codes) {
            split = code.split(SEPARATOR);

            String encodedStr = split[1];
            String valueStr = split[0];

            Character value;

            if (valueStr.length() == 1)
                value = valueStr.charAt(0);
            else // assuming it's '[newline]' (task constraints guarantee valid input)
                value = NEW_LINE;

            result.addEntry(encodedStr.toCharArray(), value);
        }

        return result;
    }

    public static class Dictionary {

        public static final char ZERO = '0';

        private final Node root = new Node();

        public void addEntry(char[] encoded, Character value) {
            Node current = root;

            for (char c : encoded) {

                if (c == ZERO) {
                    if (current.left == null)
                        current.left = new Node();

                    current = current.left;
                } else { // c is '1' since no values except 0 and 1 are possible (task constraints guarantee valid input)
                    if (current.right == null)
                        current.right = new Node();

                    current = current.right;
                }
            }

            current.value = value;
        }

        public StreamDecoder createDecoder() {
            return new StreamDecoder(root);
        }

        public static class StreamDecoder {

            private final Node root;
            private Node curr;

            private StreamDecoder(Node root) {
                this.root = root;
                this.curr = root;
            }

            private Character read(char enc) {

                if (enc == ZERO)
                    curr = curr.left;
                else // enc is '1' since no values except 0 and 1 are possible (task constraints guarantee valid input)
                    curr = curr.right;

                Character result = curr.value;

                if (result != null)
                    curr = root;

                return result;
            }
        }

        private static class Node {
            Node left;
            Node right;
            Character value;
        }
    }

}
