package ie.gmit.computing.celticexplorerapp;

import java.security.PublicKey;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

public class CameraActivity extends Activity {

	ImageView imgCapture;
	
	   @Override
	   protected void onCreate(Bundle savedInstanceState) 
	   {
	      super.onCreate(savedInstanceState);
//use camera
	      setContentView(R.layout.activity_camera);
	      imgCapture = (ImageView)findViewById(R.id.imageViewCapture);
	      imgCapture.setOnClickListener(new OnClickListener() 
	      {
	         @Override
	         public void onClick(View v) 
	         {
	            open();
	         }
	      });
	      
	      //nav to decision tree page
	      Button btnNav = (Button) findViewById(R.id.btnNavigate);
	      btnNav.setOnClickListener(new View.OnClickListener()
	      {
	    	  public void onClick(View V)
	    	  {
	    		  Intent l = new Intent (CameraActivity.this, DesionTreeActivity.class);
	    		  startActivity(l);
	    	  }
	      });  
	      //nav to gps page
	      Button btnG = (Button) findViewById(R.id.btnGPS);
	      btnG.setOnClickListener(new View.OnClickListener()
	      {
	    	  public void onClick(View V)
	    	  {
	    		  Intent a = new Intent(CameraActivity.this, GPSActivity.class);
	    		  startActivity(a);
	    	  }
	      });
	    		  
	      
	   }
	   //capture image with camera
	   public void open(){
	      Intent intent = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
	      startActivityForResult(intent, 0);
	   }
//store image in bitmap
	   @Override
	   protected void onActivityResult(int requestCode, int resultCode, Intent data) {
	      // TODO Auto-generated method stub
	      super.onActivityResult(requestCode, resultCode, data);
	      Bitmap bp = (Bitmap) data.getExtras().get("data");
	      imgCapture.setImageBitmap(bp);
	   }
	   @Override
	   public boolean onCreateOptionsMenu(Menu menu) {
	      // Inflate the menu; this adds items to the action bar if it is present.
	      getMenuInflater().inflate(R.menu.main, menu);
	      return true;
	   }
}
