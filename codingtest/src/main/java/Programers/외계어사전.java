package Programers;

public class 외계어사전 {
    public static int solution(String[] spell, String[] dic) {
        int answer = 0;
        int count = 0;
        for(int i=0;i<dic.length;i++){
            for(int j=0;j< spell.length;j++) {
               if(dic[i].contains(spell[j])){
                   count++;
               };
            }
            if(count==spell.length)return 1;
        }
        return 2;
    }

}
