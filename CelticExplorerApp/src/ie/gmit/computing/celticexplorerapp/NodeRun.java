package ie.gmit.computing.celticexplorerapp;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class NodeRun
{
	///setting node names and adding children(I am aware there shouldnt be a main method with android but couldnt resolve errors)
	public static void main(String[] args) throws Exception
	{
		Node root = new Node("Start", null);
		
		
		Node solid = new Node ("Solid", root);
		root.addChild(solid);
		
		Node hard = new Node ("Hard", solid);
		solid.addChild(hard);
		
		Node irEdges = new Node ("Iregular Edges", hard);
		hard.addChild(irEdges);
		
		Node smooth = new Node ("Smooth Edge", hard);
		solid.addChild(smooth);
		
		Node squashed = new Node ("Can be squashed", solid);
		//squashed.setImage(new ImageIcon("me.png"));	//DCIM/photos/.....
		solid.addChild(squashed);
		
		Node styrene = new Node ("Styrene", squashed);
		squashed.addChild(styrene);

		Node resin = new Node ("Resin Pellets", smooth);
		smooth.addChild(resin);
		
		Node cylindrical = new Node ("Cylindrical", resin);
		resin.addChild(cylindrical);

		
		Node flexible = new Node ("Flexible", root);
		root.addChild(flexible);
		
		Node fibmentous = new Node ("Fibmentous", flexible);
		flexible.addChild(fibmentous);
		
		Node Lorse = new Node ("Lorse 2D Surface", flexible);
		flexible.addChild(Lorse);
		
		Node fibre = new Node ("Fibre", fibmentous);
		fibmentous.addChild(fibre);
		
		Node film = new Node ("Film", Lorse);
		root.addChild(flexible);
		
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("tree.ser"));
		
		out.writeObject(root);
		out.flush();
		out.close();
		
		//Load the tree
		ObjectInputStream in = new ObjectInputStream(new FileInputStream(new File("tree.ser")));
		
		root = (Node) in.readObject();
		System.out.println(root.getName());
	}
}
