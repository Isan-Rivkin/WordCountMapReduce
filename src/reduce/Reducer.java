package reduce;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Reducer implements IReduce
{
	List<HashMap<String,Integer>> files = new ArrayList<>();
	@Override
	public void addFile(HashMap<String,Integer> file)
	{
		files.add(file);
	}
	@Override
	public void addFiles(List<HashMap<String, Integer>> files) {
		files.forEach((f)->{
			this.files.add(f);
		});
	}

	@Override
	public HashMap<String, Integer> reduce() {
		HashMap<String,Integer> final_map = new HashMap<>();
		files.forEach((file_map)->
		{
			file_map.forEach((k,v)->
			{
				if(final_map.containsKey(k))
				{
					final_map.put(k,final_map.get(k) + v);
				}
				else
				{
					final_map.put(k,v);
				}
			});
		});
		return final_map;
	}


}
