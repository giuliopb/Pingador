package ping;

import static ping.PingIP.runSystemCommand;

public class Ping {

    
    public static void main(String[] args) {
      
        	String ip = "www.themoscowtimes.com";
		runSystemCommand("ping " + ip);
        
    }
    
}
