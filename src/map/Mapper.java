package map;

import java.util.HashMap;
import java.util.List;

public class Mapper implements IMap {

	@Override
	public HashMap<String, Integer> map(List<String> file) 
	{
		HashMap<String, Integer> map= new HashMap<>();
		file.forEach((s)->{
			if(map.containsKey(s))
			{
				map.put(s,map.get(s)+1);
			}
			else
			{
				map.put(s, 1);
			}
		});
		return map;
	}

}
