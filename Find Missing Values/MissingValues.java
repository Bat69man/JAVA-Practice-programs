import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class MissingValues {
    
    private ArrayList<Integer> splitAndSortIntoArrayList(String inputString) throws IllegalArgumentException{
        StringTokenizer stringTokens = new StringTokenizer(inputString," ");
        ArrayList<Integer> intTokens = new ArrayList<Integer>();
        while(stringTokens.hasMoreTokens()){
            String tempToken = stringTokens.nextToken();
            if( !tempToken.matches("\\d+")){
                throw new IllegalArgumentException("Non Digit values are not allowed !");
            }
            intTokens.add(Integer.parseInt(tempToken));
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