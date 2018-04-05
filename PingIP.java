package ping;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PingIP {
    
     public static void runSystemCommand(String command) {

		try {
			Process process = Runtime.getRuntime().exec(command);
			BufferedReader inputStream = new BufferedReader(
					new InputStreamReader(process.getInputStream()));

			String string = "";
                        String stringLast = "";
			// reading output stream of the command
			while ((string = inputStream.readLine()) != null) {
                            System.out.println(string);
                            stringLast = string;
                               
			}
                        
                        int position = stringLast.indexOf("a");
                        int position2 = stringLast.indexOf("m", position);
                        String pingStr = stringLast.substring(position+4, position2);
                        
                        
                        Jframe frame = new Jframe();
                        frame.criarJanela(pingStr);
                        
                        

		} catch (Exception e) {
			e.printStackTrace();
		}
    
      }
}
