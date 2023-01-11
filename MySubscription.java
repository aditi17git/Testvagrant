import java.util.HashMap;
import java.util.Scanner;

public class MySubscription {
    private void Budget(int amount){
        HashMap<Integer,String> mainMap = new HashMap<>();
        mainMap.put(0,"TOI");
        mainMap.put(1,"Hindu");
        mainMap.put(2,"ET");
        mainMap.put(3,"BM");
        mainMap.put(4,"HT");
        HashMap<String,Float> map = new HashMap<>();
        map.put("TOI",26f);
        map.put("Hindu",20.5f);
        map.put("ET",34f);
        map.put("BM",10.5f);
        map.put("HT",18f);
        for(int i=0;i<map.size();i++){
            for(int j=i+1;j<map.size();j++){
                if((map.get(mainMap.get(i))+map.get(mainMap.get(j)))<=amount){
                    System.out.print("{"+mainMap.get(i)+","+mainMap.get(j)+"}");
                }
            }
        }
    }
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      MySubscription ms= new MySubscription();
      ms.Budget(n);
    }
}
