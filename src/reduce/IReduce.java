package reduce;

import java.util.HashMap;
import java.util.List;

public interface IReduce
{
	public void addFile(HashMap<String,Integer> file);
	public void addFiles(List<HashMap<String,Integer>> files);
	public HashMap<String,Integer> reduce();
}
