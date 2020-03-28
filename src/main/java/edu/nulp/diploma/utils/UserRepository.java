package edu.nulp.diploma.utils;

public class UserRepository {

    private static final String DPO_PROD = "dpoprod";
    private static final String DEFAULT_PASSWORD = "automationAvery";

    private UserRepository() {
    }
//
//    public static LoginModel getCspUserData(String target) {
//        LoginModel loginModel;
//        if (EndpointConstants.getEnvName().contains("test")) {
//            loginModel = new LoginModel("cs.admin@avery.com", "test123", "dpoustest");
//        } else if (target.contains("US")) {
//            loginModel = new LoginModel("us.contentmanager@outlook.com", "123456Avery", DPO_PROD);
//        } else if (target.contains("CA")) {
//            loginModel = new LoginModel("ca.contentmanager@outlook.com", "123456Avery", DPO_PROD);
//        } else {
//            loginModel = new LoginModel("test.cm.int.all@i.ua", "@very2017", DPO_PROD);
//        }
//        return loginModel;
//    }
//
//    public static LoginModel getDpoUserData(String target) {
//        LoginModel loginModel;
//        if (target.contains("us")) {
//            loginModel = new LoginModel("automation.us.prod@i.ua", DEFAULT_PASSWORD, "");
//        } else if (target.contains("ca")) {
//            loginModel = new LoginModel("automation.ca.prod@i.ua", DEFAULT_PASSWORD, "");
//        } else {
//            loginModel = new LoginModel("automation.int@i.ua", DEFAULT_PASSWORD, "");
//        }
//        return loginModel;
//    }
}
