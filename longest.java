import java.util.Map;
class longest{
    public static void main(String[] args){
        String str = "dvdf ";
        HashSet<Character> sub = new HashSet<>();

        String longest_till_now="";
        String longest_overall="";
        for(int i=0;i<str.length();i++){

            if(sub.contains(str.charAt(i))){
                longest_till_now="";
                sub.clear();
            }
            sub.add(str.charAt(i));
            longest_till_now+=str.charAt(i);

            if(longest_till_now.length()>longest_overall.length()){
                longest_overall=longest_till_now;
            }
        }
        System.out.println(longest_overall);

        
    }
}