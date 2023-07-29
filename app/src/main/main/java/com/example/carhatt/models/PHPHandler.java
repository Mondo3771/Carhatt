package com.example.carhatt.models;

import android.app.Activity;
import android.widget.Toast;

import com.example.carhatt.interfaces.RequestHandler;

import org.json.JSONException;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.FormBody;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class PHPHandler {

    public void SignUp(Activity c, String user_email, String user_id, String user_cell, String username, String user_pwd, String cofirmPassword, RequestHandler requestHandler){
       String url= "https://lamp.ms.wits.ac.za/home/s2540381/signup.php";
        OkHttpClient client = new OkHttpClient();
        RequestBody requestBody = new FormBody.Builder()
                .add("user_email",user_email)
                .add("user_id", user_id)
                .add("user_cell", user_cell)
                .add("username", username)
                .add("user_pwd", user_pwd)
                .add("confirmPassword", cofirmPassword)
                .build();

        HttpUrl.Builder httpBuilder = HttpUrl.parse(url).newBuilder();
        Request request = new Request.Builder().url(httpBuilder.build()).post(requestBody).build();

        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
            }
            @Override
            public void onResponse(Call call, Response response) throws IOException {
                final String responseStr= response.body().string();
               c.runOnUiThread(new Runnable() {
                   @Override
                   public void run() {
                       try {
                           requestHandler.ProcessResponse(responseStr);
                       } catch (JSONException e) {
                           throw new RuntimeException(e);
                       }
                   }
               });
                System.out.println(responseStr);
            }
        });
    }

    public void Insertion3( String prefix,String parameter1, String parameter2,String parameter3 ,String entry1,String entry2, String entry3){
        String url= "https://lamp.ms.wits.ac.za/home/s2540381/" + prefix + ".php";
        OkHttpClient client = new OkHttpClient();
        RequestBody requestBody = new FormBody.Builder()
                .add(parameter1, entry1)
                .add(parameter2, entry2)
                .add(parameter3, entry3)
                //.add("phone", phone)
                .build();

        HttpUrl.Builder httpBuilder = HttpUrl.parse(url).newBuilder();
        Request request = new Request.Builder().url(httpBuilder.build()).post(requestBody).build();

        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
            }
            @Override
            public void onResponse(Call call, Response response) throws IOException {
                final String responseStr= response.body().string();
            }
        });
    }

    public void Select(Activity a,String prefix, RequestHandler requestHandler) {
        OkHttpClient client = new OkHttpClient();
        String url = "https://lamp.ms.wits.ac.za/home/s2540381/" + prefix + ".php";
        HttpUrl.Builder httpBuilder = HttpUrl.parse(url).newBuilder();
        Request request = new Request.Builder().url(httpBuilder.build()).build();

        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
            }
            @Override
            public void onResponse(Call call, Response response) throws IOException {
                final String responseStr = response.body().string();
                a.runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            requestHandler.ProcessResponse(responseStr);
                        } catch (JSONException e) {
                            throw new RuntimeException(e);
                        }
                    }
                });
            }


        });
}

    public void SelectWhere(Activity a,String prefix,  String parameter, String entry, RequestHandler requestHandler){
        OkHttpClient client = new OkHttpClient();
        String url = "https://lamp.ms.wits.ac.za/home/s2540381/" + prefix + ".php";
        RequestBody requestBody = new FormBody.Builder()
                .add(parameter, entry)
                .build();
        HttpUrl.Builder httpBuilder = HttpUrl.parse(url).newBuilder();
        Request request =new Request.Builder().url(httpBuilder.build()).post(requestBody).build();
        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                final String responseStr = response.body().string();
                a.runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            requestHandler.ProcessResponse(responseStr);
                        } catch (JSONException e) {
                            throw new RuntimeException(e);
                        }
                    }
                });
            }


        });
    }

    public void SelectWhere2(Activity a,String prefix,  String parameter1,String parameter2, String entry1,String entry2, RequestHandler requestHandler){
        OkHttpClient client = new OkHttpClient();
        String url = "https://lamp.ms.wits.ac.za/home/s2540381/" + prefix + ".php";
        RequestBody requestBody = new FormBody.Builder()
                .add(parameter1, entry1)
                .add(parameter2,entry2)
                .build();
        HttpUrl.Builder httpBuilder = HttpUrl.parse(url).newBuilder();
        Request request =new Request.Builder().url(httpBuilder.build()).post(requestBody).build();
        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                final String responseStr = response.body().string();
                a.runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            requestHandler.ProcessResponse(responseStr);
                        } catch (JSONException e) {
                            throw new RuntimeException(e);
                        }
                    }
                });
            }


        });
    }

    public void InsertionU(Activity a, String parameter1, String parameter2,String parameter3 , String parameter4, String parameter5,String email,String password, String confirpassword,String type,String counsellorname, RequestHandler rh){
        String url= "https://lamp.ms.wits.ac.za/home/s2540381/un.php";
        OkHttpClient client = new OkHttpClient();
        RequestBody requestBody = new FormBody.Builder()
                .add(parameter1, email)
                .add(parameter2, password)
                .add(parameter3, confirpassword)
                .add(parameter4,type)
                .add(parameter5,counsellorname)
                .build();

        HttpUrl.Builder httpBuilder = HttpUrl.parse(url).newBuilder();
        Request request = new Request.Builder().url(httpBuilder.build()).post(requestBody).build();

        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
            }
            @Override
            public void onResponse(Call call, Response response) throws IOException {
                final String responseStr = response.body().string();
                a.runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            rh.ProcessResponse(responseStr);
                        } catch (JSONException e) {
                            throw new RuntimeException(e);
                        }
                    }
                });
            };
    });
}
    public void SelectWhere3(Activity a,String prefix,  String parameter1,String parameter2, String parameter3, String entry1,String entry2,String entry3 ,RequestHandler requestHandler){
        OkHttpClient client = new OkHttpClient();
        String url = "https://lamp.ms.wits.ac.za/home/s2540381/" + prefix + ".php";
        RequestBody requestBody = new FormBody.Builder()
                .add(parameter1, entry1)
                .add(parameter2,entry2)
                .add(parameter3,entry3)


                .build();
        HttpUrl.Builder httpBuilder = HttpUrl.parse(url).newBuilder();
        Request request =new Request.Builder().url(httpBuilder.build()).post(requestBody).build();
        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                final String responseStr = response.body().string();
                a.runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            requestHandler.ProcessResponse(responseStr);
                        } catch (JSONException e) {
                            throw new RuntimeException(e);
                        }
                    }
                });
            }


        });
    }

    public void InsertMessage(Activity a,String conv_id, String message,String type,int convID, String text,String usertype, RequestHandler rh){
        String url= "https://lamp.ms.wits.ac.za/home/s2540381/insertMessage.php";
        OkHttpClient client = new OkHttpClient();
        RequestBody requestBody = new FormBody.Builder()
                .add(conv_id, String.valueOf(convID))
                .add(message, text)
                .add(type,usertype)
                .build();

        HttpUrl.Builder httpBuilder = HttpUrl.parse(url).newBuilder();
        Request request = new Request.Builder().url(httpBuilder.build()).post(requestBody).build();

        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                Toast.makeText(a.getApplicationContext(), "Failed to send message",Toast.LENGTH_SHORT).show();
            }
            @Override
            public void onResponse(Call call, Response response) throws IOException {
                final String responseStr= response.body().string();
            }
        });
    }

}
