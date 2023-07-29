package com.example.carhatt.interfaces;

import org.json.JSONException;

public interface RequestHandler {
    public abstract void ProcessResponse(String response) throws JSONException;
}