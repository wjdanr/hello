import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;

public class getLocalMacAddress {
    public static void main(String[] args) {
        System.out.println("MAC Address :" + getLocalMacAddress());

    }
    //로컬 맥 주소를 가져오는 메소드
    public static String getLocalMacAddress() {
        String result = "";
        InetAddress ip;

        try {
            ip = InetAddress.getLocalHost();

            NetworkInterface network = NetworkInterface.getByInetAddress(ip);
            byte[] mac = network.getHardwareAddress();

            StringBuffer sb = new StringBuffer();
            for (int i=0; i<mac.length; i++) {
                sb.append(String.format("%02X%s", mac[i], (i < mac.length -1) ? "_" : ""));

            }
                result = sb.toString();

        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (SocketException e) {
            e.printStackTrace();
        }
        return  result;
    }
}