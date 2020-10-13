/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package http_server;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;
/**
 *
 * @author PeckT
 */
public class HTTP_Server {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(8080);
        System.out.println("Listening fo response on port 8080...");
        while(true){
            Socket clientSocket = server.accept();
            InputStreamReader isr = new InputStreamReader(clientSocket.getInputStream());
            BufferedReader reader = new BufferedReader(isr);
            String line = reader.readLine();
            while(!line.isEmpty())
            {
                System.out.println(line);
                line = reader.readLine();
            }
         /*  try (Socket socket = server.accept()) {
               Date today = new Date();
           String httpResponse = "HTTP/1.1 200 OK\r\n\r\n" + today;
           socket.getOutputStream().write(httpResponse.getBytes("UTF-8"));
           }*/

        }
    }
    
}
