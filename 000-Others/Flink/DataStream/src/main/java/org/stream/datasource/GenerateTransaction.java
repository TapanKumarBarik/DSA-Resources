package org.stream.datasource;

import org.stream.model.Rule;
import org.stream.model.Transaction;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class GenerateTransaction {

    public static void main(String[] args) throws IOException {

        try {
            ServerSocket serverSocket = new ServerSocket(9000);
            Socket connectionSocket = serverSocket.accept();
            OutputStream outputFromServer = connectionSocket.getOutputStream();
            PrintWriter serverPrintOut = new PrintWriter(
                    new OutputStreamWriter(outputFromServer, "UTF8"), true);
            for (int i = 0; i < 1000000; i++) {
                Transaction t = new Transaction();
                t.setUserId((int) ((float) Math.random() * 10));
                t.setAmount((float) (Math.random() * 10000));
                t.setTransactionTime(Timestamp.valueOf(LocalDateTime.now()));

                Rule r1 = new Rule("MAX", 1000, 10);
                Rule r2 = new Rule("COUNT", 0, 100);
                if (i % 2 == 0) {
                    //even
                    List<Rule> ruleList = new ArrayList<>();
                    ruleList.add(r1);
                    t.setRule(ruleList);
                } else {
                    List<Rule> ruleList = new ArrayList<>();
                    ruleList.add(r2);
                    t.setRule(ruleList);
                }
                serverPrintOut.println(t);
                System.out.println("Server sends data::" + i + t.toString());
                Thread.sleep(2000);

            }

        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
