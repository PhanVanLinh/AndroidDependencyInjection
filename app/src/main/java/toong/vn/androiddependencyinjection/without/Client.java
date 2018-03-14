package toong.vn.androiddependencyinjection.without;

/**
 * Created by PhanVanLinh on 13/03/2018.
 * phanvanlinh.94vn@gmail.com
 */

public class Client {

    public void doSomeThingInClient() {
        Service service = new Service();
        service.doSomeThingInService();
    }
}
