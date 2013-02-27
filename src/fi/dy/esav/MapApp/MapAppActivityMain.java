package fi.dy.esav.MapApp;

import java.util.List;

import android.app.Activity;
import android.location.Location;
import android.location.LocationManager;
import android.os.Bundle;

public class MapAppActivityMain extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        getStatus();
        
    }
    
    int getStatus() {
    	LocationManager manager = (LocationManager) this.getSystemService(LOCATION_SERVICE);
        List<String> providers = manager.getAllProviders();
        for(String provider : providers) {
        	System.out.println("Available location provider: " + provider);
        	Location loc = manager.getLastKnownLocation(provider);
        	//loc.getAccuracy()
        	
        }
        
        return 0;
    }
}
