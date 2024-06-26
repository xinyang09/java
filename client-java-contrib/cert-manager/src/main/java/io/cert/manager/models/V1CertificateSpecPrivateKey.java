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
 * Private key options. These include the key algorithm and size, the used encoding and the rotation policy.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-01T07:00:20.132973Z[Etc/UTC]")
public class V1CertificateSpecPrivateKey {
  /**
   * Algorithm is the private key algorithm of the corresponding private key for this certificate.   If provided, allowed values are either &#x60;RSA&#x60;, &#x60;ECDSA&#x60; or &#x60;Ed25519&#x60;. If &#x60;algorithm&#x60; is specified and &#x60;size&#x60; is not provided, key size of 2048 will be used for &#x60;RSA&#x60; key algorithm and key size of 256 will be used for &#x60;ECDSA&#x60; key algorithm. key size is ignored when using the &#x60;Ed25519&#x60; key algorithm.
   */
  @JsonAdapter(AlgorithmEnum.Adapter.class)
  public enum AlgorithmEnum {
    RSA("RSA"),
    
    ECDSA("ECDSA"),
    
    ED25519("Ed25519");

    private String value;

    AlgorithmEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AlgorithmEnum fromValue(String value) {
      for (AlgorithmEnum b : AlgorithmEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<AlgorithmEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AlgorithmEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AlgorithmEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return AlgorithmEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ALGORITHM = "algorithm";
  @SerializedName(SERIALIZED_NAME_ALGORITHM)
  private AlgorithmEnum algorithm;

  /**
   * The private key cryptography standards (PKCS) encoding for this certificate&#39;s private key to be encoded in.   If provided, allowed values are &#x60;PKCS1&#x60; and &#x60;PKCS8&#x60; standing for PKCS#1 and PKCS#8, respectively. Defaults to &#x60;PKCS1&#x60; if not specified.
   */
  @JsonAdapter(EncodingEnum.Adapter.class)
  public enum EncodingEnum {
    PKCS1("PKCS1"),
    
    PKCS8("PKCS8");

    private String value;

    EncodingEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static EncodingEnum fromValue(String value) {
      for (EncodingEnum b : EncodingEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<EncodingEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final EncodingEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EncodingEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return EncodingEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ENCODING = "encoding";
  @SerializedName(SERIALIZED_NAME_ENCODING)
  private EncodingEnum encoding;

  /**
   * RotationPolicy controls how private keys should be regenerated when a re-issuance is being processed.   If set to &#x60;Never&#x60;, a private key will only be generated if one does not already exist in the target &#x60;spec.secretName&#x60;. If one does exists but it does not have the correct algorithm or size, a warning will be raised to await user intervention. If set to &#x60;Always&#x60;, a private key matching the specified requirements will be generated whenever a re-issuance occurs. Default is &#x60;Never&#x60; for backward compatibility.
   */
  @JsonAdapter(RotationPolicyEnum.Adapter.class)
  public enum RotationPolicyEnum {
    NEVER("Never"),
    
    ALWAYS("Always");

    private String value;

    RotationPolicyEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static RotationPolicyEnum fromValue(String value) {
      for (RotationPolicyEnum b : RotationPolicyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<RotationPolicyEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RotationPolicyEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RotationPolicyEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return RotationPolicyEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ROTATION_POLICY = "rotationPolicy";
  @SerializedName(SERIALIZED_NAME_ROTATION_POLICY)
  private RotationPolicyEnum rotationPolicy;

  public static final String SERIALIZED_NAME_SIZE = "size";
  @SerializedName(SERIALIZED_NAME_SIZE)
  private Integer size;

  public V1CertificateSpecPrivateKey() {
  }

  public V1CertificateSpecPrivateKey algorithm(AlgorithmEnum algorithm) {
    
    this.algorithm = algorithm;
    return this;
  }

   /**
   * Algorithm is the private key algorithm of the corresponding private key for this certificate.   If provided, allowed values are either &#x60;RSA&#x60;, &#x60;ECDSA&#x60; or &#x60;Ed25519&#x60;. If &#x60;algorithm&#x60; is specified and &#x60;size&#x60; is not provided, key size of 2048 will be used for &#x60;RSA&#x60; key algorithm and key size of 256 will be used for &#x60;ECDSA&#x60; key algorithm. key size is ignored when using the &#x60;Ed25519&#x60; key algorithm.
   * @return algorithm
  **/
  @jakarta.annotation.Nullable
  public AlgorithmEnum getAlgorithm() {
    return algorithm;
  }


  public void setAlgorithm(AlgorithmEnum algorithm) {
    this.algorithm = algorithm;
  }


  public V1CertificateSpecPrivateKey encoding(EncodingEnum encoding) {
    
    this.encoding = encoding;
    return this;
  }

   /**
   * The private key cryptography standards (PKCS) encoding for this certificate&#39;s private key to be encoded in.   If provided, allowed values are &#x60;PKCS1&#x60; and &#x60;PKCS8&#x60; standing for PKCS#1 and PKCS#8, respectively. Defaults to &#x60;PKCS1&#x60; if not specified.
   * @return encoding
  **/
  @jakarta.annotation.Nullable
  public EncodingEnum getEncoding() {
    return encoding;
  }


  public void setEncoding(EncodingEnum encoding) {
    this.encoding = encoding;
  }


  public V1CertificateSpecPrivateKey rotationPolicy(RotationPolicyEnum rotationPolicy) {
    
    this.rotationPolicy = rotationPolicy;
    return this;
  }

   /**
   * RotationPolicy controls how private keys should be regenerated when a re-issuance is being processed.   If set to &#x60;Never&#x60;, a private key will only be generated if one does not already exist in the target &#x60;spec.secretName&#x60;. If one does exists but it does not have the correct algorithm or size, a warning will be raised to await user intervention. If set to &#x60;Always&#x60;, a private key matching the specified requirements will be generated whenever a re-issuance occurs. Default is &#x60;Never&#x60; for backward compatibility.
   * @return rotationPolicy
  **/
  @jakarta.annotation.Nullable
  public RotationPolicyEnum getRotationPolicy() {
    return rotationPolicy;
  }


  public void setRotationPolicy(RotationPolicyEnum rotationPolicy) {
    this.rotationPolicy = rotationPolicy;
  }


  public V1CertificateSpecPrivateKey size(Integer size) {
    
    this.size = size;
    return this;
  }

   /**
   * Size is the key bit size of the corresponding private key for this certificate.   If &#x60;algorithm&#x60; is set to &#x60;RSA&#x60;, valid values are &#x60;2048&#x60;, &#x60;4096&#x60; or &#x60;8192&#x60;, and will default to &#x60;2048&#x60; if not specified. If &#x60;algorithm&#x60; is set to &#x60;ECDSA&#x60;, valid values are &#x60;256&#x60;, &#x60;384&#x60; or &#x60;521&#x60;, and will default to &#x60;256&#x60; if not specified. If &#x60;algorithm&#x60; is set to &#x60;Ed25519&#x60;, Size is ignored. No other values are allowed.
   * @return size
  **/
  @jakarta.annotation.Nullable
  public Integer getSize() {
    return size;
  }


  public void setSize(Integer size) {
    this.size = size;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1CertificateSpecPrivateKey v1CertificateSpecPrivateKey = (V1CertificateSpecPrivateKey) o;
    return Objects.equals(this.algorithm, v1CertificateSpecPrivateKey.algorithm) &&
        Objects.equals(this.encoding, v1CertificateSpecPrivateKey.encoding) &&
        Objects.equals(this.rotationPolicy, v1CertificateSpecPrivateKey.rotationPolicy) &&
        Objects.equals(this.size, v1CertificateSpecPrivateKey.size);
  }

  @Override
  public int hashCode() {
    return Objects.hash(algorithm, encoding, rotationPolicy, size);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1CertificateSpecPrivateKey {\n");
    sb.append("    algorithm: ").append(toIndentedString(algorithm)).append("\n");
    sb.append("    encoding: ").append(toIndentedString(encoding)).append("\n");
    sb.append("    rotationPolicy: ").append(toIndentedString(rotationPolicy)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
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
    openapiFields.add("algorithm");
    openapiFields.add("encoding");
    openapiFields.add("rotationPolicy");
    openapiFields.add("size");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1CertificateSpecPrivateKey
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1CertificateSpecPrivateKey.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1CertificateSpecPrivateKey is not found in the empty JSON string", V1CertificateSpecPrivateKey.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1CertificateSpecPrivateKey.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1CertificateSpecPrivateKey` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("algorithm") != null && !jsonObj.get("algorithm").isJsonNull()) && !jsonObj.get("algorithm").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `algorithm` to be a primitive type in the JSON string but got `%s`", jsonObj.get("algorithm").toString()));
      }
      if ((jsonObj.get("encoding") != null && !jsonObj.get("encoding").isJsonNull()) && !jsonObj.get("encoding").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `encoding` to be a primitive type in the JSON string but got `%s`", jsonObj.get("encoding").toString()));
      }
      if ((jsonObj.get("rotationPolicy") != null && !jsonObj.get("rotationPolicy").isJsonNull()) && !jsonObj.get("rotationPolicy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `rotationPolicy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("rotationPolicy").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1CertificateSpecPrivateKey.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1CertificateSpecPrivateKey' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1CertificateSpecPrivateKey> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1CertificateSpecPrivateKey.class));

       return (TypeAdapter<T>) new TypeAdapter<V1CertificateSpecPrivateKey>() {
           @Override
           public void write(JsonWriter out, V1CertificateSpecPrivateKey value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1CertificateSpecPrivateKey read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1CertificateSpecPrivateKey given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1CertificateSpecPrivateKey
  * @throws IOException if the JSON string is invalid with respect to V1CertificateSpecPrivateKey
  */
  public static V1CertificateSpecPrivateKey fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1CertificateSpecPrivateKey.class);
  }

 /**
  * Convert an instance of V1CertificateSpecPrivateKey to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

