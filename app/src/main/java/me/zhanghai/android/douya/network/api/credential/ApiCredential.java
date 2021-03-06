/*
 * Copyright (c) 2016 Zhang Hai <Dreaming.in.Code.ZH@Gmail.com>
 * All Rights Reserved.
 */

package me.zhanghai.android.douya.network.api.credential;

public final class ApiCredential {

    private ApiCredential() {}

    public static class Frodo {
        public static String KEY = ApiCredentialManager.getApiKey();
        public static String SECRET = ApiCredentialManager.getApiSecret();
    }

    public static class ApiV2 {
        public static String KEY = ApiCredentialManager.getApiKey();
        public static String SECRET = ApiCredentialManager.getApiSecret();
    }
}
