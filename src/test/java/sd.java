import com.google.gson.Gson;

/**
 * @description:
 * @author: 1290274972@qq.com
 * @program: maven
 * @create: 2018-09-14 03:45
 * @version:
 **/
public class sd {

    public static void main(String[] args) {
        Gson gson = new Gson();
        String aBoolean = gson.toJson("boolean");
        System.out.println(aBoolean);
    }

}
