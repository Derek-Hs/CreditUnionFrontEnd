package com.example.derek.creditunion;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.StringRequest;
//import com.cliq.cliq.controller.AppController;
//import com.cliq.cliq.controller.DataModelController;
//import com.cliq.cliq.model.Constants;
//import com.cliq.cliq.model.User;
//import com.cliq.cliq.views.HomeActivity;
//import com.sinch.android.rtc.SinchClient;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

//import cn.pedant.SweetAlert.SweetAlertDialog;

/**
 * Created by derek on 4/2/16.
 */
public class API_Manager {
    public void listUnions() {
        final JsonObjectRequest request = new JsonObjectRequest(Request.Method.GET, Constants.UNION_INDEX_API, null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject jsonObject) {
                System.out.println(jsonObject);
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError volleyError) {
                System.out.println(volleyError);
            }
        });
    }

}
