ort java.net.*;

public class JavaFileDownloadExample{
	public static void main(String[] args) throws IOException{

		String fileUrl= "http://www.roseindia.net/java/beginners/CreateDirectory.java";
		URL url = new URL(fileUrl);
		BufferedInputStream bufferedInputStream = new BufferedInputStream(url.openStream());
		FileOutputStream fileOutputStream =new  FileOutputStream("sampleFile.txt");
		BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream, 1024);

		byte data[] = new byte[1024];
		while(bufferedInputStream.read(data, 0, 1024) >=0 )
		{
			bufferedOutputStream.write(data);
		}

		bufferedOutputStream.close();
		bufferedInputStream.close();
	}				
	byte data[] = new byte[1024];
while(bufferedInputStream.read(data, 0, 1024) >=0 )
{
	bufferedOutputStream.write(data);
}
#feature202 changes by venkat for the module Reports on 24-mar-2022
public static void main(String[] args) {
    int result;

    // call the method
    // store returned value to result
    result = square(10);

    System.out.println("Squared value of 10 is: " + result);
  }
}
}