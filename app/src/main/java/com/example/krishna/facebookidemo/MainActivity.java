package com.example.krishna.facebookidemo;

import android.support.v7.app.ActionBarActivity;


public class MainActivity extends ActionBarActivity {


//    // Your Facebook APP ID
//    private static String APP_ID = "308180782571605"; // Replace your App ID here
//
//    // Instance of Facebook Class
//    private Facebook facebook;
//    private AsyncFacebookRunner mAsyncRunner;
//    private String FILENAME = "AndroidSSO_data";
//    private SharedPreferences mPrefs;
//
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        facebook = new Facebook(APP_ID);
//        mAsyncRunner = new AsyncFacebookRunner(facebook);
//
//        findViewById(R.id.btn_facebook_login).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                performFacebookLogin();
//            }
//        });
//    }
//
//    public void loginToFacebook() {
//        mPrefs = getPreferences(MODE_PRIVATE);
//        String access_token = mPrefs.getString("access_token", null);
//        long expires = mPrefs.getLong("access_expires", 0);
//
//        if (access_token != null) {
//            facebook.setAccessToken(access_token);
//        }
//
//        if (expires != 0) {
//            facebook.setAccessExpires(expires);
//        }
//
//        if (!facebook.isSessionValid()) {
//            facebook.authorize(this,
//                    new String[]{"email", "publish_stream"},
//                    new Facebook.DialogListener() {
//
//                        @Override
//                        public void onCancel() {
//                            // Function to handle cancel event
//                        }
//
//                        @Override
//                        public void onComplete(Bundle values) {
//                            // Function to handle complete event
//                            // Edit Preferences and update facebook acess_token
//                            SharedPreferences.Editor editor = mPrefs.edit();
//                            editor.putString("access_token",
//                                    facebook.getAccessToken());
//                            editor.putLong("access_expires",
//                                    facebook.getAccessExpires());
//                            editor.commit();
//                        }
//
//                        @Override
//                        public void onError(DialogError error) {
//                            // Function to handle error
//
//                        }
//
//                        @Override
//                        public void onFacebookError(FacebookError fberror) {
//                            // Function to handle Facebook errors
//
//                        }
//
//                    });
//        }
//    }
//
//    public void getProfileInformation() {
//        mAsyncRunner.request("me", new AsyncFacebookRunner.RequestListener() {
//            @Override
//            public void onComplete(String response, Object state) {
//                Log.d("Profile", response);
//                String json = response;
//                try {
//                    JSONObject profile = new JSONObject(json);
//                    // getting name of the user
//                    final String name = profile.getString("name");
//                    // getting email of the user
//                    final String email = profile.getString("email");
//
//                    runOnUiThread(new Runnable() {
//
//                        @Override
//                        public void run() {
//                            Toast.makeText(getApplicationContext(), "Name: " + name + "\nEmail: " + email, Toast.LENGTH_LONG).show();
//                        }
//                    });
//
//                } catch (JSONException e) {
//                    e.printStackTrace();
//                }
//            }
//
//            @Override
//            public void onIOException(IOException e, Object state) {
//            }
//
//            @Override
//            public void onFileNotFoundException(FileNotFoundException e,
//                                                Object state) {
//            }
//
//            @Override
//            public void onMalformedURLException(MalformedURLException e,
//                                                Object state) {
//            }
//
//            @Override
//            public void onFacebookError(FacebookError e, Object state) {
//            }
//        });
//    }
//
//    public void logoutFromFacebook() {
//        mAsyncRunner.logout(this, new AsyncFacebookRunner.RequestListener() {
//            @Override
//            public void onComplete(String response, Object state) {
//                Log.d("Logout from Facebook", response);
//                if (Boolean.parseBoolean(response) == true) {
//                    // User successfully Logged out
//                }
//            }
//
//            @Override
//            public void onIOException(IOException e, Object state) {
//            }
//
//            @Override
//            public void onFileNotFoundException(FileNotFoundException e,
//                                                Object state) {
//            }
//
//            @Override
//            public void onMalformedURLException(MalformedURLException e,
//                                                Object state) {
//            }
//
//            @Override
//            public void onFacebookError(FacebookError e, Object state) {
//            }
//        });
//    }
//
//    boolean isFetching;
//
//    private void performFacebookLogin() {
//        Log.d("FACEBOOK", "performFacebookLogin");
//        final Session.NewPermissionsRequest newPermissionsRequest = new Session.NewPermissionsRequest(this, Arrays.asList("email"));
//        Session openActiveSession = Session.openActiveSession(this, true, new Session.StatusCallback() {
//            @Override
//            public void call(Session session, SessionState state, Exception exception) {
//                Log.d("FACEBOOK", "call");
//                if (session.isOpened() && !isFetching) {
//                    Log.d("FACEBOOK", "if (session.isOpened() && !isFetching)");
//                    isFetching = true;
//                    session.requestNewReadPermissions(newPermissionsRequest);
//                    Request getMe = Request.newMeRequest(session, new Request.GraphUserCallback() {
//                        @Override
//                        public void onCompleted(GraphUser user, Response response) {
//                            Log.d("FACEBOOK", "onCompleted");
//                            if (user != null) {
//                                Log.d("FACEBOOK", "user != null");
//                                org.json.JSONObject graphResponse = response.getGraphObject().getInnerJSONObject();
//                                String email = graphResponse.optString("email");
//                                String id = graphResponse.optString("id");
//                                String facebookName = user.getUsername();
//                                if (email == null || email.length() < 0) {
//                                    Toast.makeText(getApplicationContext(), "An email address is required for your account", Toast.LENGTH_SHORT).show();
//                                }
//                                return;
//                            }
//                        }
//                    });
//                    getMe.executeAsync();
//                } else {
//                    if (!session.isOpened())
//                        Log.d("FACEBOOK", "!session.isOpened()");
//                    else
//                        Log.d("FACEBOOK", "isFetching");
//
//                }
//            }
//        });
//    }
}
