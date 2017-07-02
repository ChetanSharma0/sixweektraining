import java.awt.Image;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.swing.UIManager;

import net.glxn.qrgen.image.ImageType;

import com.google.zxing.qrcode.encoder.QRCode;


public class Qrcodegenart {
public static void main(String[] args) throws IOException {
	
	String s="Ram Sharma D:O:B 26/07/1997 Oracle Certified Java Programmer (Appointed as Sr Java Devloper in Oracle)";
	ByteArrayOutputStream out = net.glxn.qrgen.QRCode.from(s).to(ImageType.PNG).stream();

	File f = new File(System.getProperty("user.home")+"//Desktop//cs.png");
	
	FileOutputStream fis = new FileOutputStream(f);
	
	fis.write(out.toByteArray());

	fis.flush();
	
	
	System.out.println("suucees");
	
	
	
	
	
	
}
}
