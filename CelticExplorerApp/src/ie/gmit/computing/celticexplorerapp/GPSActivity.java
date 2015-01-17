package ie.gmit.computing.celticexplorerapp;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.widget.TextView;

import android.util.Log;

public class GPSActivity extends ActionBarActivity implements LocationListener {

	protected LocationManager locationManager;
	protected LocationListener locationListener;
	protected Context context;
	TextView txtLat;
	String lat;
	String provider;
	protected String latitude,longitude; 
	protected boolean gps_enabled,network_enabled;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_gps);
		txtLat = (TextView) findViewById(R.id.textviewGPS);

		locationManager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
		locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 0, 0, this);
		}
	
	public void onLocationChanged(Location location) {
		txtLat = (TextView) findViewById(R.id.textviewGPS);
		txtLat.setText("Latitude:" + location.getLatitude() + ", Longitude:" + location.getLongitude());
		}
		// check if gps disables
		public void onProviderDisabled(String provider) {
		Log.d("Latitude","disable");
		}

		// check if gps eabled
		public void onProviderEnabled(String provider) {
		Log.d("Latitude","enable");
		}

	
		public void onStatusChanged(String provider, int status, Bundle extras) {
		Log.d("Latitude","status");
		}

}
