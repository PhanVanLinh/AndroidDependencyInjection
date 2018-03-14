package toong.vn.androiddependencyinjection.without;

/**
 * Created by PhanVanLinh on 13/03/2018.
 * phanvanlinh.94vn@gmail.com
 */

public class Client3 {
    Service service;

    public Client3() {
        service = new Service();
    }

    public void doSomeThingInClient() {
        service.doSomeThingInService();
    }
}
