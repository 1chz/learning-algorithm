package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

/**
 * @see <a href="boj.kr/1406">에디터</a>
 */

public class P01406 {
    static class TextEditor {
        private Stack<Character> leftStack;
        private Stack<Character> rightStack;

        public TextEditor(String text) {
            leftStack = new Stack<>();
            rightStack = new Stack<>();

            for (int i = 0; i < text.length(); i++) {
                leftStack.push(text.charAt(i));
            }
        }

        private void left() {
            if (!leftStack.empty())
                rightStack.push(leftStack.pop());
        }

        private void right() {
            if (!rightStack.empty())
                leftStack.push(rightStack.pop());
        }

        private void back() {
            if (!leftStack.empty())
                leftStack.pop();
        }

        private void put(char c) {
            leftStack.push(c);
        }

        private void print() {
            StringBuilder sb = new StringBuilder();
            while (!leftStack.empty()) {
                rightStack.push(leftStack.pop());
            }

            while (!rightStack.empty()) {
                sb.append(rightStack.pop());
            }

            System.out.println(sb);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        String text = br.readLine();
        int m = Integer.parseInt(br.readLine());

        TextEditor textEditor = new baekjoon.P01406.TextEditor(text);

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());

            switch (st.nextToken()) {
                case "L":
                    textEditor.left();
                    break;

                case "D":
                    textEditor.right();
                    break;

                case "B":
                    textEditor.back();
                    break;

                case "P":
                    textEditor.put(st.nextToken().charAt(0));
                    break;
            }
        }

        textEditor.print();
    }

    //시간 초과 코드..
//    static class TextEditor {
//        private List<Character> texts;
//        private ListIterator iter;
//
//        public TextEditor(String text) {
//            texts = new ArrayList<>();
//            iter = texts.listIterator();
//
//            for (int i = 0; i < text.length(); i++) {
//                iter.add(text.charAt(i));
//            }
//        }
//
//        private void left() {
//            if (iter.hasPrevious())
//                iter.previous();
//        }
//
//        private void right() {
//            if (iter.hasNext())
//                iter.next();
//        }
//
//        private void back() {
//            if (!iter.hasPrevious()) return;
//
//            iter.previous();
//            iter.remove();
//        }
//
//        private void put(char c) {
//            iter.add(c);
//        }
//
//        private void print() throws IOException {
//            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//            for (Character c : texts) {
//                bw.write(c);
//            }
//
//            bw.flush();
//            bw.close();
//        }
//    }
//
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st;
//
//        String text = br.readLine();
//        int m = Integer.parseInt(br.readLine());
//
//        TextEditor textEditor = new TextEditor(text);
//
//        Arrays.asList();
//
//        for (int i = 0; i < m; i++) {
//            st = new StringTokenizer(br.readLine());
//
//            switch (st.nextToken()) {
//                case "L":
//                    textEditor.left();
//                    break;
//
//                case "D":
//                    textEditor.right();
//                    break;
//
//                case "B":
//                    textEditor.back();
//                    break;
//
//                case "P":
//                    textEditor.put(st.nextToken().charAt(0));
//                    break;
//            }
//        }
//
//        textEditor.print();
//    }
}