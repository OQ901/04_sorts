public class Sorts{
  public static ArrayList<Integer> sortInts(ArrayList<Integer> initSet){
      for (int x = initSet.size(); x > 1; x --){
        for (int y = 0; y < initSet.size() - 1; y ++){
          if (initSet.get(y) > arrayList.get(y + 1){
            int a = initSet.get(y);
            int b = initSet.get(y + 1);
            initSet.set(y, b);
            initSet.set(y + 1, a);
          
