package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * @see <a href="boj.kr/5397">키로거</a>
 */
public class P05397 {
    // 왜 시간초과일까?
    static class TextEditor {
        private List<Character> text;
        private ListIterator iter;

        TextEditor() {
            text = new ArrayList<>();
            iter = text.listIterator();
        }

        public void left() {
            if (iter.hasPrevious())
                iter.previous();
        }

        public void right() {
            if (iter.hasNext())
                iter.next();
        }

        public void delete() {
            if (!iter.hasPrevious()) return;

            iter.previous();
            iter.remove();
        }

        public void add(char c) {
            iter.add(c);
        }

        public void print() {
            StringBuilder sb = new StringBuilder();
            for (Character c : text) {
                sb.append(c);
            }

            System.out.println(sb);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String password = br.readLine();
            TextEditor textEditor = new TextEditor();

            for (int j = 0; j < password.length(); j++) {
                char c = password.charAt(j);

                switch (c) {
                    case '<':
                        textEditor.left();
                        break;
                    case '>':
                        textEditor.right();
                        break;
                    case '-':
                        textEditor.delete();
                        break;
                    default:
                        textEditor.add(c);
                }
            }

            textEditor.print();
        }
    }
}

//! 스택 방식
//public class P05397 {
//    static class TextEditor {
//        private Stack<Character> leftStack;
//        private Stack<Character> rightStack;
//
//        TextEditor() {
//            leftStack = new Stack<>();
//            rightStack = new Stack<>();
//        }
//
//        public void left() {
//            if (!leftStack.empty())
//                rightStack.push(leftStack.pop());
//        }
//
//        public void right() {
//            if (!rightStack.empty())
//                leftStack.push(rightStack.pop());
//        }
//
//        public void delete() {
//            if (!leftStack.empty())
//                leftStack.pop();
//        }
//
//        public void add(char c) {
//            leftStack.push(c);
//        }
//
//        public void print() {
//            while (!leftStack.empty()) {
//                rightStack.push(leftStack.pop());
//            }
//
//            StringBuilder sb = new StringBuilder();
//            while (!rightStack.empty()) {
//                sb.append(rightStack.pop());
//            }
//
//            System.out.println(sb);
//        }
//    }
//
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        int n = Integer.parseInt(br.readLine());
//
//        for (int i = 0; i < n; i++) {
//            String password = br.readLine();
//            TextEditor textEditor = new TextEditor();
//
//            for (int j = 0; j < password.length(); j++) {
//                char c = password.charAt(j);
//
//                switch (c) {
//                    case '<':
//                        textEditor.left();
//                        break;
//                    case '>':
//                        textEditor.right();
//                        break;
//                    case '-':
//                        textEditor.delete();
//                        break;
//                    default:
//                        textEditor.add(c);
//                }
//            }
//
//            textEditor.print();
//        }
//    }
//}