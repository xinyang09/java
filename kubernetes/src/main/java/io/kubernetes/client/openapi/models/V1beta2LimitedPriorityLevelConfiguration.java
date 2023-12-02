/*
Copyright 2023 The Kubernetes Authors.
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
package io.kubernetes.client.openapi.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.kubernetes.client.openapi.models.V1beta2LimitResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * LimitedPriorityLevelConfiguration specifies how to handle requests that are subject to limits. It addresses two issues:   - How are requests for this priority level limited?   - What should be done with requests that exceed the limit?
 */
@ApiModel(description = "LimitedPriorityLevelConfiguration specifies how to handle requests that are subject to limits. It addresses two issues:   - How are requests for this priority level limited?   - What should be done with requests that exceed the limit?")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-01T19:05:21.333462Z[Etc/UTC]")
public class V1beta2LimitedPriorityLevelConfiguration {
  public static final String SERIALIZED_NAME_ASSURED_CONCURRENCY_SHARES = "assuredConcurrencyShares";
  @SerializedName(SERIALIZED_NAME_ASSURED_CONCURRENCY_SHARES)
  private Integer assuredConcurrencyShares;

  public static final String SERIALIZED_NAME_BORROWING_LIMIT_PERCENT = "borrowingLimitPercent";
  @SerializedName(SERIALIZED_NAME_BORROWING_LIMIT_PERCENT)
  private Integer borrowingLimitPercent;

  public static final String SERIALIZED_NAME_LENDABLE_PERCENT = "lendablePercent";
  @SerializedName(SERIALIZED_NAME_LENDABLE_PERCENT)
  private Integer lendablePercent;

  public static final String SERIALIZED_NAME_LIMIT_RESPONSE = "limitResponse";
  @SerializedName(SERIALIZED_NAME_LIMIT_RESPONSE)
  private V1beta2LimitResponse limitResponse;


  public V1beta2LimitedPriorityLevelConfiguration assuredConcurrencyShares(Integer assuredConcurrencyShares) {

    this.assuredConcurrencyShares = assuredConcurrencyShares;
    return this;
  }

   /**
   * &#x60;assuredConcurrencyShares&#x60; (ACS) configures the execution limit, which is a limit on the number of requests of this priority level that may be exeucting at a given time.  ACS must be a positive number. The server&#39;s concurrency limit (SCL) is divided among the concurrency-controlled priority levels in proportion to their assured concurrency shares. This produces the assured concurrency value (ACV) --- the number of requests that may be executing at a time --- for each such priority level:              ACV(l) &#x3D; ceil( SCL * ACS(l) / ( sum[priority levels k] ACS(k) ) )  bigger numbers of ACS mean more reserved concurrent requests (at the expense of every other PL). This field has a default value of 30.
   * @return assuredConcurrencyShares
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "`assuredConcurrencyShares` (ACS) configures the execution limit, which is a limit on the number of requests of this priority level that may be exeucting at a given time.  ACS must be a positive number. The server's concurrency limit (SCL) is divided among the concurrency-controlled priority levels in proportion to their assured concurrency shares. This produces the assured concurrency value (ACV) --- the number of requests that may be executing at a time --- for each such priority level:              ACV(l) = ceil( SCL * ACS(l) / ( sum[priority levels k] ACS(k) ) )  bigger numbers of ACS mean more reserved concurrent requests (at the expense of every other PL). This field has a default value of 30.")

  public Integer getAssuredConcurrencyShares() {
    return assuredConcurrencyShares;
  }


  public void setAssuredConcurrencyShares(Integer assuredConcurrencyShares) {
    this.assuredConcurrencyShares = assuredConcurrencyShares;
  }


  public V1beta2LimitedPriorityLevelConfiguration borrowingLimitPercent(Integer borrowingLimitPercent) {

    this.borrowingLimitPercent = borrowingLimitPercent;
    return this;
  }

   /**
   * &#x60;borrowingLimitPercent&#x60;, if present, configures a limit on how many seats this priority level can borrow from other priority levels. The limit is known as this level&#39;s BorrowingConcurrencyLimit (BorrowingCL) and is a limit on the total number of seats that this level may borrow at any one time. This field holds the ratio of that limit to the level&#39;s nominal concurrency limit. When this field is non-nil, it must hold a non-negative integer and the limit is calculated as follows.  BorrowingCL(i) &#x3D; round( NominalCL(i) * borrowingLimitPercent(i)/100.0 )  The value of this field can be more than 100, implying that this priority level can borrow a number of seats that is greater than its own nominal concurrency limit (NominalCL). When this field is left &#x60;nil&#x60;, the limit is effectively infinite.
   * @return borrowingLimitPercent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "`borrowingLimitPercent`, if present, configures a limit on how many seats this priority level can borrow from other priority levels. The limit is known as this level's BorrowingConcurrencyLimit (BorrowingCL) and is a limit on the total number of seats that this level may borrow at any one time. This field holds the ratio of that limit to the level's nominal concurrency limit. When this field is non-nil, it must hold a non-negative integer and the limit is calculated as follows.  BorrowingCL(i) = round( NominalCL(i) * borrowingLimitPercent(i)/100.0 )  The value of this field can be more than 100, implying that this priority level can borrow a number of seats that is greater than its own nominal concurrency limit (NominalCL). When this field is left `nil`, the limit is effectively infinite.")

  public Integer getBorrowingLimitPercent() {
    return borrowingLimitPercent;
  }


  public void setBorrowingLimitPercent(Integer borrowingLimitPercent) {
    this.borrowingLimitPercent = borrowingLimitPercent;
  }


  public V1beta2LimitedPriorityLevelConfiguration lendablePercent(Integer lendablePercent) {

    this.lendablePercent = lendablePercent;
    return this;
  }

   /**
   * &#x60;lendablePercent&#x60; prescribes the fraction of the level&#39;s NominalCL that can be borrowed by other priority levels. The value of this field must be between 0 and 100, inclusive, and it defaults to 0. The number of seats that other levels can borrow from this level, known as this level&#39;s LendableConcurrencyLimit (LendableCL), is defined as follows.  LendableCL(i) &#x3D; round( NominalCL(i) * lendablePercent(i)/100.0 )
   * @return lendablePercent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "`lendablePercent` prescribes the fraction of the level's NominalCL that can be borrowed by other priority levels. The value of this field must be between 0 and 100, inclusive, and it defaults to 0. The number of seats that other levels can borrow from this level, known as this level's LendableConcurrencyLimit (LendableCL), is defined as follows.  LendableCL(i) = round( NominalCL(i) * lendablePercent(i)/100.0 )")

  public Integer getLendablePercent() {
    return lendablePercent;
  }


  public void setLendablePercent(Integer lendablePercent) {
    this.lendablePercent = lendablePercent;
  }


  public V1beta2LimitedPriorityLevelConfiguration limitResponse(V1beta2LimitResponse limitResponse) {

    this.limitResponse = limitResponse;
    return this;
  }

   /**
   * Get limitResponse
   * @return limitResponse
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1beta2LimitResponse getLimitResponse() {
    return limitResponse;
  }


  public void setLimitResponse(V1beta2LimitResponse limitResponse) {
    this.limitResponse = limitResponse;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta2LimitedPriorityLevelConfiguration v1beta2LimitedPriorityLevelConfiguration = (V1beta2LimitedPriorityLevelConfiguration) o;
    return Objects.equals(this.assuredConcurrencyShares, v1beta2LimitedPriorityLevelConfiguration.assuredConcurrencyShares) &&
        Objects.equals(this.borrowingLimitPercent, v1beta2LimitedPriorityLevelConfiguration.borrowingLimitPercent) &&
        Objects.equals(this.lendablePercent, v1beta2LimitedPriorityLevelConfiguration.lendablePercent) &&
        Objects.equals(this.limitResponse, v1beta2LimitedPriorityLevelConfiguration.limitResponse);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assuredConcurrencyShares, borrowingLimitPercent, lendablePercent, limitResponse);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta2LimitedPriorityLevelConfiguration {\n");
    sb.append("    assuredConcurrencyShares: ").append(toIndentedString(assuredConcurrencyShares)).append("\n");
    sb.append("    borrowingLimitPercent: ").append(toIndentedString(borrowingLimitPercent)).append("\n");
    sb.append("    lendablePercent: ").append(toIndentedString(lendablePercent)).append("\n");
    sb.append("    limitResponse: ").append(toIndentedString(limitResponse)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
