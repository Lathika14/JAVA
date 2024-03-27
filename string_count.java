public class count {
    public static void main(String[] args){
        String string = "this code is easy";
        int count=0;
        for(int i=0;i<string.length();i++){
            if(string.charAt(i)!=' ')
                count++;
        }
        System.out.println(string);
        System.out.println(count);
    }
}
