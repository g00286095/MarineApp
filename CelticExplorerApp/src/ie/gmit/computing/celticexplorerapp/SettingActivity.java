package ie.gmit.computing.celticexplorerapp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SettingActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_settings);
	}

    public void SaveText(View view){    
        
        try {

             // open .txt file for writing
             OutputStreamWriter out= new OutputStreamWriter(openFileOutput("CelticExplorerInfo.txt",MODE_APPEND));
             // write the contents to the file

             EditText ET = (EditText)findViewById(R.id.txtUser);
             EditText ET1 = (EditText)findViewById(R.id.txtShip);
             EditText ET2 = (EditText)findViewById(R.id.txtEmail);
             String text = ET.getText().toString();
              out.write(text);
              out.write('\n');   
           
             // close the file
             out.close();
             
             //Toast notification when saved
             Toast.makeText(this,"Text Saved !",Toast.LENGTH_LONG).show();
           } 

			catch (java.io.IOException e) 
			{
			
			    //prompt error message
				Toast.makeText(this,"Sorry Text could't be added",Toast.LENGTH_LONG).show();
           }
    }
    public void ViewText (View view){    
        
        StringBuilder text = new StringBuilder();
       
       
        try {           
               InputStream instream = openFileInput("myfilename.txt");//open the text file for reading
               
               // if file the available for reading
               if (instream != null) 
               {                	    
                 // prepare the file for reading
                 InputStreamReader inputreader = new InputStreamReader(instream);
                 BufferedReader buffreader = new BufferedReader(inputreader);
                  
                 String line=null;
                 //initialize a string "line" 
                 
                 while (( line = buffreader.readLine()) != null) 
                 {
                   //buffered reader reads only one line at a time, hence we give a while loop to read all till the text is null
                                           
                 	text.append(line);    
                    text.append('\n');    //to display the text in text line        
                            
                 }
               }
              }    
                   
                //catch statement for exceptions
               catch (IOException e) {
                   e.printStackTrace();
               }
       
                //read textview in file
                TextView tv = (TextView)findViewById(R.id.txtUser);
                TextView tv1 = (TextView)findViewById(R.id.txtShip);
                TextView tv2 = (TextView)findViewById(R.id.txtEmail);
                tv.setText(text); 
                tv1.setText(text);
                tv2.setText(text);
                
    }
}
