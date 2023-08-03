package practice.proxy;

import java.util.ArrayList;
import java.util.List;

class ProxyInternet implements Internet {


    private static List<String> bannedSites;

    static {
        bannedSites = new ArrayList<String>();
        bannedSites.add("whatever.com");
        bannedSites.add("nope.com");
        bannedSites.add("yup.com");
        bannedSites.add("hello.com");
    }

    @Override
    public void connectTo(String serverhost) throws Exception {

    }
}
