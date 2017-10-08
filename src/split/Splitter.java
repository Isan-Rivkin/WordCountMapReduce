package split;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Splitter implements ISplit
{

	@Override
	public List<List<String>> split(List<String> data, int files)
	{
		List<List<String>> splited = new ArrayList<>();
		int reminder = data.size() % files;
		int partition_size = (int) data.size()/files;
		int last_partition_size = partition_size+reminder;
		int begin_partition_idx =0;
		for(int i=0;i<files-1;++i)
		{
			List<String> f =null;
			f = data.subList(begin_partition_idx, begin_partition_idx+partition_size);
			begin_partition_idx += partition_size;
			splited.add(f);
		}
		List<String> last = data.subList(begin_partition_idx, data.size());
		splited.add(last);
		return splited;
	}
	
	
}
