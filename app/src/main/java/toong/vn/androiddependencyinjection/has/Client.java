package toong.vn.androiddependencyinjection.has;

/**
 * Created by PhanVanLinh on 13/03/2018.
 * phanvanlinh.94vn@gmail.com
 */

public class Client {
    Service service;

    public void setService(Service service) {
        this.service = service;
    }

    public void doSomeThingInClient() {
        Service service = new Service();
        service.doSomeThingInService();
    }
}
