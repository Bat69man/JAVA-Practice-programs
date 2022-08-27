import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class MissingValues {
    
    private ArrayList<Integer> splitAndSortIntoArrayList(String inputString){
        StringTokenizer stringTokens = new StringTokenizer(inputString," ");
        ArrayList<Integer> intTokens = new ArrayList<Integer>();
        while(stringTokens.hasMoreTokens()){
            intTokens.add(Integer.parseInt(stringTokens.nextToken()));
        }
        Collections.sort(intTokens);
        return intTokens;
    }
    
    public String findMissingValues(String inputString){
        ArrayList<Integer> tokens = splitAndSortIntoArrayList(inputString);
        StringBuilder missingVals = new StringBuilder("");
    
        for(int i=0 ; i<tokens.size()-1 ; i++){
            for(int j=tokens.get(i)+1 ; j<tokens.get(i+1) ; j++){
                missingVals.append(j+" ");
            }
        }
        return missingVals.toString().trim();
    }
}