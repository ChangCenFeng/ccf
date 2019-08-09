import java.util.ArrayList;
import java.util.List;

public class Data {

  public  static List<User> getData(){

      ArrayList<User> arrayList =new ArrayList<>();
      arrayList.add(  new User("11"));
      arrayList.add(  new User("12"));
      arrayList.add(  new User("13"));
      arrayList.add(  new User("14"));

      return  arrayList;
  }

}
