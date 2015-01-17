package ie.gmit.computing.celticexplorerapp;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import android.support.v7.app.ActionBarActivity;
import android.media.Image;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class Node implements Serializable {

	private String name;//set string as "name"
	private static final long serialVersionUID = 777L;
	private Node parent;
	private List <Node> children = new ArrayList<Node>();//set nodes as children
	private Object image;


	public Node(String name,Node parent) //set name and parent of node
	{
		this.name = name;
		this.parent = parent;
	}

	public void setParent(Node parent)
	{
		this.parent = parent;
		
	}
	
	public Node getParent()
	{
		return this.parent;
	}

	public void addChild(Node child)
	{
		children.add(child);
	}
	public void removeChild(Node child)
	{
		children.remove(child);
	}
	
	public void insertChild(Node next, Node existing)
	{

	}
	public Node[] children()//array of child nodes
	{
		Node[] temp = new Node[children.size()];
		for (int i = 0; i < children.size(); i++)
		{
			temp [i] = children.get(i);
		}
		return temp;
		//return (Node[]) children.toArray();
	}
	public boolean isLeaf()//last node = 0
	{
		return children.size() == 0;
	}
	public boolean isRoot()//set parent with null value
	{
		return this.parent == null;
	}

	public boolean hasImage()//check for image
	{
		return this.image != null;
	}
	
	public <ImageIcon> ImageIcon getImage() 
	{
		return getImage();
	}

	public void setImage(Image image) 
	{
		this.image = image;
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Bundle getChildren() {
		// TODO Auto-generated method stub
		return null;
	}
}
