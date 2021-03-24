package com.cttricks.UniqueID; 

import android.app.Activity;
import android.content.Context;
import com.google.appinventor.components.annotations.*;
import com.google.appinventor.components.common.*;
import com.google.appinventor.components.runtime.*;
import com.google.appinventor.components.runtime.util.*;
import java.io.*;


@SimpleObject(external = true)
@DesignerComponent(
	category = ComponentCategory.EXTENSION,
	description = "Using this extension you can generate unique User/Token/API/RefferCode etc. of desired length.<br>Author Ct tricks",
	nonVisible = true,
	iconName = "",
	version = 1
)

public final class UniqueID extends AndroidNonvisibleComponent {
    private ComponentContainer container;
    private Context context;
    private Activity activity;

    public UniqueID(ComponentContainer container) {
        super(container.$form());
        context = container.$context();
        activity = container.$context();
    }
	
	
	@SimpleFunction(description = "Create a unique string.")
    public String Create(int length) {
		int n = length;
		String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789abcdefghijklmnopqrstuvxyz";
    StringBuilder sb = new StringBuilder(n);
		for(int i=0; i<n; i++){
            int index = (int)(AlphaNumericString.length() * Math.random());
            sb.append(AlphaNumericString.charAt(index));
        }
        return sb.toString();
    }
	
}
