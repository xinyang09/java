/*
 * Kubernetes
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1.21.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.cert.manager.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.cert.manager.models.V1ClusterIssuerSpecVaultAuthAppRoleSecretRef;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import io.kubernetes.client.openapi.JSON;

/**
 * AppRole authenticates with Vault using the App Role auth mechanism, with the role and secret stored in a Kubernetes Secret resource.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-01T07:00:20.132973Z[Etc/UTC]")
public class V1ClusterIssuerSpecVaultAuthAppRole {
  public static final String SERIALIZED_NAME_PATH = "path";
  @SerializedName(SERIALIZED_NAME_PATH)
  private String path;

  public static final String SERIALIZED_NAME_ROLE_ID = "roleId";
  @SerializedName(SERIALIZED_NAME_ROLE_ID)
  private String roleId;

  public static final String SERIALIZED_NAME_SECRET_REF = "secretRef";
  @SerializedName(SERIALIZED_NAME_SECRET_REF)
  private V1ClusterIssuerSpecVaultAuthAppRoleSecretRef secretRef;

  public V1ClusterIssuerSpecVaultAuthAppRole() {
  }

  public V1ClusterIssuerSpecVaultAuthAppRole path(String path) {
    
    this.path = path;
    return this;
  }

   /**
   * Path where the App Role authentication backend is mounted in Vault, e.g: \&quot;approle\&quot;
   * @return path
  **/
  @jakarta.annotation.Nonnull
  public String getPath() {
    return path;
  }


  public void setPath(String path) {
    this.path = path;
  }


  public V1ClusterIssuerSpecVaultAuthAppRole roleId(String roleId) {
    
    this.roleId = roleId;
    return this;
  }

   /**
   * RoleID configured in the App Role authentication backend when setting up the authentication backend in Vault.
   * @return roleId
  **/
  @jakarta.annotation.Nonnull
  public String getRoleId() {
    return roleId;
  }


  public void setRoleId(String roleId) {
    this.roleId = roleId;
  }


  public V1ClusterIssuerSpecVaultAuthAppRole secretRef(V1ClusterIssuerSpecVaultAuthAppRoleSecretRef secretRef) {
    
    this.secretRef = secretRef;
    return this;
  }

   /**
   * Get secretRef
   * @return secretRef
  **/
  @jakarta.annotation.Nonnull
  public V1ClusterIssuerSpecVaultAuthAppRoleSecretRef getSecretRef() {
    return secretRef;
  }


  public void setSecretRef(V1ClusterIssuerSpecVaultAuthAppRoleSecretRef secretRef) {
    this.secretRef = secretRef;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ClusterIssuerSpecVaultAuthAppRole v1ClusterIssuerSpecVaultAuthAppRole = (V1ClusterIssuerSpecVaultAuthAppRole) o;
    return Objects.equals(this.path, v1ClusterIssuerSpecVaultAuthAppRole.path) &&
        Objects.equals(this.roleId, v1ClusterIssuerSpecVaultAuthAppRole.roleId) &&
        Objects.equals(this.secretRef, v1ClusterIssuerSpecVaultAuthAppRole.secretRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(path, roleId, secretRef);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ClusterIssuerSpecVaultAuthAppRole {\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    roleId: ").append(toIndentedString(roleId)).append("\n");
    sb.append("    secretRef: ").append(toIndentedString(secretRef)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("path");
    openapiFields.add("roleId");
    openapiFields.add("secretRef");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("path");
    openapiRequiredFields.add("roleId");
    openapiRequiredFields.add("secretRef");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1ClusterIssuerSpecVaultAuthAppRole
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1ClusterIssuerSpecVaultAuthAppRole.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1ClusterIssuerSpecVaultAuthAppRole is not found in the empty JSON string", V1ClusterIssuerSpecVaultAuthAppRole.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1ClusterIssuerSpecVaultAuthAppRole.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1ClusterIssuerSpecVaultAuthAppRole` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1ClusterIssuerSpecVaultAuthAppRole.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("path").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `path` to be a primitive type in the JSON string but got `%s`", jsonObj.get("path").toString()));
      }
      if (!jsonObj.get("roleId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `roleId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("roleId").toString()));
      }
      // validate the required field `secretRef`
      V1ClusterIssuerSpecVaultAuthAppRoleSecretRef.validateJsonObject(jsonObj.getAsJsonObject("secretRef"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1ClusterIssuerSpecVaultAuthAppRole.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1ClusterIssuerSpecVaultAuthAppRole' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1ClusterIssuerSpecVaultAuthAppRole> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1ClusterIssuerSpecVaultAuthAppRole.class));

       return (TypeAdapter<T>) new TypeAdapter<V1ClusterIssuerSpecVaultAuthAppRole>() {
           @Override
           public void write(JsonWriter out, V1ClusterIssuerSpecVaultAuthAppRole value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1ClusterIssuerSpecVaultAuthAppRole read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1ClusterIssuerSpecVaultAuthAppRole given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1ClusterIssuerSpecVaultAuthAppRole
  * @throws IOException if the JSON string is invalid with respect to V1ClusterIssuerSpecVaultAuthAppRole
  */
  public static V1ClusterIssuerSpecVaultAuthAppRole fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1ClusterIssuerSpecVaultAuthAppRole.class);
  }

 /**
  * Convert an instance of V1ClusterIssuerSpecVaultAuthAppRole to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

