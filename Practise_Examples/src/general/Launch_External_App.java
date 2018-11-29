package general;

import java.io.IOException;

public class Launch_External_App {

	public static void main(String[] args) {
		Runtime runtime = Runtime.getRuntime(); // getting Runtime object

		try {
			runtime.exec("notepad.exe"); // opens new notepad instance

			// OR runtime.exec("notepad");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/*Runtime runtime = Runtime.getRuntime();     //getting Runtime object
 
        String[] s = new String[] {"C:\\Program Files\\VideoLAN\\VLC\\vlc.exe", "F:\\sample.mp3"};
 
        Process process = runtime.exec(s);     */
	
	/*Runtime runtime = Runtime.getRuntime();     //getting Runtime object
 
        Process process = runtime.exec("notepad I:\\sample.txt");        //opens "sample.txt" in notepad
 
        Thread.sleep(5000);
 
        process.destroy();*/

}
