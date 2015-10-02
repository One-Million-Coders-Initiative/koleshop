package com.kolshop.kolshopmaterial.common.constant;

/**
 * Created by gundeepsingh on 17/08/14.
 */
public class Constants {

    //base url for server requests
    public static String BASE_URL = "http://192.168.1.4:8080/";

    //device type = 0 for Android Devices
    public static int DEVICE_TYPE = 0;

    //google project id
    public static String GOOGLE_PROJECT_ID = "210363682882";

    public static String SHOP_SETTINGS_PREFIX = "shop_settings_";

    public static String BUYER_SETTINGS_PREFIX = "buyer_settings_";

    public static int SHOPKEEPER_SESSION = 1;

    public static int BUYER_SESSION = 2;

    public static int USER_TYPE_SELLER = 1;
    public static int USER_TYPE_BUYER = 2;

    public static String SERVER_URL = "https://kol-server.appspot.com/_ah/api/"; //production url
    //public static String SERVER_URL = "10.0.3.2"; //local url

    // The authority for the sync adapter's content provider
    public static String AUTHORITY = "com.kolshop.kolshop.provider";
    // An account type, in the form of a domain name
    public static String ACCOUNT_TYPE = "com.kolshop.kolshop";
    // The account name
    public static String ACCOUNT = "dummyaccount_kolshop";
    // Instance fields
    public static String GOOGLE_USER_TOKEN = "google_user_token";

    //configurable constants
    public static boolean RESET_REALM = false;


    //Broadcast Actions
    public static final String ACTION_SIGN_UP = "action_sign_up";
    public static final String ACTION_SIGN_UP_COMPLETE = "action_sign_up_complete";
    public static final String ACTION_CHOOSE_SESSION_TYPE = "action_choose_session_type";
    public static final String ACTION_CHOOSE_SESSION_TYPE_COMPLETE = "action_choose_session_type_complete";
    public static final String ACTION_CHOOSE_SESSION_TYPE_FAILED = "action_choose_session_type_failed";
    public static final String ACTION_LOGIN = "action_login";
    public static final String ACTION_LOGIN_SUCCESS = "action_login_success";
    public static final String ACTION_LOGIN_INVALID_CREDENTIALS = "action_login_invalid_credentials";
    public static final String ACTION_LOGIN_FAILED = "action_login_failed";
    public static final String ACTION_NAVIGATION_ITEM_SELECTED = "action_navigation_item_selected";
    public static final String ACTION_PRODUCT_CATEGORIES_LOAD_SUCCESS = "action_product_categories_load_success";
    public static final String ACTION_PRODUCT_CATEGORIES_LOAD_FAILED = "action_product_categories_load_failed";
    public static final String ACTION_MEASURING_UNITS_LOAD_SUCCESS = "action_measuring_units_load_success";
    public static final String ACTION_MEASURING_UNITS_LOAD_FAILED = "action_measuring_units_load_failed";
    public static final String ACTION_ADD_VARIETY = "action_add_variety";
    public static final String ACTION_DELETE_VARIETY = "action_delete_variety";
    public static final String ACTION_PROPERTY_MODIFIED = "action_property_modified";
    public static final String ACTION_REQUEST_OTP = "action_request_otp";
    public static final String ACTION_REQUEST_OTP_SUCCESS = "action_request_otp_success";
    public static final String ACTION_REQUEST_OTP_FAILED = "action_request_otp_fail";
    public static final String ACTION_VERIFY_OTP = "action_verify_otp";
    public static final String ACTION_VERIFY_OTP_SUCCESS = "action_verify_otp_success";
    public static final String ACTION_VERIFY_OTP_FAILED = "action_verify_otp_fail";
    public static final String ACTION_OTP_RECEIVED = "action_otp_received";

    //Shared preferences keys
    public static final String KEY_SIGN_UP_STATUS = "key_sign_up_status";
    public static final String KEY_REG_ID = "registration_id";
    public static final String KEY_APP_VERSION = "appVersion";
    public static final String KEY_SESSION = "session";
    public static final String KEY_USER_TYPE = "pref_user_type";
    public static final String KEY_USER_PHONE = "pref_user_phone";

    //Preferences Flags
    public static final String FLAG_PRODUCT_CATEGORIES_LOADED = "product_categories_loaded";
    public static final String FLAG_MEASURING_UNITS_LOADED = "measuring_units_loaded";

    public static final String PRICE_PROPERTY_NAME = "price";

}
