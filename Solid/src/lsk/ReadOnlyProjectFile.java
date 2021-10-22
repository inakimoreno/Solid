package lsk;

public class ReadOnlyProjectFile extends ProjectFile implements IReadableFile{
	
	public ReadOnlyProjectFile(String filePath) {
		super(filePath);
	}
	
}
