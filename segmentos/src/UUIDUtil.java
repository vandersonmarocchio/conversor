import java.net.NetworkInterface;
import java.util.Enumeration;

public class UUIDUtil {

    private static String macAddress;
    private static long lastLocalId;

    protected UUIDUtil() {

    }

    /**
     * Gera UUID
     * @return UUID
     */
    public static synchronized String generate() {
        long localId = System.currentTimeMillis()*100000;

        while (localId <= lastLocalId) {
            localId++;
        }

        lastLocalId = localId;

        return "" + Long.toHexString(localId).toUpperCase() + String.format("%06X", ((long)( Math.random() * 0x1000000))) + getMacValue();
    }

    /**
     * Identifica endereço de MAC
     * @return MAC
     */
    private static String getMacValue() {
        if(macAddress == null) {
            String toReturn = "";
            try {
                Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
                while (networkInterfaces.hasMoreElements()) {
                    NetworkInterface network = networkInterfaces.nextElement();
                    byte[] mac = network.getHardwareAddress();
                    if (mac == null) {
                        continue;
                    }
                    StringBuilder sb = new StringBuilder();
                    for (int i = 0; i < mac.length; i++) {
                        sb.append(String.format("%02X", mac[i]));
                    }
                    toReturn += sb.toString();
                    break;
                }

            } catch (Exception ex) {
                ex.printStackTrace();
            }
            if (toReturn.length() == 0) {
                macAddress = "6D756E696666";
                return macAddress;
            }
            macAddress = toReturn;
            return macAddress;
        }

        return macAddress;
    }
}