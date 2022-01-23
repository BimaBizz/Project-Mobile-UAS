package com.onesignal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

class JSONUtils {
    JSONUtils() {
    }

    static JSONObject generateJsonDiff(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, Set<String> set) {
        JSONObject output;
        Object obj;
        Object obj2;
        JSONObject jSONObject4;
        JSONObject cur = jSONObject;
        JSONObject changedTo = jSONObject2;
        JSONObject baseOutput = jSONObject3;
        Set<String> includeFields = set;
        if (cur == null) {
            return null;
        }
        if (changedTo == null) {
            return baseOutput;
        }
        Iterator<String> keys = changedTo.keys();
        if (baseOutput != null) {
            output = baseOutput;
        } else {
            new JSONObject();
            output = jSONObject4;
        }
        while (keys.hasNext()) {
            try {
                String key = keys.next();
                Object value = changedTo.get(key);
                if (cur.has(key)) {
                    if (value instanceof JSONObject) {
                        JSONObject curValue = cur.getJSONObject(key);
                        JSONObject outValue = null;
                        if (baseOutput != null && baseOutput.has(key)) {
                            outValue = baseOutput.getJSONObject(key);
                        }
                        String returnedJsonStr = generateJsonDiff(curValue, (JSONObject) value, outValue, includeFields).toString();
                        if (!returnedJsonStr.equals("{}")) {
                            new JSONObject(returnedJsonStr);
                            JSONObject put = output.put(key, obj2);
                        }
                    } else if (value instanceof JSONArray) {
                        handleJsonArray(key, (JSONArray) value, cur.getJSONArray(key), output);
                    } else if (includeFields == null || !includeFields.contains(key)) {
                        Object curValue2 = cur.get(key);
                        if (!value.equals(curValue2)) {
                            if (!(curValue2 instanceof Integer) || "".equals(value)) {
                                JSONObject put2 = output.put(key, value);
                            } else if (((Number) curValue2).doubleValue() != ((Number) value).doubleValue()) {
                                JSONObject put3 = output.put(key, value);
                            }
                        }
                    } else {
                        JSONObject put4 = output.put(key, value);
                    }
                } else if (value instanceof JSONObject) {
                    new JSONObject(value.toString());
                    JSONObject put5 = output.put(key, obj);
                } else if (value instanceof JSONArray) {
                    handleJsonArray(key, (JSONArray) value, (JSONArray) null, output);
                } else {
                    JSONObject put6 = output.put(key, value);
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return output;
    }

    private static void handleJsonArray(String str, JSONArray jSONArray, JSONArray jSONArray2, JSONObject jSONObject) throws JSONException {
        JSONArray jSONArray3;
        JSONArray jSONArray4;
        StringBuilder sb;
        StringBuilder sb2;
        String key = str;
        JSONArray newArray = jSONArray;
        JSONArray curArray = jSONArray2;
        JSONObject output = jSONObject;
        if (key.endsWith("_a") || key.endsWith("_d")) {
            JSONObject put = output.put(key, newArray);
            return;
        }
        String arrayStr = toStringNE(newArray);
        new JSONArray();
        JSONArray newOutArray = jSONArray3;
        new JSONArray();
        JSONArray remOutArray = jSONArray4;
        String curArrayStr = curArray == null ? null : toStringNE(curArray);
        for (int i = 0; i < newArray.length(); i++) {
            String arrayValue = (String) newArray.get(i);
            if (curArray == null || !curArrayStr.contains(arrayValue)) {
                JSONArray put2 = newOutArray.put(arrayValue);
            }
        }
        if (curArray != null) {
            for (int i2 = 0; i2 < curArray.length(); i2++) {
                String arrayValue2 = curArray.getString(i2);
                if (!arrayStr.contains(arrayValue2)) {
                    JSONArray put3 = remOutArray.put(arrayValue2);
                }
            }
        }
        if (!newOutArray.toString().equals("[]")) {
            new StringBuilder();
            JSONObject put4 = output.put(sb2.append(key).append("_a").toString(), newOutArray);
        }
        if (!remOutArray.toString().equals("[]")) {
            new StringBuilder();
            JSONObject put5 = output.put(sb.append(key).append("_d").toString(), remOutArray);
        }
    }

    static String toStringNE(JSONArray jSONArray) {
        StringBuilder sb;
        StringBuilder sb2;
        JSONArray jsonArray = jSONArray;
        String strArray = "[";
        int i = 0;
        while (i < jsonArray.length()) {
            try {
                new StringBuilder();
                strArray = sb2.append(strArray).append("\"").append(jsonArray.getString(i)).append("\"").toString();
                i++;
            } catch (JSONException e) {
                JSONException jSONException = e;
            }
        }
        new StringBuilder();
        return sb.append(strArray).append("]").toString();
    }

    static JSONObject getJSONObjectWithoutBlankValues(ImmutableJSONObject immutableJSONObject, String str) {
        JSONObject jSONObject;
        ImmutableJSONObject jsonObject = immutableJSONObject;
        String getKey = str;
        if (!jsonObject.has(getKey)) {
            return null;
        }
        new JSONObject();
        JSONObject toReturn = jSONObject;
        JSONObject keyValues = jsonObject.optJSONObject(getKey);
        Iterator<String> keys = keyValues.keys();
        while (keys.hasNext()) {
            String key = keys.next();
            try {
                Object value = keyValues.get(key);
                if (!"".equals(value)) {
                    JSONObject put = toReturn.put(key, value);
                }
            } catch (JSONException e) {
                JSONException jSONException = e;
            }
        }
        return toReturn;
    }

    @Nullable
    static Map<String, Object> jsonObjectToMap(@Nullable JSONObject jSONObject) throws JSONException {
        JSONObject json = jSONObject;
        if (json == null || json == JSONObject.NULL) {
            return null;
        }
        return jsonObjectToMapNonNull(json);
    }

    @NonNull
    private static Map<String, Object> jsonObjectToMapNonNull(@NonNull JSONObject jSONObject) throws JSONException {
        Map<String, Object> map;
        JSONObject object = jSONObject;
        new HashMap();
        Map<String, Object> map2 = map;
        Iterator<String> keysItr = object.keys();
        while (keysItr.hasNext()) {
            String key = keysItr.next();
            Object put = map2.put(key, convertNestedJSONType(object.get(key)));
        }
        return map2;
    }

    @Nullable
    static List<Object> jsonArrayToList(@Nullable JSONArray jSONArray) throws JSONException {
        JSONArray array = jSONArray;
        if (array == null) {
            return null;
        }
        return jsonArrayToListNonNull(array);
    }

    @NonNull
    private static List<Object> jsonArrayToListNonNull(@NonNull JSONArray jSONArray) throws JSONException {
        List<Object> list;
        JSONArray array = jSONArray;
        new ArrayList();
        List<Object> list2 = list;
        for (int i = 0; i < array.length(); i++) {
            boolean add = list2.add(convertNestedJSONType(array.get(i)));
        }
        return list2;
    }

    @NonNull
    private static Object convertNestedJSONType(@NonNull Object obj) throws JSONException {
        Object value = obj;
        if (value instanceof JSONObject) {
            return jsonObjectToMapNonNull((JSONObject) value);
        }
        if (value instanceof JSONArray) {
            return jsonArrayToListNonNull((JSONArray) value);
        }
        return value;
    }

    static boolean compareJSONArrays(JSONArray jSONArray, JSONArray jSONArray2) {
        JSONArray jsonArray1 = jSONArray;
        JSONArray jsonArray2 = jSONArray2;
        if (jsonArray1 == null && jsonArray2 == null) {
            return true;
        }
        if (jsonArray1 == null || jsonArray2 == null) {
            return false;
        }
        if (jsonArray1.length() != jsonArray2.length()) {
            return false;
        }
        int i = 0;
        while (i < jsonArray1.length()) {
            try {
                int j = 0;
                while (j < jsonArray2.length()) {
                    if (normalizeType(jsonArray1.get(i)).equals(normalizeType(jsonArray2.get(j)))) {
                        i++;
                    } else {
                        j++;
                    }
                }
                return false;
            } catch (JSONException e) {
                e.printStackTrace();
                return false;
            }
        }
        return true;
    }

    public static Object normalizeType(Object obj) {
        Object object = obj;
        Class clazz = object.getClass();
        if (clazz.equals(Integer.class)) {
            return Long.valueOf((long) ((Integer) object).intValue());
        }
        if (clazz.equals(Float.class)) {
            return Double.valueOf((double) ((Float) object).floatValue());
        }
        return object;
    }
}
