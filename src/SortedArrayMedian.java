
public class SortedArrayMedian {


	public static void main(String args[]) {
		SortedArrayMedian m = new SortedArrayMedian();
		System.out.println(m.findMedianSortedArrays(new int[] {1,2,3,4}, new int[] {}));
	}

	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int i1=0,i2=0,index=0;
		int length = nums1.length + nums2.length;
		boolean odd = true;
		if(length%2==0)
			odd = false;
		int check = odd?(length+1)/2:(length/2);
		int first = 0;

		while(index!=check) {
			if(i1<nums1.length) {
				if(i2<nums2.length) {
					if(nums1[i1]<nums2[i2]) {
						first = nums1[i1];
						i1++;
					}else {
						first = nums2[i2];
						i2++;
					}
				}else {
					first = nums1[i1];
					i1++;
				}
			}else if(i2<nums2.length) {
				first = nums2[i2];
				i2++;
			}
			index++;
		}
		
		 if(odd) {
	    	   return first;
	       }else {
	    	   if(i1<nums1.length) {
					if(i2<nums2.length) {
						if(nums1[i1]<nums2[i2]) {
							return (first+nums1[i1])/2.0;
						}else {
							return (first+nums2[i2])/2.0;
						}
					}else {
						return (first+nums1[i1])/2.0;
					}
				}else if(i2<nums2.length) {
					return (first+nums2[i2])/2.0;
				}
	    	   return 0;
	       }
	}


}
