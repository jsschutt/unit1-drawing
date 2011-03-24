import java.io.File;

/**
 *
 */

/**
 * @author Senthil
 *
 */
public class DocProxy implements Draw{

	private Draw draw;
	private String drawFilePath;

	/*
	 * Defult proxy
	 */
	public DocProxy(){

	}

	/**
	 * Open a file.
	 */
	public DocProxy(String drawFilePath) {
		// TODO Auto-generated constructor stub
		this.drawFilePath = drawFilePath;
	}
	/*
	 * creates a document system that consist of all the
	 * shapes and command.
	 */
	public void showDraw(){
		draw = new Document( drawFilePath);
	}



	public void dispose() {
		// TODO Auto-generated method stub

	}

	public void readFromFile() {
		// TODO Auto-generated method stub

	}

	public void writeToFile(File file) {
		// TODO Auto-generated method stub

	}

}
