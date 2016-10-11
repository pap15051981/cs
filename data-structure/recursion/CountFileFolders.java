import java.io.File;

class CountFilesFolders {

	static int files = 0;
	static int folders = 0;

	public static void main(String[] argv) {
		countFilesFolders("./test");
		System.out.print("Files : ");
		System.out.println(files);
		System.out.print("Folders : ");
		System.out.println(folders);
	}

	
	static void countFilesFolders(String path) {
		folders++;

		File f = new File(path);

		File[] list = f.listFiles();
		for(File item : list) {
			if (item.isFile()) {
				files++;
			}
			else {
				countFilesFolders(item.getPath());		
			}
		}

		return;
	}

}
