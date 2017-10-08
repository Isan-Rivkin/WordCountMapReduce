package wordCounter;

import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Future;

public interface ICounter
{
	public HashMap<String, Integer> executeCountWords(List<String> words, int files_num);
	public List<List<String>> split(List<String> data, int files_num);
	public HashMap<String, Integer> map(List<String> file);
	public HashMap<String,Integer> reduce(List<HashMap<String, Integer>> files);
}
