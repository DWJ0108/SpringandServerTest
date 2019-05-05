import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        //创建客户端socket对象
        Socket s = new Socket("localhost",9999);

        //封装文本文件
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("client.txt"));

        //封装通道内的流
        BufferedOutputStream bos = new BufferedOutputStream(s.getOutputStream());
        byte[] bys = new byte[1024];
        int len = 0;
        while ((len = bis.read(bys)) != -1){
            bos.write(bys,0,len);
            bos.flush();
        }
        s.shutdownOutput();

        // 读取反馈
        InputStream is = s.getInputStream();
        byte[] bys2 = new byte[1024];
        int len2 = is.read(bys2);
        String client = new String(bys2,0,len2);
        System.out.println(client);

        // 释放资源
        bis.close();
        s.close();
    }
}
