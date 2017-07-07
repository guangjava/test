package string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConvertSubStr {
	/**将给定字符串数组转换成不重复的前缀子字符串，位数为前1位到3位，如果前3位重复则转换为首字母加递增数字
	 * @param list
	 * @return
	 * @exception
	 * @author zhouchenguang
	 * @date 2016年11月17日下午4:06:43
	 * @since 1.0.0
	 */
	public static Map<String, String> getJsonProperty(List<String> list){
		Map<String, String> result = new HashMap<>();
		for (String string : list) {
			if (string==null || string.trim().equals("")) {
				continue;
			}
			//去前缀最多次数
			int n = string.length()<4 ? string.length() : 4;
			String prefix = "";
			for (int i = 1; i < n; i++) {
				prefix = string.substring(0, i);
				//不重复则跳出
				if (!result.containsValue(prefix)) {
					break;
				}
			}
			String start = string.substring(0, 1);
			for(int i=0;result.containsValue(prefix) ;i++){
				prefix = start+i;
			}
			result.put(string, prefix);
		}
		return result;
	}
	
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("main");
		list.add("coinsList");
		list.add("applicant");
		list.add("insuredList");
		list.add("rationList");
		list.add("itemCarList");
		list.add("limitList");
		list.add("planList");
		list.add("engageList");
		list.add("agent");
		Map<String, String> map = getJsonProperty(list);
		for(String key : map.keySet()){
			System.out.println(key + ":" + map.get(key));
		}
	}
}
