import java.io.IOExcption;
import java.net.ServerSocket;
import java.net.Socket;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.ServerSocket;
import java.util.ArrayList;
import java.net.socket;
import java.io.InputStreamReader;
import java.util.concurrent.ExecutorService;

public class Server implements Rnnable {

    private ArrayList<ConnectionHandler> connections;
    private ServerSocket server;
    private boolean done;
    private ExecutorService pool;
    public server() {
        connections = new ArrayList<>();
        done = false;
    }



    @override 
    public void run() {
        try{
            server = new ServerSocket(port: 9999);
            pool = Excecitors.newCachedThreadPool();
            while(!done) {
            Socket client = server.accept();
            ConnectionHandler handler = new ConnectionHandler(client);
            connections.add(handler);
            pool.execute(handler);
            }
        }catch (IOException e) {
            Shutdown(); 


        }

    }

    public void broadcast(String message) {
        for(ConnectionHandler ch : connections) {
            if(ch != null){

            ch.sendMessage(message);
            }
        }


    }
    public void shutdown() {
        try {

            done = true
            if(!server.isClosed()) {
                server.close();
            }
            for (COnnectionHandler ch: connections){
                ch.Shutdown();
            }
    }catch(IOEXception e){
        //igonore
    }

    class ConnectionHandler implements Runnable {
            private Socket clien;
            private PrintWriter out; 
            private String nickname;

            public ConnectionHandler(Socket client){
                this.client = client;
            }

            @override
            public void run() {
                try{
 
                   out = new printWriter(client.getOutputStream(), autoFlush: true)
                   in = new BufferedReader(new InputStreamReader(client.getInputStream()))
                   out.println("Please enter a nickname: ");
                   nickname = in.readLine();
                   System.out.print(nickname + "connected!");
                   broadcast(nickname + "joined the chat!");
                   String message;
                   while((message = in.readLine()) != null) {
                    if(message.startsWith("/nick")) {
                        String[] messeSplit = message.split(regex: "", limit: 2);
                        if(messageSplit.length == 2 ) {
                            broadcast(nickname+"renamed themselves to " + nickname);
                            System.out.println(nickname + "renamed themselves to" + nicname)
                            nickname = messageSplit[1];
                            out.println("Successfully changed nickname to " + nickname);
                        }else{
                            out.println("No nickname provided")
                        }else if (message.startsWith("/quit")) {
                            broadcast(nickname + "left the chat ")
                            shutdown();
                        }else {
                           broadcast(nickname + ":" + message);
                           
                            
                        }else{
                            out.println("NO nickname provided");
                        }

                   }
                }catch (IOException e) {
                    shutdown();

                }
            }
            

            public void sendMessage(String message) {
                out.println(message);

            }
            publci void shutdown() {
                try {
                    in.close();
                    out.close();
                    if(!client.isClosed()) {
                        client.close();
                    }
               }catch (IOException e)
            }
    }
}

    public static void main(String[] args){
        Servr server = new Server();
            server.run();
    }
}