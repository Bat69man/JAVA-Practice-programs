
public class MissingValues {
    public String findMissingValues(String inputString){
        inputString = inputString.trim();
        if(inputString == "" || inputString.isEmpty()){
            return "";
        }
        
        String []tokens = inputString.split(" ");
        StringBuilder missingVals = new StringBuilder("");

        for(int i=Integer.parseInt(tokens[0]) ; i<tokens.length-1 ; i++){
            int value = Integer.parseInt(tokens[i]);
            if(value+1 != Integer.parseInt(tokens[i+1])){
                for(int j=value+1 ; j!=Integer.parseInt(tokens[i+1]) ; j++){
                    missingVals.append(j+" ");
                }
            }
        }
        return missingVals.toString();
    }
}