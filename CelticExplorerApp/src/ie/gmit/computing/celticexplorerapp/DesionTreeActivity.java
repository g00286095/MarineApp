package ie.gmit.computing.celticexplorerapp;

import java.util.ArrayList;
import java.util.List;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class DesionTreeActivity extends ActionBarActivity {

    private ListView lv;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_desion_tree);



	         lv = (ListView) findViewById(R.id.listViewNode);//set lv to list view

	         List<String> asd  = new ArrayList<String>();//string arraylist
	         asd.add("flexable");
	         asd.add("Fibmentous");
	         asd.add("Lorse 2D Shape");
	         asd.add("Fibre");
	         asd.add("Film");
	         asd.add("hard");
	         asd.add("can be squashed");
	         asd.add("styrene");
	         asd.add("Irregula shape");
	         asd.add("Smooth Edges");
	         asd.add("Resin Pellet");
	         asd.add("Cylindrical");
	         asd.add("Rounded");
	         asd.add("Oval Sphere");
	         
	         ArrayList<String> n= new ArrayList<String>();

	         //txtField = (EditText) findViewById(R.id.editText1); 

	         //add more items button
	         Button more = (Button) findViewById(R.id.button);
	         more.setOnClickListener(new View.OnClickListener() {

	             public void onClick(View view){

	           /*      String n=txtField.getText().toString().trim();
	                 if(n.length() != 0){
	                        n.add(n); 
	                        txtField.setText(""); // adds text to arraylist and make edittext blank again
	                 }*/
	             }
	         });

	         //add new string to array
	         Button done = (Button) findViewById(R.id.button);
	         done.setOnClickListener(new View.OnClickListener() {

	             public void onClick(View view){

	                 // start new activity
	                 Intent myIntent = new Intent(view.getContext(),
	                         DesionTreeActivity.class);             
	                 startActivity(myIntent);

	             }
	         });

	         
	         ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, asd);

	         lv.setAdapter(arrayAdapter); 
	    }
}
