import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.TreeMap;

public class ThreeSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreeSum sum = new ThreeSum();
		System.out.println(sum.threeSum(new int[] {-1,0,1,2,-1,-4}));

	}

	public List<List<Integer>> threeSum(int[] nums) {
		HashSet<List<Integer>> list = new HashSet<>();
		if(nums.length<3)
			return new ArrayList<>(list);
		TreeMap<Integer, Integer> map = new TreeMap<>();
		for(int i=0;i<nums.length;i++) {
			map.put(nums[i],i);
		}


		for(int i=0;i<nums.length;i++) {
			for(int j=0;j<nums.length;j++) {
				if(i!=j) {
					if(map.containsKey(-(nums[i]+nums[j]))){
						if(map.get(-(nums[i]+nums[j]))!= i && map.get(-(nums[i]+nums[j]))!=j) {
							List<Integer> temp = new ArrayList<>();
							temp.add(nums[i]);
							temp.add(nums[j]);
							temp.add(-(nums[i]+nums[j]));
							Collections.sort(temp);
							list.add(temp);								
						}
					}
				}
			}
		}
		return new ArrayList<>(list);
	}

}
