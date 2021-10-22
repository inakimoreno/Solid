package lsk;

public class ReadableWritableFile extends ProjectFile implements IReadableFile, IStoreableFile{

	public ReadableWritableFile(String filePath) {
		super(filePath);
	}
	
	public void storeFile() {
		System.out.println("file saved to "+filePath); 
	}
	
}
