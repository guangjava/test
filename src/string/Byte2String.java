package string;

import java.io.IOException;
import java.io.InputStream;


public class Byte2String {
	protected final long _address;
	protected final static byte[] _uuidBytes = new byte[16];
	private static String getResponseXML() throws IOException {
		String fileName = "response.xml";
		InputStream is = Byte2String.class.getResourceAsStream(fileName);
		byte[] buff = new byte[4096];
		StringBuffer sb = new StringBuffer();
		while(is.read(buff) > 0){
			String string = new String(buff, "UTF-8");
			sb.append(string);
		}
		return sb.toString();
	}
	public void toByteArray(byte[] array, int pos)
    {
        if (pos < 0 || (pos + 6) > array.length) {
            throw new IllegalArgumentException("Illegal offset ("+pos+"), need room for 6 bytes");
        }
        int i = (int) (_address >> 32);
        array[pos++] = (byte) (i >> 8);
        array[pos++] = (byte) i;
        i = (int) _address;
        array[pos++] = (byte) (i >> 24);
        array[pos++] = (byte) (i >> 16);
        array[pos++] = (byte) (i >> 8);
        array[pos] = (byte) i;
    }
	
	public Byte2String(long _address) {
		this._address = _address;
	}
	public static void main(String[] args) {
		
	}
}
