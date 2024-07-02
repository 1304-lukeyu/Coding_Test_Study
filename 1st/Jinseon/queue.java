import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Queue<Integer> q = new LinkedList<>();
        int sizes = Integer.parseInt(br.readLine());

        for (int i = 0; i < sizes; i++) {
            String respond = br.readLine();

            if (respond.startsWith("push")) {
                // ���� �ֱ�
                int value = Integer.parseInt(respond.split(" ")[1]);
                q.add(value);
            } else if (respond.startsWith("pop")) {
                // ���� �տ� �ִ� ���� ����
                Integer removedValue = q.poll();
                if (removedValue == null) {
                    bw.write("-1\n");
                } else {
                    bw.write(String.valueOf(removedValue) + "\n");
                }
            } else if (respond.startsWith("size")) {
                // ť�� ����ִ� ������ ����
                bw.write(String.valueOf(q.size()) + "\n");
            } else if (respond.startsWith("empty")) {
                // ť�� ������� 1, �ƴϸ� 0
                bw.write(q.isEmpty() ? "1\n" : "0\n");
            } else if (respond.startsWith("front")) {
                // ť�� ���� �տ� �ִ� ���� ���, ������ -1
                if (q.isEmpty()) {
                    bw.write("-1\n");
                } else {
                    bw.write(String.valueOf(q.peek()) + "\n");
                }
            } else if (respond.startsWith("back")) {
                // ť�� ���� �ڿ� �ִ� ���� ���, ������ -1
                if (q.isEmpty()) {
                    bw.write("-1\n");
                } else {
                    LinkedList<Integer> linkedList = (LinkedList<Integer>) q;
                    bw.write(String.valueOf(linkedList.getLast()) + "\n");
                }
            }
        }
        // ���� ����
        bw.flush();
    }
}
