class Solution {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        // when entered zero or neagtive
        if (numRows<=0) return ans;
        //stores info for uppper triange
        ArrayList<Integer> prev = new ArrayList<Integer>();
        prev.add(1); // first row
        ans.add(prev); //adding first row into ans
        //for next rows
        for(int i=2;i<=numRows;i++){
            //storing cuurent value of triangle
            ArrayList<Integer> curr = new ArrayList<Integer>();
            curr.add(1); //first element is always 1 
            //next element of row
            for(int j=0;j<prev.size()-1;j++){
               curr.add(prev.get(j) + prev.get(j+1)); 
            }
            curr.add(1); // last element always 1
            //adding row to ans
            ans.add(curr); 
            //now new prev is assigned
            prev = curr;
        }
        return ans;
    }
}
