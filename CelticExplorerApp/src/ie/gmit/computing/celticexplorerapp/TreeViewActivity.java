package ie.gmit.computing.celticexplorerapp;

import java.util.ArrayList;
import java.util.List;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

public class TreeViewActivity extends ActionBarActivity 
{
/*
	int i;
	private Node currentNode;
	
	public void refreshScreen(Node node)
	{
		setContentView(R.layout.activity_tree_view);
		LinearLayout buttons = (LinearLayout) findViewById(R.id.dynamicBtn);
		Button backBtn = (Button) findViewById(R.id.back);
		backBtn.setOnClickListener(new View.OnClickListener() 
		{
			public void onClick(View view)
			{
				if(currentNode.getParent() != null)
				{
					refreshScreen(currentNode.getParent());
				}
			}
		});
		currentNode = node;
		TextView title = (TextView) findViewById(R.id.current);
		title.setText(currentNode.getName());
		if(currentNode.getChildren() != null)
		{
			List<Node> children = currentNode.getChildren();
			for (i = 0; i < children.size(); i++) 
			{
				Button button = new Button(this);
				button.setText(children.get(i).getName().toString());
				button.setId(i);
				final int buttonID = button.getId();
				buttons.addView(button);
				button.setOnClickListener(new View.OnClickListener() 
				{
					public void onClick(View view)
					{
						refreshScreen(currentNode.getChildren().get(buttonID));
					}
				});
			}
		}
	}
*/
}
