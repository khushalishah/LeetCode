import java.util.HashSet;

public class DistributeCandies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DistributeCandies dc = new DistributeCandies();
		System.out.println(dc.distributeCandies(new int[] {1,1,2,3}));

	}

	public int distributeCandies(int[] candies) {
		int totalCandies = candies.length;
		HashSet<Integer> diffCandies = new HashSet<>();
		for(int i=0;i<totalCandies;i++) {
			diffCandies.add(candies[i]);
		}
		int noOfDiffCandies = diffCandies.size();
		int candiesForSister = totalCandies/2;
		if(candiesForSister>noOfDiffCandies)
			return noOfDiffCandies;
		else
			return candiesForSister;
	}

}
