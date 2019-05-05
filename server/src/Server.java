import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        // 创建服务端
        ServerSocket ss = new ServerSocket(9999);

        // 监听客户端连接
        Socket s = ss.accept();

        //封装通道内流
        BufferedInputStream bis = new BufferedInputStream(s.getInputStream());

        //封装文本文件
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("server.txt"));

        byte[] bys = new byte[1024];
        int len = 0;
        while ((len = bis.read(bys)) != -1){
            bos.write(bys,0,len);
            bos.flush();
        }
        // 反馈
        OutputStream os = s.getOutputStream();
        os.write("文本文档上传成功".getBytes());

        bos.close();
        s.close();
    }
}