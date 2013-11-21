package de.grovie.sandbox;

import de.grovie.engine.GvEngine;
import de.grovie.engine.GvEngine.GrovieEngineMode;
import de.grovie.exception.GvExceptionEngineNoEventListener;

public class GvSandbox {

	public static void main(String[] args) throws GvExceptionEngineNoEventListener
	{
		//start splash screen
		
		//get absolute path to database location
		
		//create GroViE vis. engine
		GvEngine engine = GvEngine.getInstance(); //uses embedded db by default
		
		//tell GroViE the classes to use for the opengl rendering, etc.
		GvGLEventListener sandboxListener = new GvGLEventListener();
		engine.setEventListener(sandboxListener);
		
		//start the visualization engine
		if(engine.getMode() == GrovieEngineMode.EMBEDDED)
		{
			engine.start("C:\\Users\\yong\\db"); //TODO: replace with path obtained from pop up dialog
		}
		
		//create and run rendering thread
		new GvWindow(engine);
		
		//obtain graph db from engine. 
		//if multi thread, create worker threads. give threads reference to db.
		
		//begin scene modifications on db (changes should be seen on the rendering window)
		
		//prevent sandbox application from closing until <Return> key is pressed
		/*try {
			System.in.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	}
}
