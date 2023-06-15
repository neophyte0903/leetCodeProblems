class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set=new HashSet<>();
        HashSet<Integer> intersect=new HashSet<>();

        for(int i : nums1 ){
            set.add(i);
        }

        for(int i : nums2 ){
            if(set.contains(i)){
                intersect.add(i);
            }
        }

        int size=intersect.size();
        int[] arr=new int[size];
        int indx=0;

        for(int i : intersect){
            arr[indx++]=i;
        }

        return arr;
    }
}
