package main.dtable.skynet.util;

import org.zeromq.ZMQ;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by skyRay on 2017/1/20.
 */
public class ZreoUtil {
    private static ExecutorService cachedThreadPool;

    static {
        if (cachedThreadPool == null) {
            cachedThreadPool = Executors.newCachedThreadPool();
        }
    }

    public static void sendMessage(final String message) {
        cachedThreadPool.execute(new Runnable() {
            public void run() {
                ZMQ.Socket socket =null;
                ZMQ.Context context=null;
                try {
                    context = ZMQ.context(1);  //创建一个I/O线程的上下文
                    socket = context.socket(ZMQ.REQ);   //创建一个request类型的socket，这里可以将其简单的理解为客户端，用于向response端发送数据
                    socket.connect("tcp://10.158.240.199:5558");   //与response端建立连接
                    socket.send(message);   //向reponse端发送数据
                    byte[] response = socket.recv();
                    System.out.println(response.toString());
                } catch (Exception e) {
                    e.printStackTrace();
                }finally {
                    if(socket!=null){
                        socket.close();
                    }
                    if(context!=null){
                        //关闭当前上下文
                        context.term();
                    }
                }
            }
        });
    }
}
