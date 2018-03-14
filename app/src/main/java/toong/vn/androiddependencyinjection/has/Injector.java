package toong.vn.androiddependencyinjection.has;

/**
 * Created by PhanVanLinh on 13/03/2018.
 * phanvanlinh.94vn@gmail.com
 */

public class Injector {
    public Service provideService(){
        return new Service();
    }
}
